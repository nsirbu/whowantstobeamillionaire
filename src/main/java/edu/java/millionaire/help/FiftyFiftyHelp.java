package edu.java.millionaire.help;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class FiftyFiftyHelp extends HelpOption {

  private static final Logger logger = LogManager.getLogger(FiftyFiftyHelp.class);

  private static FiftyFiftyHelp instance;

  private FiftyFiftyHelp() {
  }

  public static FiftyFiftyHelp getInstance() {
    if (instance == null) {
      instance = new FiftyFiftyHelp();
    }

    return instance;
  }

  @Override
  List<AnswerHelp> determineHelpAnswers(Question question) {
    logger.info("Determining {} help options...", this.getClass().getSimpleName());
    Answer correctAnswer = question.getCorrectAnswer();
    List<Answer> wrongAnswers = question.getWrongAnswers();

    int randomIndex = randomizer.nextInt(wrongAnswers.size());
    Answer wrongAnswer = wrongAnswers.get(randomIndex);

    List<AnswerHelp> result = new ArrayList<>();
    result.add(new AnswerHelp(correctAnswer, 50));
    result.add(new AnswerHelp(wrongAnswer, 50));
    Collections.sort(result);
    logger.info("Help options determined.");
    return result;
  }
}
