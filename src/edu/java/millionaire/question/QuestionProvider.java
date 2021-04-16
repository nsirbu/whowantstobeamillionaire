package edu.java.millionaire.question;

import java.util.Random;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class QuestionProvider {

  private static Question[] questionsForLevelOne = QuestionProvider.initializeQuestionsForLevelOne();
  private static Question[] questionsForLevelTwo = QuestionProvider.initializeQuestionsForLevelTwo();
  private static Question[] questionsForLevelThree = QuestionProvider.initializeQuestionsForLevelThree();

  private static Question[] initializeQuestionsForLevelOne() {
    Question q1 = new Question();
    q1.setText("Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:");
    q1.setLevel(1);
    q1.setScore(100);

    Answer q1a1 = new Answer();
    q1a1.setText("stat");
    q1a1.setSequence('a');

    Answer q1a2 = new Answer();
    q1a2.setText("casă");
    q1a2.setSequence('b');
    q1a2.setCorrect(true);

    Answer q1a3 = new Answer();
    q1a3.setText("soare");
    q1a3.setSequence('c');

    Answer q1a4 = new Answer();
    q1a4.setText("viață");
    q1a4.setSequence('d');

    q1.setAnswers(new Answer[]{q1a1, q1a2, q1a3, q1a4});

    Question q2 = new Question();
    q2.setText("Pe drapelul cărei ţări scrie motto-ul „Ordine şi progres”?");
    q2.setLevel(1);
    q2.setScore(100);

    Answer answer1 = new Answer();
    answer1.setText("Australia");
    answer1.setSequence('a');

    Answer answer2 = new Answer();
    answer2.setText("Brazilia");
    answer2.setCorrect(true);
    answer2.setSequence('b');

    Answer answer3 = new Answer();
    answer3.setText("Africa de Sud");
    answer3.setSequence('c');

    Answer answer4 = new Answer();
    answer4.setText("Indonezia");
    answer4.setSequence('d');

    q2.setAnswers(new Answer[]{answer1, answer2, answer3, answer4});

    Question q3 = new Question();
    q3.setText("Care dintre următoarele variante denumeşte un bici alcătuit din mai multe curele împletite?");
    q3.setLevel(1);
    q3.setScore(100);

    Answer answer11 = new Answer();
    answer11.setText("gârbaci");
    answer11.setCorrect(true);
    answer11.setSequence('a');

    Answer answer22 = new Answer();
    answer22.setText("gârliţă");
    answer22.setSequence('b');

    Answer answer33 = new Answer();
    answer33.setText("gâză");
    answer33.setSequence('c');

    Answer answer44 = new Answer();
    answer44.setText("gârniţă");
    answer44.setSequence('d');

    q3.setAnswers(new Answer[]{answer11, answer22, answer33, answer44});

    return new Question[]{q1, q2, q3};
  }

  private static Question[] initializeQuestionsForLevelTwo() {
    Question q1 = new Question();
    q1.setText("Cu ce parte a unui computer este asociat brand-ul „Intel Inside”?");
    q1.setLevel(2);
    q1.setScore(200);

    Answer answerOne = new Answer();
    answerOne.setText("BIOS");
    answerOne.setSequence('a');

    Answer answerTwo = new Answer();
    answerTwo.setText("RAM");
    answerTwo.setSequence('b');

    Answer answerThree = new Answer();
    answerThree.setText("USB");
    answerThree.setSequence('c');

    Answer answerFour = new Answer();
    answerFour.setText("Procesor");
    answerFour.setCorrect(true);
    answerFour.setSequence('d');

    q1.setAnswers(new Answer[]{answerOne, answerTwo, answerThree, answerFour});

    Question q2 = new Question();
    q2.setText("Care dintre următoarele soiuri de struguri este folosit pentru a produce un celebru vin roşu?");
    q2.setLevel(2);
    q2.setScore(200);

    Answer answer1 = new Answer();
    answer1.setText("Pinot Grigio");
    answer1.setSequence('a');

    Answer answer2 = new Answer();
    answer2.setText("Riesling");
    answer2.setSequence('b');

    Answer answer3 = new Answer();
    answer3.setText("Cabernet Sauvignon");
    answer3.setCorrect(true);
    answer3.setSequence('c');

    Answer answer4 = new Answer();
    answer4.setText("Chardonnay");
    answer4.setSequence('d');

    q2.setAnswers(new Answer[]{answer1, answer2, answer3, answer4});

    Question q3 = new Question();
    q3.setText("Cum se numeşte pretinsa ştiinţă de a ghici viitorul după conformaţia norilor?");
    q3.setLevel(2);
    q3.setScore(200);

    Answer answer11 = new Answer();
    answer11.setText("giromanţie");
    answer11.setSequence('a');

    Answer answer22 = new Answer();
    answer22.setText("acromanţie");
    answer22.setCorrect(true);
    answer22.setSequence('b');

    Answer answer33 = new Answer();
    answer33.setText("meteoromanţie");
    answer33.setSequence('c');

    Answer answer44 = new Answer();
    answer44.setText("nefelomanţie");
    answer44.setSequence('d');

    q3.setAnswers(new Answer[]{answer11, answer22, answer33, answer44});

    return new Question[]{q1, q2, q3};
  }

  private static Question[] initializeQuestionsForLevelThree() {
    Question q1 = new Question();
    q1.setText("Care dintre următoarele oraşe este capitala Arabiei Saudite?");
    q1.setLevel(3);
    q1.setScore(300);

    Answer answerOne = new Answer();
    answerOne.setText("Abu Dhabi");
    answerOne.setSequence('a');

    Answer answerTwo = new Answer();
    answerTwo.setText("Manama");
    answerTwo.setSequence('b');

    Answer answerThree = new Answer();
    answerThree.setText("Doha");
    answerThree.setSequence('c');

    Answer answerFour = new Answer();
    answerFour.setText("Riyadh");
    answerFour.setCorrect(true);
    answerFour.setSequence('d');

    q1.setAnswers(new Answer[]{answerOne, answerTwo, answerThree, answerFour});

    Question q2 = new Question();
    q2.setText("Care dintre următorii oameni de știință nu are un element chimic care să-i poarte numele?");
    q2.setLevel(3);
    q2.setScore(300);

    Answer answer1 = new Answer();
    answer1.setText("Albert Einstein");
    answer1.setSequence('a');

    Answer answer2 = new Answer();
    answer2.setText("Niels Bohr");
    answer2.setSequence('b');

    Answer answer3 = new Answer();
    answer3.setText("Isaac Newton");
    answer3.setCorrect(true);
    answer3.setSequence('c');

    Answer answer4 = new Answer();
    answer4.setText("Enrico Fermi");
    answer4.setSequence('d');

    q2.setAnswers(new Answer[]{answer1, answer2, answer3, answer4});

    Question q3 = new Question();
    q3.setText("Ce insectă a scurtcircuitat unul dintre primele computere și a inspirat termenul de 'bug'?");
    q3.setLevel(3);
    q3.setScore(300);

    Answer answer11 = new Answer();
    answer11.setText("Molie");
    answer11.setSequence('a');
    answer11.setCorrect(true);

    Answer answer22 = new Answer();
    answer22.setText("Gândac de bucătărie");
    answer22.setSequence('b');

    Answer answer33 = new Answer();
    answer33.setText("Muscă");
    answer33.setSequence('c');

    Answer answer44 = new Answer();
    answer44.setText("Gândac japonez");
    answer44.setSequence('d');

    q3.setAnswers(new Answer[]{answer11, answer22, answer33, answer44});

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
    Random rd = new Random();
    int questionIndex = rd.nextInt(questions.length);

    return questions[questionIndex];
  }
}
