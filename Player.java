public class Player {

    public String getName() {
        return name;
    }

    private String name;

    public AcquaintanceArray getAcquaintances() {
        return acquaintances;
    }

    public void setAcquaintances(AcquaintanceArray acquaintances) {
        this.acquaintances = acquaintances;
    }
    public void showAcquaintances() {
        System.out.println(acquaintances.toString());
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                '}';
    }

    private AcquaintanceArray acquaintances;
    private Response responses;

    private Universe universe;
    public Message respond(Message message) {
        return responses.getResponse(message);
    }


    public Player(String name, Universe universe) {
        this.name = name;
        this.universe = universe;
        universe.addPlayer(this);
    }



}
