package com.SGS.dependency;

public class Universe {
    private Player[] players;

    public int getK() {
        return k;
    }

    private int k;

    public Universe(Player[] players, int k) {
        this.players = players;
        this.k = k;
    }
    public void addPlayer(Player player) {
        Player[] newPlayers = new Player[players.length + 1];
        for (int i = 0; i < players.length; i++) {
            newPlayers[i] = players[i];
        }
        newPlayers[players.length] = player;
        players = newPlayers;
    }
    public void showPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    public Player findPlayer(String name){
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

}
