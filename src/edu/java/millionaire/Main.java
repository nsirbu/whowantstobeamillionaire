package edu.java.millionaire;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.QuestionProvider;

/**
 * @author nsirbu
 * @since 02.04.2021
 */
public class Main {

  public static void main(String[] args) {
    Game game = new Game();
    boolean answeredCorrectly = false;

    do {
      game.setCurrentQuestion(QuestionProvider.getRandomQuestionForLevel(game.getCurrentLevel()));
      game.printLevelInfo();
      char userInput = getUserInput(game);

      answeredCorrectly = game.hasAnsweredCorrectly(userInput);
      if (answeredCorrectly) {
        game.addToCurrentScore(game.getCurrentQuestion().getScore());
        game.incrementLevel();
      }

      game.printUserAnswerValidationMessage(answeredCorrectly);

      if (game.hasReachedLastLevel()) {
        break;
      }
    } while (answeredCorrectly);
  }

  private static char getUserInput(Game game) {
    char userInput = UserAnswerProvider.getUserAnswer();
    userInput = game.invokeHelpOption(userInput);

    while (!Answer.ANSWER_SEQUENCES.contains(userInput)) {
      userInput = getUserInput(game);
    }

    return userInput;
  }
}