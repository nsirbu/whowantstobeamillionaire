package edu.java.millionaire.help;

import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public abstract class HelpOption {

  protected boolean isUsed;

  public boolean isUsed() {
    return isUsed;
  }

  public void setUsed(boolean used) {
    isUsed = used;
  }

  public abstract ArrayList<AnswerHelp> getAnswers(Question question);
}
