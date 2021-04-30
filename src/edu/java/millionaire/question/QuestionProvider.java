package edu.java.millionaire.question;

import java.util.Random;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class QuestionProvider {

  private static final int LEVEL_ONE_SCORE = 100;
  private static final int LEVEL_TWO_SCORE = 200;
  private static final int LEVEL_THREE_SCORE = 300;

  private static final int LEVEL_ONE = 1;
  private static final int LEVEL_TWO = 2;
  private static final int LEVEL_THREE = 3;

  private static final Question[] questionsForLevelOne = QuestionProvider.initializeQuestionsForLevelOne();
  private static final Question[] questionsForLevelTwo = QuestionProvider.initializeQuestionsForLevelTwo();
  private static final Question[] questionsForLevelThree = QuestionProvider.initializeQuestionsForLevelThree();

  private static final Random rd = new Random();

  private static Question[] initializeQuestionsForLevelOne() {
    Answer q1a1 = new Answer("stat");
    Answer q1a2 = new Answer("casă", true);
    Answer q1a3 = new Answer("soare");
    Answer q1a4 = new Answer("viață");
    Question q1 = new Question("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:",
                               LEVEL_ONE,
                               LEVEL_ONE_SCORE,
                               new Answer[]{q1a1, q1a2, q1a3, q1a4});

    Answer q2a1 = new Answer("Australia");
    Answer q2a2 = new Answer("Brazilia", true);
    Answer q2a3 = new Answer("Africa de Sud");
    Answer q2a4 = new Answer("Indonezia");
    Question q2 = new Question("Pe drapelul cărei ţări scrie motto-ul „Ordine şi progres”?",
                               LEVEL_ONE,
                               LEVEL_ONE_SCORE,
                               new Answer[]{q2a1, q2a2, q2a3, q2a4});

    Answer q3a1 = new Answer("gârbaci", true);
    Answer q3a2 = new Answer("gârliţă");
    Answer q3a3 = new Answer("gâză");
    Answer q4a4 = new Answer("gârniţă");
    Question q3 = new Question("Care dintre următoarele variante denumeşte un bici alcătuit din mai multe curele împletite?",
                               LEVEL_ONE,
                               LEVEL_ONE_SCORE,
                               new Answer[]{q3a1, q3a2, q3a3, q4a4});

    return new Question[]{q1, q2, q3};
  }

  private static Question[] initializeQuestionsForLevelTwo() {
    Answer q1a1 = new Answer("BIOS");
    Answer q1a2 = new Answer("RAM");
    Answer q1a3 = new Answer("USB");
    Answer q1a4 = new Answer("Procesor", true);
    Question q1 = new Question("Cu ce parte a unui computer este asociat brand-ul „Intel Inside”?",
                               LEVEL_TWO,
                               LEVEL_TWO_SCORE,
                               new Answer[]{q1a1, q1a2, q1a3, q1a4});

    Answer q2a1 = new Answer("Pinot Grigio");
    Answer q2a2 = new Answer("Riesling");
    Answer q2a3 = new Answer("Cabernet Sauvignon", true);
    Answer q2a4 = new Answer("Chardonnay");
    Question q2 = new Question("Care dintre următoarele soiuri de struguri este folosit pentru a produce un celebru vin roşu?",
                               LEVEL_TWO,
                               LEVEL_TWO_SCORE,
                               new Answer[]{q2a1, q2a2, q2a3, q2a4});

    Answer q3a1 = new Answer("giromanţie");
    Answer q3a2 = new Answer("acromanţie", true);
    Answer q3a3 = new Answer("meteoromanţie");
    Answer q3a4 = new Answer("nefelomanţie");
    Question q3 = new Question("Cum se numeşte pretinsa ştiinţă de a ghici viitorul după conformaţia norilor?",
                               LEVEL_TWO,
                               LEVEL_TWO_SCORE,
                               new Answer[]{q3a1, q3a2, q3a3, q3a4});

    return new Question[]{q1, q2, q3};
  }

  private static Question[] initializeQuestionsForLevelThree() {
    Answer q1a1 = new Answer("Abu Dhabi");
    Answer q1a2 = new Answer("Manama");
    Answer q1a3 = new Answer("Doha");
    Answer q1a4 = new Answer("Riyadh", true);
    Question q1 = new Question("Care dintre următoarele oraşe este capitala Arabiei Saudite?",
                               LEVEL_THREE,
                               LEVEL_THREE_SCORE,
                               new Answer[]{q1a1, q1a2, q1a3, q1a4});

    Answer q2a1 = new Answer("Albert Einstein");
    Answer q2a2 = new Answer("Niels Bohr");
    Answer q2a3 = new Answer("Isaac Newton", true);
    Answer q2a4 = new Answer("Enrico Fermi");
    Question q2 = new Question("Care dintre următorii oameni de știință nu are un element chimic care să-i poarte numele?",
                               LEVEL_THREE,
                               LEVEL_THREE_SCORE,
                               new Answer[]{q2a1, q2a2, q2a3, q2a4});

    Answer q3a1 = new Answer("Molie", true);
    Answer q3a2 = new Answer("Gândac de bucătărie");
    Answer q3a3 = new Answer("Muscă");
    Answer q3a4 = new Answer("Gândac japonez");
    Question q3 = new Question("Ce insectă a scurtcircuitat unul dintre primele computere și a inspirat termenul de 'bug'?",
                               LEVEL_THREE,
                               LEVEL_THREE_SCORE,
                               new Answer[]{q3a1, q3a2, q3a3, q3a4});

    return new Question[]{q1, q2, q3};
  }

  public static Question getRandomQuestionForLevel(int level) {
    switch (level) {
      case 1:
        return getRandomQuestionFromArray(questionsForLevelOne);
      case 2:
        return getRandomQuestionFromArray(questionsForLevelTwo);
      case 3:
        return getRandomQuestionFromArray(questionsForLevelThree);
      default:
        return null;
    }
  }

  private static Question getRandomQuestionFromArray(Question[] questions) {
    int randomIndex = rd.nextInt(questions.length);
    return questions[randomIndex];
  }
}
