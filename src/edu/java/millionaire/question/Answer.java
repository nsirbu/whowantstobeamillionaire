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
  private char sequence;

  public Answer(String text) {
    this.text = text;
  }

  public Answer(String text, boolean isCorrect) {
    this.text = text;
    this.isCorrect = isCorrect;
  }

  public Answer(String text, char sequence) {
    this.text = text;
    setSequence(sequence);
  }

  public Answer(String text, boolean isCorrect, char sequence) {
    this.text = text;
    this.isCorrect = isCorrect;
    setSequence(sequence);
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

  public final void setSequence(char sequence) {
    if (!containsSequence(sequence)) {
      throw new IllegalArgumentException(String.format("Got [%s]. Should be one of %s.", sequence, ANSWER_SEQUENCES));
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
