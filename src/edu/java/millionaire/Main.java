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
  static Question[] questionsForLevelThree;

  public static void main(String[] args) {
    initializeQuestionsForLevelOne();
    initializeQuestionsForLevelTwo();
    initializeQuestionsForLevelThree();

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
        case 3:
          currentQuestion = questionsForLevelThree[0];
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
    q1.text = "Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:";
    q1.level = 1;
    q1.score = 100;

    Answer answerOne = new Answer();
    answerOne.text = "stat";
    answerOne.sequence = 'a';

    Answer answerTwo = new Answer();
    answerTwo.text = "casă";
    answerTwo.sequence = 'b';
    answerTwo.isCorrect = true;

    Answer answerThree = new Answer();
    answerThree.text = "soare";
    answerThree.sequence = 'c';

    Answer answerFour = new Answer();
    answerFour.text = "viață";
    answerFour.sequence = 'd';

    q1.answers = new Answer[]{answerOne, answerTwo, answerThree, answerFour};

    Question q2 = new Question();
    q2.text = "Pe drapelul cărei ţări scrie motto-ul „Ordine şi progres”?";
    q2.level = 1;
    q2.score = 100;

    Answer answer1 = new Answer();
    answer1.text = "Australia";
    answer1.sequence = 'a';

    Answer answer2 = new Answer();
    answer2.text = "Brazilia";
    answer2.isCorrect = true;
    answer2.sequence = 'b';

    Answer answer3 = new Answer();
    answer3.text = "Africa de Sud";
    answer3.sequence = 'c';

    Answer answer4 = new Answer();
    answer4.text = "Indonezia";
    answer4.sequence = 'd';

    q2.answers = new Answer[]{answer1, answer2, answer3, answer4};

    Question q3 = new Question();
    q3.text = "Care dintre următoarele variante denumeşte un bici alcătuit din mai multe curele împletite?";
    q3.level = 1;
    q3.score = 100;

    Answer answer11 = new Answer();
    answer11.text = "gârbaci";
    answer11.isCorrect = true;
    answer11.sequence = 'a';

    Answer answer22 = new Answer();
    answer22.text = "gârliţă";
    answer22.sequence = 'b';

    Answer answer33 = new Answer();
    answer33.text = "gâză";
    answer33.sequence = 'c';

    Answer answer44 = new Answer();
    answer44.text = "gârniţă";
    answer44.sequence = 'd';

    q3.answers = new Answer[]{answer11, answer22, answer33, answer44};

    questionsForLevelOne = new Question[]{q1, q2, q3};
  }

  static void initializeQuestionsForLevelTwo() {
    Question q1 = new Question();
    q1.text = "Cu ce parte a unui computer este asociat brand-ul „Intel Inside”?";
    q1.level = 2;
    q1.score = 200;

    Answer answerOne = new Answer();
    answerOne.text = "BIOS";
    answerOne.sequence = 'a';

    Answer answerTwo = new Answer();
    answerTwo.text = "RAM";
    answerTwo.sequence = 'b';

    Answer answerThree = new Answer();
    answerThree.text = "USB";
    answerThree.sequence = 'c';

    Answer answerFour = new Answer();
    answerFour.text = "Procesor";
    answerFour.isCorrect = true;
    answerFour.sequence = 'd';

    q1.answers = new Answer[]{answerOne, answerTwo, answerThree, answerFour};

    Question q2 = new Question();
    q2.text = "Care dintre următoarele soiuri de struguri este folosit pentru a produce un celebru vin roşu?";
    q2.level = 2;
    q2.score = 200;

    Answer answer1 = new Answer();
    answer1.text = "Pinot Grigio";
    answer1.sequence = 'a';

    Answer answer2 = new Answer();
    answer2.text = "Riesling";
    answer2.sequence = 'b';

    Answer answer3 = new Answer();
    answer3.text = "Cabernet Sauvignon";
    answer3.isCorrect = true;
    answer3.sequence = 'c';

    Answer answer4 = new Answer();
    answer4.text = "Chardonnay";
    answer4.sequence = 'd';

    q2.answers = new Answer[]{answer1, answer2, answer3, answer4};

    Question q3 = new Question();
    q3.text = "Cum se numeşte pretinsa ştiinţă de a ghici viitorul după conformaţia norilor?";
    q3.level = 2;
    q3.score = 200;

    Answer answer11 = new Answer();
    answer11.text = "giromanţie";
    answer11.sequence = 'a';

    Answer answer22 = new Answer();
    answer22.text = "acromanţie";
    answer22.isCorrect = true;
    answer22.sequence = 'b';

    Answer answer33 = new Answer();
    answer33.text = "meteoromanţie";
    answer33.sequence = 'c';

    Answer answer44 = new Answer();
    answer44.text = "nefelomanţie";
    answer44.sequence = 'd';

    q3.answers = new Answer[]{answer11, answer22, answer33, answer44};

    questionsForLevelTwo = new Question[]{q1, q2, q3};
  }

  static void initializeQuestionsForLevelThree() {
    Question q1 = new Question();
    q1.text = "Care dintre următoarele oraşe este capitala Arabiei Saudite?";
    q1.level = 3;
    q1.score = 300;

    Answer answerOne = new Answer();
    answerOne.text = "Abu Dhabi";
    answerOne.sequence = 'a';

    Answer answerTwo = new Answer();
    answerTwo.text = "Manama";
    answerTwo.sequence = 'b';

    Answer answerThree = new Answer();
    answerThree.text = "Doha";
    answerThree.sequence = 'c';

    Answer answerFour = new Answer();
    answerFour.text = "Riyadh";
    answerFour.isCorrect = true;
    answerFour.sequence = 'd';

    q1.answers = new Answer[]{answerOne, answerTwo, answerThree, answerFour};

    Question q2 = new Question();
    q2.text = "Care dintre următorii oameni de știință nu are un element chimic care să-i poarte numele?";
    q2.level = 3;
    q2.score = 300;

    Answer answer1 = new Answer();
    answer1.text = "Albert Einstein";
    answer1.sequence = 'a';

    Answer answer2 = new Answer();
    answer2.text = "Niels Bohr";
    answer2.sequence = 'b';

    Answer answer3 = new Answer();
    answer3.text = "Isaac Newton";
    answer3.isCorrect = true;
    answer3.sequence = 'c';

    Answer answer4 = new Answer();
    answer4.text = "Enrico Fermi";
    answer4.sequence = 'd';

    q2.answers = new Answer[]{answer1, answer2, answer3, answer4};

    Question q3 = new Question();
    q3.text = "Ce insectă a scurtcircuitat unul dintre primele computere și a inspirat termenul de 'bug'?";
    q3.level = 3;
    q3.score = 300;

    Answer answer11 = new Answer();
    answer11.text = "Molie";
    answer11.sequence = 'a';
    answer11.isCorrect = true;

    Answer answer22 = new Answer();
    answer22.text = "Gândac de bucătărie";
    answer22.sequence = 'b';

    Answer answer33 = new Answer();
    answer33.text = "Muscă";
    answer33.sequence = 'c';

    Answer answer44 = new Answer();
    answer44.text = "Gândac japonez";
    answer44.sequence = 'd';

    q3.answers = new Answer[]{answer11, answer22, answer33, answer44};

    questionsForLevelThree = new Question[]{q1, q2, q3};
  }
}