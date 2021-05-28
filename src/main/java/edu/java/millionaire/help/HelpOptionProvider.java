//*************************************************//
//          INTHER LOGISTICS ENGINEERING           //
//*************************************************//

package edu.java.millionaire.help;

/**
 * @author nsirbu
 * @since 14.05.2021
 */
public class HelpOptionProvider {

  private HelpOptionProvider() {
  }

  public static HelpOption getHelpOptionForIndex(char index) {
    switch (HelpOptionIndex.fromChar(index)) {
      case AUDIENCE_HELP:
        return AudienceHelp.getInstance();
      case FRIEND_HELP:
        return FriendHelp.getInstance();
      case FIFTY_FIFTY_HELP:
        return FiftyFiftyHelp.getInstance();
      default:
        throw new IllegalArgumentException("Unknown HelpOption type.");
    }
  }
}
