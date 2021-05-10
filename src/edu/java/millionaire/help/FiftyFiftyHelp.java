package edu.java.millionaire.help;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class FiftyFiftyHelp extends HelpOption {

  public FiftyFiftyHelp() {
    index = '3';
  }

  @Override
  public ArrayList<AnswerHelp> getAnswers(Question question) {
    setUsed(true);

    Answer correctAnswer = question.getCorrectAnswer();
    ArrayList<Answer> wrongAnswers = question.getWrongAnswers();

    int randomIndex = randomizer.nextInt(wrongAnswers.size());
    Answer wrongAnswer = wrongAnswers.get(randomIndex);

    ArrayList<AnswerHelp> result = new ArrayList<>();
    result.add(new AnswerHelp(correctAnswer, 50));
    result.add(new AnswerHelp(wrongAnswer, 50));
    //TODO: Don't shuffle, order them by sequence using Collections.sort(list, Comparator).
    Collections.shuffle(result);
    return result;
  }
}
