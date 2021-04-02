package edu.java.millionaire;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.Question;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 02.04.2021
 */
public class Main {

  static Question[] questionsForLevelOne;
  static Question[] questionsForLevelTwo;

  public static void main(String[] args) {
    initializeQuestionsForLevelOne();
    initializeQuestionsForLevelTwo();

    int currentScore = 0;
    int currentLevel = 1;
    Question currentQuestion;

    Scanner sc = new Scanner(System.in);
    char userInput;
    boolean answeredCorrectly = false;

    do {
      switch (currentLevel) {
        case 1:
          currentQuestion = questionsForLevelOne[0];
          break;
        case 2:
          currentQuestion = questionsForLevelTwo[0];
          break;
        default:
          currentQuestion = new Question();
      }

      System.out.println("\nLevel: " + currentLevel);
      System.out.println("Question: " + currentQuestion.text);
      System.out.println(currentQuestion.answers[0].sequence + ": " + currentQuestion.answers[0].text);
      System.out.println(currentQuestion.answers[1].sequence + ": " + currentQuestion.answers[1].text);
      System.out.println(currentQuestion.answers[2].sequence + ": " + currentQuestion.answers[2].text);
      System.out.println(currentQuestion.answers[3].sequence + ": " + currentQuestion.answers[3].text);

      System.out.print("\nPlease choose an answer: ");
      userInput = sc.nextLine().charAt(0);

      switch (userInput) {
        case 'a':
          if (currentQuestion.answers[0].isCorrect) {
            answeredCorrectly = true;
          }
          break;
        case 'b':
          if (currentQuestion.answers[1].isCorrect) {
            answeredCorrectly = true;
          }
          break;
        case 'c':
          if (currentQuestion.answers[2].isCorrect) {
            answeredCorrectly = true;
          }
          break;
        case 'd':
          if (currentQuestion.answers[3].isCorrect) {
            answeredCorrectly = true;
          }
          break;
      }

      if (answeredCorrectly) {
        currentScore += currentQuestion.score;
        currentLevel++;

        if (currentLevel > 2) {
          System.out.println("Congratulations! You won the game.");
          break;
        }

        System.out.println("That's correct.");
        System.out.println("Your current score: " + currentScore);
      } else {
        System.out.println("Wrong answer! Game over.");
      }
    } while (answeredCorrectly);
  }

  static void initializeQuestionsForLevelOne() {
    Question q1 = new Question();
    q1.text = "q1 text";
    q1.level = 1;
    q1.score = 100;

    Answer answerOne = new Answer();
    answerOne.text = "a1";
    answerOne.sequence = 'a';

    Answer answerTwo = new Answer();
    answerTwo.text = "a2";
    answerTwo.sequence = 'b';

    Answer answerThree = new Answer();
    answerThree.text = "a3";
    answerThree.sequence = 'c';

    Answer answerFour = new Answer();
    answerFour.text = "a4";
    answerFour.isCorrect = true;
    answerFour.sequence = 'd';

    q1.answers = new Answer[]{answerOne, answerTwo, answerThree, answerFour};

    Question q2 = new Question();
    q2.text = "q1 text";
    q2.level = 1;
    q2.score = 100;

    Answer answer1 = new Answer();
    answer1.text = "a1";
    answer1.sequence = 'a';

    Answer answer2 = new Answer();
    answer2.text = "a2";
    answer2.isCorrect = true;
    answer2.sequence = 'b';

    Answer answer3 = new Answer();
    answer3.text = "a3";
    answer3.sequence = 'c';

    Answer answer4 = new Answer();
    answer4.text = "a4";
    answer4.sequence = 'd';

    q2.answers = new Answer[]{answer1, answer2, answer3, answer4};

    questionsForLevelOne = new Question[]{q1, q2};
  }

  static void initializeQuestionsForLevelTwo() {
    Question q1 = new Question();
    q1.text = "q1 text";
    q1.level = 1;
    q1.score = 200;

    Answer answerOne = new Answer();
    answerOne.text = "a1";
    answerOne.sequence = 'a';

    Answer answerTwo = new Answer();
    answerTwo.text = "a2";
    answerTwo.sequence = 'b';

    Answer answerThree = new Answer();
    answerThree.text = "a3";
    answerThree.sequence = 'c';

    Answer answerFour = new Answer();
    answerFour.text = "a4";
    answerFour.isCorrect = true;
    answerFour.sequence = 'd';

    q1.answers = new Answer[]{answerOne, answerTwo, answerThree, answerFour};

    Question q2 = new Question();
    q2.text = "q1 text";
    q2.level = 1;
    q2.score = 200;

    Answer answer1 = new Answer();
    answer1.text = "a1";
    answer1.sequence = 'a';

    Answer answer2 = new Answer();
    answer2.text = "a2";
    answer2.isCorrect = true;
    answer2.sequence = 'b';

    Answer answer3 = new Answer();
    answer3.text = "a3";
    answer3.sequence = 'c';

    Answer answer4 = new Answer();
    answer4.text = "a4";
    answer4.sequence = 'd';

    q2.answers = new Answer[]{answer1, answer2, answer3, answer4};

    questionsForLevelTwo = new Question[]{q1, q2};
  }
}