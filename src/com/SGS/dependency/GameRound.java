package com.SGS.dependency;

public class GameRound implements IGameRound {
    public IPlayer[] players;

    public GameRound(IPlayer[] players) {
        this.players = players;
    }

    public void calculateDeadPlayers() {
        for (IPlayer player : players) {
            if (player.isActive && player.checkDeath()) {
                player.setIsActive(false);
            }
        }
    }

    public void Respond() {
        for (IPlayer player : players) {
            if (player.isActive) {
               Message response = player.getResponseFunction().getResponse(player.getMessagesToRespond());
               player.respondToAllAcquiantances(response);
            }
        }
        //at this point all newMessagesInbox are filled with the responses
    }

}
