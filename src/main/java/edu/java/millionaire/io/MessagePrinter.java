//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package edu.java.millionaire.io;

import edu.java.millionaire.Game;
import edu.java.millionaire.question.AnswerHelp;

import java.util.List;

/**
 * @author nsirbu
 * @since 14.05.2021
 */
public class MessagePrinter {

  public static final String TAB = "   ";
  public static final String DOUBLE_TAB = "      ";

  public static void printLevelInfo(Game game) {
    System.out.println("\n<<< Level: " + game.getCurrentLevel() + " >>>");
    printQuestionInfo(game);
    printHelpOptions();
  }

  static void printQuestionInfo(Game game) {
    System.out.println("Question:");
    System.out.println(TAB + game.getCurrentQuestion().getText());
    System.out.println(DOUBLE_TAB + game.getCurrentQuestion().getAnswers()[0].getSequence() + ": " + game.getCurrentQuestion().getAnswers()[0].getText());
    System.out.println(DOUBLE_TAB + game.getCurrentQuestion().getAnswers()[1].getSequence() + ": " + game.getCurrentQuestion().getAnswers()[1].getText());
    System.out.println(DOUBLE_TAB + game.getCurrentQuestion().getAnswers()[2].getSequence() + ": " + game.getCurrentQuestion().getAnswers()[2].getText());
    System.out.println(DOUBLE_TAB + game.getCurrentQuestion().getAnswers()[3].getSequence() + ": " + game.getCurrentQuestion().getAnswers()[3].getText());
  }

  static void printHelpOptions() {
    // TODO: print also whether it is used or not
    System.out.println("\nHelp Options: (1) - Ask Audience   (2) - Phone a Friend   (3) - Remove Two Incorrect Answers");
  }

  public static void printHelpAnswers(String questionText, List<AnswerHelp> helpAnswers) {
    System.out.println("Question:");
    System.out.println(TAB + questionText);
    for (AnswerHelp answerHelp : helpAnswers) {
      System.out.println(DOUBLE_TAB + answerHelp.getProbability() + " -> " + answerHelp.getAnswer().getSequence() + ": " + answerHelp.getAnswer().getText());
    }
  }

  public static void printUserAnswerValidationMessage(int currentScore, boolean answeredCorrectly) {
    if (answeredCorrectly) {
      System.out.println("That's correct.");
      System.out.println("Your current score: " + currentScore);
    } else {
      System.out.println("Wrong answer! Game over.");
    }
  }

  public static void printCongratulationMessage() {
    System.out.println("Congratulations! You won the game.");
  }
}
