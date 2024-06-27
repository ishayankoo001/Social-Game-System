package com.SGS.dependency;

public class Player {

    private AcquaintanceArray acquaintances;
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
        System.out.println(responseFunction.getResponse(messagesToRespond));
        if (responseFunction.getResponse(messagesToRespond) == null) {
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
        return responseFunction.getResponse(message);
    }

    public void respondToAllAcquiantances(Message calculatedResponses){
        for (int i = 0; i < getAcquaintances().getAcquaintanceElements().length ; i++) {
            AcquaintanceElement acq = getAcquaintances().getAcquaintanceElements()[i];
            Player player = acq.getPlayer();
            int playerIndex = acq.getNumber();
            player.receiveMessage(calculatedResponses.getNumbers()[i], playerIndex);
        }
    }

    public String getName() {
        return name;
    }

    public void receiveMessage(int message, int index){
        int[] new_temp = newMessagesInbox.getNumbers();
        new_temp[index] = message;
        newMessagesInbox.setNumbers(new_temp);
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
        return name;
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
