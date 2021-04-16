package edu.java.millionaire.question;

/**
 * @author nsirbu
 * @since 07.04.2021
 */
public class Answer {

  private String text;
  private boolean isCorrect;
  private char sequence;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public boolean isCorrect() {
    return isCorrect;
  }

  public void setCorrect(boolean correct) {
    isCorrect = correct;
  }

  public char getSequence() {
    return sequence;
  }

  public void setSequence(char sequence) {
    if (sequence != 'a' && sequence != 'b' && sequence != 'c' && sequence != 'd') {
      return;
    }

    this.sequence = sequence;
  }
}
