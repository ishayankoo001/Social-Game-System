package com.SGS.dependency;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Universe universe = new Universe(new Player[0], 3);
        Player player1 = new Player("Player1", universe);
        Player player2 = new Player("Player2", universe);
        Player player3 = new Player("Player3", universe);
        ResponseFunction player1ResponseFunction = new ResponseFunction(new HashMap<>());
        player1ResponseFunction.getResponses().put(new Message(new int[]{0, 2, 2}), new Message(new int[]{0, 2, 2}));
        System.out.println(player1ResponseFunction.getResponse(new Message(new int[]{0, 2, 2})).toString());
        ResponseFunction player2ResponseFunction = new ResponseFunction(new HashMap<>());
        ResponseFunction player3ResponseFunction = new ResponseFunction(new HashMap<>());
        AcquaintanceArray acquaintanceArray = AcquaintanceArray.createAcquaintanceArray("{(Player1, 0), (Player2, 2), (Player3, 2)}", universe);
        AcquaintanceArray acquaintanceArray2 = AcquaintanceArray.createAcquaintanceArray("{(Player2, 0), (Player3, 1), (Player1, 1)}", universe);

        player1.setAcquaintances(acquaintanceArray);
        player1.setResponseFunction(player1ResponseFunction);
        player1.setMessagesToRespond(new Message(new int[]{0, 2, 2}));
        System.out.println(player1.getResponseFunction().mapToString());
        System.out.println(player1.getMessagesToRespond());

        player2.setResponseFunction(player2ResponseFunction);
        player3.setResponseFunction(player3ResponseFunction);

        player2.setAcquaintances(acquaintanceArray2);
        player1.showAcquaintances();
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        for (Player player : players) {
            System.out.println(player.isActive());
        }
        GameRound gameRound = new GameRound(players.toArray(new Player[0]));
        gameRound.calculateDeadPlayers();
        for (Player player : players) {
            System.out.println(player.isActive());
        }
    }
}
