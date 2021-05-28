package edu.java.millionaire;

import edu.java.millionaire.help.HelpOption;
import edu.java.millionaire.help.HelpOptionIndex;
import edu.java.millionaire.help.HelpOptionProvider;
import edu.java.millionaire.io.MessagePrinter;
import edu.java.millionaire.io.UserAnswerProvider;
import edu.java.millionaire.question.Question;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class Game {

  private static final Logger logger = LogManager.getLogger(Game.class);

  public static final int MAX_LEVELS = 3;
  public final List<Character> helpOptionIndices;

  private int currentLevel = 1;
  private int currentScore = 0;
  private Question currentQuestion;

  public Game() {
    helpOptionIndices = initHelpOptionIndices();
  }

  public int getCurrentLevel() {
    return currentLevel;
  }

  public int getCurrentScore() {
    return currentScore;
  }

  public Question getCurrentQuestion() {
    return currentQuestion;
  }

  public void setCurrentQuestion(Question currentQuestion) {
    this.currentQuestion = currentQuestion;
  }

  public void addToCurrentScore(int valueToAdd) {
    currentScore += valueToAdd;
  }

  public void incrementLevel() {
    currentLevel++;
  }

  boolean hasAnsweredCorrectly(char userAnswer) {
    return currentQuestion.getCorrectAnswer().getSequence() == userAnswer;
  }

  boolean hasReachedLastLevel() {
    return currentLevel > MAX_LEVELS;
  }

  private List<Character> initHelpOptionIndices() {
    logger.info("Initializing help option indices...");
    List<Character> indices = new ArrayList<>();
    indices.add(HelpOptionIndex.AUDIENCE_HELP.getValue());
    indices.add(HelpOptionIndex.FRIEND_HELP.getValue());
    indices.add(HelpOptionIndex.FIFTY_FIFTY_HELP.getValue());
    logger.info("Initializing help option indices done.");
    return indices;
  }

  char invokeHelpOption(char userInput) {
    if (helpOptionIndices.contains(userInput)) {
      HelpOption helpOption = HelpOptionProvider.getHelpOptionForIndex(userInput);
      logger.info("Invoking HelpOption - {}...", helpOption.getClass().getSimpleName());
      if (!helpOption.isUsed()) {
        MessagePrinter.printHelpAnswers(currentQuestion.getText(), helpOption.getAnswers(getCurrentQuestion()));
      } else {
        logger.info(String.format("HelpOption[%s] has been already used!", helpOption.getClass().getSimpleName()));
      }

      userInput = UserAnswerProvider.getUserAnswer();
      if (helpOptionIndices.contains(userInput)) {
        return invokeHelpOption(userInput);
      }
    }
    return userInput;
  }
}
