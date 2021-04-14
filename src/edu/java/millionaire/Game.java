package edu.java.millionaire;

import edu.java.millionaire.question.Question;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class Game {
  int currentLevel = 1;
  int currentScore = 0;
  Question currentQuestion;

  void printLevelInfo(Game game) {
    System.out.println("\nLevel: " + game.currentLevel);
    System.out.println("Question: " + game.currentQuestion.text);
    System.out.println(game.currentQuestion.answers[0].sequence + ": " + game.currentQuestion.answers[0].text);
    System.out.println(game.currentQuestion.answers[1].sequence + ": " + game.currentQuestion.answers[1].text);
    System.out.println(game.currentQuestion.answers[2].sequence + ": " + game.currentQuestion.answers[2].text);
    System.out.println(game.currentQuestion.answers[3].sequence + ": " + game.currentQuestion.answers[3].text);
  }

  boolean hasAnsweredCorrectly(Question currentQuestion, char userAnswer) {
    switch (userAnswer) {
      case 'a':
        return currentQuestion.answers[0].isCorrect;
      case 'b':
        return currentQuestion.answers[1].isCorrect;
      case 'c':
        return currentQuestion.answers[2].isCorrect;
      case 'd':
        return currentQuestion.answers[3].isCorrect;
      default:
        return false;
    }
  }

  void printUserAnswerValidationMessage(Game game, boolean answeredCorrectly) {
    if (answeredCorrectly) {
      game.currentScore += game.currentQuestion.score;
      game.currentLevel++;
      System.out.println("That's correct.");
      System.out.println("Your current score: " + game.currentScore);
    } else {
      System.out.println("Wrong answer! Game over.");
    }
  }

  boolean hasReachedLastLevel(Game game) {
    if (game.currentLevel > 3) {
      System.out.println("Congratulations! You won the game.");
      return true;
    }

    return false;
  }
}
