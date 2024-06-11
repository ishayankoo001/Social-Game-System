import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Universe universe = new Universe(new Player[0], 3);
        Player player1 = new Player("Player1", universe);
        Player player2 = new Player("Player2", universe);
        Player player3 = new Player("Player3", universe);
        AcquaintanceArray acquaintanceArray = AcquaintanceArray.createAcquaintanceArray("{(Player1, 0), (Player2, 2), (Player3, 2)}", universe);
        AcquaintanceArray acquaintanceArray2 = AcquaintanceArray.createAcquaintanceArray("{(Player2, 0), (Player3, 1), (Player1, 1)}", universe);
        player1.setAcquaintances(acquaintanceArray);
        player2.setAcquaintances(acquaintanceArray2);
        player1.showAcquaintances();


    }
}
