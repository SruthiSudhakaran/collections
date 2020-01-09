package section1;

import java.util.ArrayList;

public class PlayerBO {
void displayAllPlayerDetails(ArrayList<Player> playerList) {
    System.out.println("Player Details");
    for (Player player : playerList) {
        System.out.println(player);
    }
}
}
