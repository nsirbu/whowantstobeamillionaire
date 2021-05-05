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
      char userInput = UserAnswerProvider.getUserAnswer();
      game.invokeHelpOption(userInput);

      // TODO: check how to ask the user again in case of a wrong input
      while (!Answer.ANSWER_SEQUENCES.contains(userInput)) {
        userInput = UserAnswerProvider.getUserAnswer();
      }

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
}