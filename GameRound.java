public class GameRound {
    public Player[] players;

    public void calculateDeadPlayers() {
        for (Player player : players) {
            if (player.isActive() && player.checkDeath()) {
                player.setIsActive(false);
            }
        }
    }

    public void Respond() {
        for (Player player : players) {
            if (player.isActive()) {
               Message response = player.getResponseFunction().getResponse(player.getMessagesToRespond());
               AcquaintanceArray acquiantances = player.getAcquaintances();

            }
        }
    }

}
