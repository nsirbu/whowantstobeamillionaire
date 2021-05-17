package edu.java.millionaire.help;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class AudienceHelp extends HelpOption {

  private static AudienceHelp instance;

  private AudienceHelp() {
  }

  public static AudienceHelp getInstance() {
    if (instance == null) {
      instance = new AudienceHelp();
    }

    return instance;
  }

  @Override
  List<AnswerHelp> determineHelpAnswers(Question question) {
    List<Integer> probabilities = getFourRandomNumbers();
    Collections.sort(probabilities);
    List<AnswerHelp> helpAnswers = createHelpAnswers(question, probabilities);
    sortHelpAnswersBySequenceAsc(helpAnswers);
    return helpAnswers;
  }

  private List<Integer> getFourRandomNumbers() {
    int probOne = randomizer.nextInt(100);
    int probTwo = randomizer.nextInt(100 - probOne);
    int probThree = randomizer.nextInt(100 - probOne - probTwo);
    int probFour = randomizer.nextInt(100 - probOne - probTwo - probThree);

    return new ArrayList<>(Arrays.asList(probOne, probTwo, probThree, probFour));
  }

  private List<AnswerHelp> createHelpAnswers(Question question, List<Integer> probabilities) {
    List<AnswerHelp> helpAnswers = new ArrayList<>();
    helpAnswers.add(new AnswerHelp(question.getCorrectAnswer(), probabilities.get(3)));
    probabilities.remove(3);

    List<Answer> wrongAnswers = question.getWrongAnswers();
    for (int index = 0; index < 3; index++) {
      int randomPosition = randomizer.nextInt(probabilities.size());
      helpAnswers.add(new AnswerHelp(wrongAnswers.get(index), probabilities.get(randomPosition)));
      probabilities.remove(randomPosition);
    }

    return helpAnswers;
  }

  void sortHelpAnswersBySequenceAsc(List<AnswerHelp> helpAnswers) {
    Collections.sort(helpAnswers);
  }
}
