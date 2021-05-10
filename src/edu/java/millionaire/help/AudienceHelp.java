package edu.java.millionaire.help;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class AudienceHelp extends HelpOption {

  public AudienceHelp() {
    index = '1';
  }

  @Override
  public ArrayList<AnswerHelp> getAnswers(Question question) {
    setUsed(true);

    ArrayList<Integer> probabilities = getFourRandomNumbers();
    Collections.sort(probabilities);
    ArrayList<AnswerHelp> helpAnswers = createHelpAnswers(question, probabilities);
    sortHelpAnswers(helpAnswers); // TODO: rename the method
    return helpAnswers;
  }

  private ArrayList<Integer> getFourRandomNumbers() {
    int probOne = randomizer.nextInt(100);
    int probTwo = randomizer.nextInt(100 - probOne);
    int probThree = randomizer.nextInt(100 - probOne - probTwo);
    int probFour = randomizer.nextInt(100 - probOne - probTwo - probThree);

    return new ArrayList<>(Arrays.asList(probOne, probTwo, probThree, probFour));
  }

  private ArrayList<AnswerHelp> createHelpAnswers(Question question, ArrayList<Integer> probabilities) {
    ArrayList<AnswerHelp> helpAnswers = new ArrayList<>();
    helpAnswers.add(new AnswerHelp(question.getCorrectAnswer(), probabilities.get(3)));
    probabilities.remove(3);

    ArrayList<Answer> wrongAnswers = question.getWrongAnswers();
    for (int index = 0; index < 3; index++) {
      int randomPosition = randomizer.nextInt(probabilities.size());
      helpAnswers.add(new AnswerHelp(wrongAnswers.get(index), probabilities.get(randomPosition)));
      probabilities.remove(randomPosition);
    }

    return helpAnswers;
  }

  void sortHelpAnswers(ArrayList<AnswerHelp> helpAnswers) {
    // TODO: Replace with Comparable interface
    Collections.sort(helpAnswers, new Comparator<AnswerHelp>() {
      @Override
      public int compare(AnswerHelp o1, AnswerHelp o2) {
        return o1.getAnswer().getSequence() > o2.getAnswer().getSequence() ? 1 : -1;
      }
    });
  }
}
