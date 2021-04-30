package edu.java.millionaire.help;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class FiftyFifty extends HelpOption {

  @Override
  public ArrayList<AnswerHelp> getAnswers(Question question) {
    Answer correctAnswer = question.getCorrectAnswer();
    ArrayList<Answer> wrongAnswers = question.getWrongAnswers();

    Random rd = new Random();
    int randomIndex = rd.nextInt(wrongAnswers.size());
    Answer wrongAnswer = wrongAnswers.get(randomIndex);

    ArrayList<AnswerHelp> result = new ArrayList<>();
    result.add(new AnswerHelp(correctAnswer, 50));
    result.add(new AnswerHelp(wrongAnswer, 50));
    Collections.shuffle(result);
    return result;
  }
}
