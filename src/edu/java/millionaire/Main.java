package edu.java.millionaire;

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
      game.currentQuestion = QuestionProvider.getRandomQuestionForLevel(game.currentLevel);
      game.printLevelInfo(game);
      char userInput = UserAnswerProvider.getUserAnswer();
      answeredCorrectly = game.hasAnsweredCorrectly(game.currentQuestion, userInput);
      game.printUserAnswerValidationMessage(game, answeredCorrectly);

      if (game.hasReachedLastLevel(game)) {
        break;
      }
    } while (answeredCorrectly);
  }
}