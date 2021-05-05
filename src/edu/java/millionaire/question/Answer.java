package edu.java.millionaire.question;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author nsirbu
 * @since 07.04.2021
 */
public class Answer {

  public static final ArrayList<Character> ANSWER_SEQUENCES = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd'));

  private String text;
  private boolean isCorrect;
  private char sequence;  // TODO: use the setter, make the setter final

  public Answer() {
    // TODO: do we need it?
  }

  public Answer(String text) {
    this.text = text;
  }

  public Answer(String text, boolean isCorrect) {
    this.text = text;
    this.isCorrect = isCorrect;
  }

  public Answer(String text, char sequence) {
    this.text = text;
    this.sequence = sequence;
  }

  public Answer(String text, boolean isCorrect, char sequence) {
    this.text = text;
    this.isCorrect = isCorrect;
    this.sequence = sequence;
  }

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
    if (!containsSequence(sequence)) {
      return;
    }

    this.sequence = sequence;
  }

  private boolean containsSequence(char sequence) {
    for (char item : ANSWER_SEQUENCES) {
      if (item == sequence) {
        return true;
      }
    }

    return false;
  }
}
