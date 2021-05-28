package edu.java.millionaire.help;

import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.List;
import java.util.Random;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public abstract class HelpOption {

  protected boolean isUsed;
  protected Random randomizer;

  protected HelpOption() {
    randomizer = new Random();
  }

  public boolean isUsed() {
    return isUsed;
  }

  public void setUsed(boolean used) {
    isUsed = used;
  }

  public List<AnswerHelp> getAnswers(Question question) {
    setUsed(true);
    return determineHelpAnswers(question);
  }

  abstract List<AnswerHelp> determineHelpAnswers(Question question);
}
