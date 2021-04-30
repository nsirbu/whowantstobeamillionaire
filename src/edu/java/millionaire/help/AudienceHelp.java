package edu.java.millionaire.help;

import edu.java.millionaire.question.Answer;
import edu.java.millionaire.question.AnswerHelp;
import edu.java.millionaire.question.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class AudienceHelp extends HelpOption {


  @Override
  public ArrayList<AnswerHelp> getAnswers(Question question) {
    int[] probabilities = getFourRandomNumbers();
    Arrays.sort(probabilities);
    ArrayList<AnswerHelp> helpAnswers = createHelpAnswers(question, probabilities);
    Collections.shuffle(helpAnswers);
    return helpAnswers;
  }

  private int[] getFourRandomNumbers() {
    Random rd = new Random();
    int probOne = rd.nextInt(100);
    int probTwo = rd.nextInt(100 - probOne);
    int probThree = rd.nextInt(100 - probOne - probTwo);
    int probFour = rd.nextInt(100 - probOne - probTwo - probThree);

    return new int[]{probOne, probTwo, probThree, probFour};
  }

  private ArrayList<AnswerHelp> createHelpAnswers(Question question, int[] probabilities) {
    ArrayList<AnswerHelp> helpAnswers = new ArrayList<>();
    helpAnswers.add(new AnswerHelp(question.getCorrectAnswer(), probabilities[3]));

    ArrayList<Answer> wrongAnswers = question.getWrongAnswers();
    helpAnswers.add(new AnswerHelp(wrongAnswers.get(0), probabilities[0]));
    helpAnswers.add(new AnswerHelp(wrongAnswers.get(1), probabilities[1]));
    helpAnswers.add(new AnswerHelp(wrongAnswers.get(2), probabilities[2]));

    return helpAnswers;
  }
}
