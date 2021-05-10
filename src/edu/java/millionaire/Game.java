package edu.java.millionaire;

import edu.java.millionaire.help.AudienceHelp;
import edu.java.millionaire.help.FiftyFiftyHelp;
import edu.java.millionaire.help.FriendHelp;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class Game {

  public static final String TAB = "   ";
  public static final String DOUBLE_TAB = "      ";
  public static final int MAX_LEVELS = 3;
  public final ArrayList<Character> helpOptionIndices;

  private int currentLevel = 1;
  private int currentScore = 0;
  private Question currentQuestion;

  private final AudienceHelp audienceHelp;
  private final FriendHelp friendHelp;
  private final FiftyFiftyHelp fiftyFiftyHelp;

  public Game() {
    audienceHelp = new AudienceHelp();
    friendHelp = new FriendHelp();
    fiftyFiftyHelp = new FiftyFiftyHelp();
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

  // TODO: extract print methods into a separate class
  void printLevelInfo() {
    System.out.println("\n<<< Level: " + this.currentLevel + " >>>");
    printQuestionInfo();
    printHelpOptions();
  }

  void printQuestionInfo() {
    System.out.println("Question:");
    System.out.println(TAB + this.currentQuestion.getText());
    System.out.println(DOUBLE_TAB + this.currentQuestion.getAnswers()[0].getSequence() + ": " + this.currentQuestion.getAnswers()[0].getText());
    System.out.println(DOUBLE_TAB + this.currentQuestion.getAnswers()[1].getSequence() + ": " + this.currentQuestion.getAnswers()[1].getText());
    System.out.println(DOUBLE_TAB + this.currentQuestion.getAnswers()[2].getSequence() + ": " + this.currentQuestion.getAnswers()[2].getText());
    System.out.println(DOUBLE_TAB + this.currentQuestion.getAnswers()[3].getSequence() + ": " + this.currentQuestion.getAnswers()[3].getText());
  }

  void printHelpOptions() {
    // TODO: print also whether it is used or not
    System.out.println("\nHelp Options: (1) - Ask Audience   (2) - Phone a Friend   (3) - Remove Two Incorrect Answers");
  }

  void printHelpAnswers(ArrayList<AnswerHelp> helpAnswers) {
    System.out.println("Question:");
    System.out.println(TAB + currentQuestion.getText());
    for (AnswerHelp answerHelp : helpAnswers) {
      System.out.println(DOUBLE_TAB + answerHelp.getProbability() + " -> " + answerHelp.getAnswer().getSequence() + ": " + answerHelp.getAnswer().getText());
    }
  }

  boolean hasAnsweredCorrectly(char userAnswer) {
    return currentQuestion.getCorrectAnswer().getSequence() == userAnswer;
  }

  void printUserAnswerValidationMessage(boolean answeredCorrectly) {
    if (answeredCorrectly) {
      System.out.println("That's correct.");
      System.out.println("Your current score: " + currentScore);
    } else {
      System.out.println("Wrong answer! Game over.");
    }
  }

  boolean hasReachedLastLevel() {
    if (currentLevel > MAX_LEVELS) {
      System.out.println("Congratulations! You won the game.");
      return true;
    }

    return false;
  }

  private ArrayList<Character> initHelpOptionIndices() {
    ArrayList<Character> indices = new ArrayList<>();
    indices.add(audienceHelp.getIndex());
    indices.add(friendHelp.getIndex());
    indices.add(fiftyFiftyHelp.getIndex());
    return indices;
  }

  char invokeHelpOption(char userInput) {
    if (helpOptionIndices.contains(userInput)) {
      if (audienceHelp.getIndex() == userInput) {
        if (!audienceHelp.isUsed()) {
          printHelpAnswers(audienceHelp.getAnswers(getCurrentQuestion()));
        } else {
          System.out.println("AudienceHelp has been already used!");
        }
      } else if (friendHelp.getIndex() == userInput) {
        if (!friendHelp.isUsed()) {
          printHelpAnswers(friendHelp.getAnswers(getCurrentQuestion()));
        } else {
          System.out.println("FriendHelp has been already used!");
        }
      } else if (fiftyFiftyHelp.getIndex() == userInput) {
        if (!fiftyFiftyHelp.isUsed()) {
          printHelpAnswers(fiftyFiftyHelp.getAnswers(getCurrentQuestion()));
        } else {
          System.out.println("FiftyFiftyHelp has been already used!");
        }
      } else {
        System.out.println("Wrong input!");
      }

      userInput = UserAnswerProvider.getUserAnswer();
      if (helpOptionIndices.contains(userInput)) {
        return invokeHelpOption(userInput);
      }
    }
    return userInput;
  }
}
