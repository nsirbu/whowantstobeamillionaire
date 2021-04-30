package edu.java.millionaire.question;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class AnswerHelp {

  private Answer answer;
  private double probability;

  public AnswerHelp(Answer answer, double probability) {
    this.answer = answer;
    this.probability = probability;
  }

  public Answer getAnswer() {
    return answer;
  }

  public double getProbability() {
    return probability;
  }
}
