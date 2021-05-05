package edu.java.millionaire.help;

import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public abstract class HelpOption {

  protected boolean isUsed;
  protected char index;
  protected Random randomizer;

  protected HelpOption() {
    randomizer = new Random();
  }

  public boolean isUsed() {
    return isUsed;
  }

  public char getIndex() {
    return index;
  }

  public void setUsed(boolean used) {
    isUsed = used;
  }

  public abstract ArrayList<AnswerHelp> getAnswers(Question question);
}
