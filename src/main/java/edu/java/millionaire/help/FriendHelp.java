package edu.java.millionaire.help;

import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class FriendHelp extends HelpOption {

  private static final Logger logger = LogManager.getLogger(FriendHelp.class);

  private static FriendHelp instance;

  private FriendHelp() {
  }

  public static FriendHelp getInstance() {
    if (instance == null) {
      instance = new FriendHelp();
    }

    return instance;
  }

  @Override
  List<AnswerHelp> determineHelpAnswers(Question question) {
    logger.info("Determining {} help options...", this.getClass().getSimpleName());
    List<AnswerHelp> helpAnswers = new ArrayList<>();
    helpAnswers.add(new AnswerHelp(question.getCorrectAnswer(), 100));
    logger.info("Help options determined.");
    return helpAnswers;
  }
}
