package edu.java.millionaire.help;

import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class FriendHelp extends HelpOption {

  @Override
  public ArrayList<AnswerHelp> getAnswers(Question question) {
    ArrayList<AnswerHelp> helpAnswers = new ArrayList<>();
    helpAnswers.add(new AnswerHelp(question.getCorrectAnswer(), 100));
    return helpAnswers;
  }
}
