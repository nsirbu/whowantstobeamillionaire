package edu.java.millionaire.question;

/**
 * @author nsirbu
 * @since 30.04.2021
 */
public class AnswerHelp implements Comparable<AnswerHelp> {

  private final Answer answer;
  private final double probability;

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

  @Override
  public int compareTo(AnswerHelp o) {
    return this.getAnswer().getSequence() > o.getAnswer().getSequence() ? 1 : -1;
  }
}
