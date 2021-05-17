//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package edu.java.millionaire.help;

/**
 * @author nsirbu
 * @since 17.05.2021
 */
public enum HelpOptionIndex {
  AUDIENCE_HELP('1'),
  FRIEND_HELP('2'),
  FIFTY_FIFTY_HELP('3');

  private final char value;

  HelpOptionIndex(char value) {
    this.value = value;
  }

  public final char getValue() {
    return value;
  }

  public static HelpOptionIndex fromChar(char index) {
    for (HelpOptionIndex enumValue : HelpOptionIndex.values()) {
      if (enumValue.value == index) {
        return enumValue;
      }
    }
    return null;
  }
}
