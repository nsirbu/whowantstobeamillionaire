package edu.java.millionaire;

import java.util.Scanner;

/**
 * @author nsirbu
 * @since 12.04.2021
 */
public class UserAnswerProvider {

  static Scanner sc = new Scanner(System.in);

  static char getUserAnswer() {
    System.out.println("\nPlease choose an answer: ");
    System.out.print("> ");
    return sc.nextLine().charAt(0);
  }
}
