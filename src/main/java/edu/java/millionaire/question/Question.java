package edu.java.millionaire.question;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 07.04.2021
 */
public class Question {

  private static final Logger logger = LogManager.getLogger(Question.class);

  private String text;
  private int level;
  private int score;
  private Answer[] answers;

  public Question(String text, int level, int score, Answer[] answers) {
    this.text = text;
    setLevel(level);
    setScore(score);
    setAnswers(answers);
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    if (level <= 0) {
      throw new IllegalArgumentException("Game level must be higher than 0 (zero).");
    }

    this.level = level;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    if (score < 0) {
      String err = "Game score must be higher than 0 (zero).";
      logger.error(err);
      throw new IllegalArgumentException(err);
    }

    this.score = score;
  }

  public Answer[] getAnswers() {
    return answers;
  }

  public void setAnswers(Answer[] answers) {
    if (answers.length != 4) {
      String err = String.format("Got [%s] answers. Expecting exactly 4 answers.", answers.length);
      logger.error(err);
      throw new IllegalArgumentException(err);
    }

    if (!hasOnlyOneCorrectAnswer(answers)) {
      String err = "The provided list of answers contains none or several correct answers. Expecting exactly one correct answer.";
      logger.error(err);
      throw new IllegalArgumentException(err);
    }

    this.answers = answers;
    initAnswerSequences();
  }

  /**
   * Checks whether the provided array has only one correct answer.
   *
   * @param answers the array of answers to validate.
   * @return <code>true</code> if the array contains only one correct answer, <code>false</code> otherwise.
   */
  private boolean hasOnlyOneCorrectAnswer(Answer[] answers) {
    int correctAnswers = 0;
    for (Answer answer : answers) {
      if (answer.isCorrect()) {
        correctAnswers++;
      }
    }

    return correctAnswers == 1;
  }

  public Answer getCorrectAnswer() {
    for (Answer answer : answers) {
      if (answer.isCorrect()) {
        return answer;
      }
    }

    logger.warn("Could not find any correct answer for Question[{}].", text);
    return null;
  }

  public List<Answer> getWrongAnswers() {
    List<Answer> wrongAnswers = new ArrayList<>();
    for (Answer answer : answers) {
      if (!answer.isCorrect()) {
        wrongAnswers.add(answer);
      }
    }

    return wrongAnswers;
  }

  private void initAnswerSequences() {
    for (int index = 0; index < Answer.ANSWER_SEQUENCES.size(); index++) {
      answers[index].setSequence(Answer.ANSWER_SEQUENCES.get(index));
    }
  }
}
