package edu.java.millionaire.io;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class UserAnswerProvider {

  static Scanner sc = new Scanner(System.in);

  public static char getUserAnswer() {
    System.out.println("\nPlease choose an answer: ");
    System.out.print("> ");
    return sc.nextLine().charAt(0);
  }
}
