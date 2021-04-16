package edu.java.millionaire.question;

/**
 * @author nsirbu
 * @since 07.04.2021
 */
public class Question {

  private String text;
  private int level;
  private int score;
  private Answer[] answers;

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
}
