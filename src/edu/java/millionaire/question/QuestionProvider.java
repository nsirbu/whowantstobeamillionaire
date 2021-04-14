package edu.java.millionaire.question;

import java.util.Random;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class QuestionProvider {

  static Question[] questionsForLevelOne = QuestionProvider.initializeQuestionsForLevelOne();
  static Question[] questionsForLevelTwo = QuestionProvider.initializeQuestionsForLevelTwo();
  static Question[] questionsForLevelThree = QuestionProvider.initializeQuestionsForLevelThree();

  public static Question[] initializeQuestionsForLevelOne() {
    Question q1 = new Question();
    q1.text = "Prefixul „eco” vine de la un cuvânt grecesc care înseamnă:";
    q1.level = 1;
    q1.score = 100;

    Answer q1a1 = new Answer();
    q1a1.text = "stat";
    q1a1.sequence = 'a';

    Answer q1a2 = new Answer();
    q1a2.text = "casă";
    q1a2.sequence = 'b';
    q1a2.isCorrect = true;

    Answer q1a3 = new Answer();
    q1a3.text = "soare";
    q1a3.sequence = 'c';

    Answer q1a4 = new Answer();
    q1a4.text = "viață";
    q1a4.sequence = 'd';

    q1.answers = new Answer[]{q1a1, q1a2, q1a3, q1a4};

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

    return new Question[]{q1, q2, q3};
  }

  public static Question[] initializeQuestionsForLevelTwo() {
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

    return new Question[]{q1, q2, q3};
  }

  public static Question[] initializeQuestionsForLevelThree() {
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

  static Question getRandomQuestionFromArray(Question[] questions) {
    Random rd = new Random();
    int questionIndex = rd.nextInt(questions.length);

    return questions[questionIndex];
  }
}
