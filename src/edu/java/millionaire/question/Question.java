package edu.java.millionaire.question;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 07.04.2021
 */
public class Question {

  private String text;
  private int level;
  private int score;
  private Answer[] answers;

  public Question() {
  }

  public Question(String text, int level, int score, Answer[] answers) {
    this.text = text;
    this.level = level;
    this.score = score;
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
    if (level > 0) {
      this.level = level;
    }
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    if (score > 0) {
      this.score = score;
    }
  }

  public Answer[] getAnswers() {
    return answers;
  }

  public void setAnswers(Answer[] answers) {
    if (answers.length == 4 && hasOnlyOneCorrectAnswer(answers)) {
      this.answers = answers;
      initAnswerSequences();
    }
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

    return null;
  }

  public ArrayList<Answer> getWrongAnswers() {
    ArrayList<Answer> wrongAnswers = new ArrayList<>();
    for (Answer answer : answers) {
      if (!answer.isCorrect()) {
        wrongAnswers.add(answer);
      }
    }

    return wrongAnswers;
  }

  private void initAnswerSequences() {
    for (int index = 0; index < Answer.ANSWER_SEQUENCES.length; index++) {
      answers[index].setSequence(Answer.ANSWER_SEQUENCES[index]);
    }
  }
}
