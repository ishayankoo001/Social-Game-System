public class AcquaintanceElement {
    private Player player;
    private int number;

    public AcquaintanceElement(Player player, int number) {
        this.player = player;
        this.number = number;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
