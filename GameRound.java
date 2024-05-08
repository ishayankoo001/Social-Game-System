public class GameRound {
    public Player[] players;

    public void calculateDeadPlayers() {
        for (Player player : players) {
            if (player.isActive()) {
                Message msg = player.getMessagesToRespond();
                ResponseFunction replyHashmap = player.getResponseFunction();
                if (replyHashmap.getResponse(msg) == null) {
                    player.setIsActive(false);
                }
            }
        }
    }
    public void Respond(){
        for (Player player : players){
            if (player.isActive()){
                //tbd
            }
        }
    }

}
