public class Player {

    private AcquaintanceArray acquaintances;
    private ResponseFunction responses;
    private Universe universe;
    private Message messagesToRespond;
    private Message newMessagesInbox;
    private boolean isActive = true;
    private String name;
    private ResponseFunction responseFunction;
    public Player(String name, Universe universe) {
        this.name = name;
        this.universe = universe;
        universe.addPlayer(this);
    }

    public Message getNewMessagesInbox() {
        return newMessagesInbox;
    }

    public void setNewMessagesInbox(Message newMessagesInbox) {
        this.newMessagesInbox = newMessagesInbox;
    }
    public void respondToMessages(){
         Message msg = getMessagesToRespond();
         ResponseFunction replyHashmap = getResponseFunction();
         Message response = replyHashmap.getResponse(msg);
    }
    public boolean checkDeath(){
        if (responses.getResponse(messagesToRespond) == null) {
            return true;
        }
        return false;
    }

    public ResponseFunction getResponseFunction() {
        return responseFunction;
    }

    public void setResponseFunction(ResponseFunction responseFunction) {
        this.responseFunction = responseFunction;
    }

    public Message respond(Message message) {
        return responses.getResponse(message);
    }

    public String getName() {
        return name;
    }

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
        return "Player{" + "name='" + name + '\'' + '}';
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public Message getMessagesToRespond() {
        return messagesToRespond;
    }

    public void setMessagesToRespond(Message messagesToRespond) {
        this.messagesToRespond = messagesToRespond;
    }


}
