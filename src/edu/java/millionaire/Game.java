package edu.java.millionaire;

import edu.java.millionaire.question.Question;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class Game {

  public static final int MAX_LEVELS = 3;

  private int currentLevel = 1;
  private int currentScore = 0;
  private Question currentQuestion;

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

  void printLevelInfo(Game game) {
    System.out.println("\nLevel: " + game.currentLevel);
    System.out.println("Question: " + game.currentQuestion.getText());
    System.out.println(game.currentQuestion.getAnswers()[0].getSequence() + ": " + game.currentQuestion.getAnswers()[0].getText());
    System.out.println(game.currentQuestion.getAnswers()[1].getSequence() + ": " + game.currentQuestion.getAnswers()[1].getText());
    System.out.println(game.currentQuestion.getAnswers()[2].getSequence() + ": " + game.currentQuestion.getAnswers()[2].getText());
    System.out.println(game.currentQuestion.getAnswers()[3].getSequence() + ": " + game.currentQuestion.getAnswers()[3].getText());
  }

  boolean hasAnsweredCorrectly(Question currentQuestion, char userAnswer) {
    return currentQuestion.getCorrectAnswer().getSequence() == userAnswer;
  }

  void printUserAnswerValidationMessage(Game game, boolean answeredCorrectly) {
    if (answeredCorrectly) {
      System.out.println("That's correct.");
      System.out.println("Your current score: " + game.currentScore);
    } else {
      System.out.println("Wrong answer! Game over.");
    }
  }

  boolean hasReachedLastLevel(Game game) {
    if (game.currentLevel > MAX_LEVELS) {
      System.out.println("Congratulations! You won the game.");
      return true;
    }

    return false;
  }
}
