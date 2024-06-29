package com.SGS.dependency;

public class Player implements IPlayer {

    private AcquaintanceArray acquaintances;
    private Universe universe;

    public Message getMessagesToRespond() {
        return messagesToRespond;
    }

    public void setMessagesToRespond(Message messagesToRespond) {
        this.messagesToRespond = messagesToRespond;
    }

    private Message messagesToRespond;
    private Message newMessagesInbox;
    private boolean isActive = true;
    private String name;
    private IResponseFunction responseFunction;
    public Player(String name, Universe universe) {
        this.name = name;
        this.universe = universe;
        universe.addPlayer(this);
    }

    @Override
    public Message getNewMessagesInbox() {
        return newMessagesInbox;
    }

    @Override
    public void setNewMessagesInbox(Message newMessagesInbox) {
        this.newMessagesInbox = newMessagesInbox;
    }
    @Override
    public void respondToMessages(){
         Message msg = getMessagesToRespond();
         IResponseFunction replyHashmap = getResponseFunction();
         Message response = replyHashmap.getResponse(msg);
    }
    @Override
    public boolean checkDeath(){
        System.out.println(responseFunction.getResponse(messagesToRespond));
        if (responseFunction.getResponse(messagesToRespond) == null) {
            return true;
        }
        return false;
    }

    @Override
    public IResponseFunction getResponseFunction() {
        return responseFunction;
    }

    @Override
    public void setResponseFunction(ResponseFunction responseFunction) {
        this.responseFunction = responseFunction;
    }

    @Override
    public Message respond(Message message) {
        return responseFunction.getResponse(message);
    }

    @Override
    public void respondToAllAcquiantances(Message calculatedResponses){
        for (int i = 0; i < getAcquaintances().getAcquaintanceElements().length ; i++) {
            AcquaintanceElement acq = getAcquaintances().getAcquaintanceElements()[i];
            Player player = acq.getPlayer();
            int playerIndex = acq.getNumber();
            player.receiveMessage(calculatedResponses.getNumbers()[i], playerIndex);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void receiveMessage(int message, int index){
        int[] new_temp = newMessagesInbox.getNumbers();
        new_temp[index] = message;
        newMessagesInbox.setNumbers(new_temp);
    }

    @Override
    public AcquaintanceArray getAcquaintances() {
        return acquaintances;
    }

    @Override
    public void setAcquaintances(AcquaintanceArray acquaintances) {
        this.acquaintances = acquaintances;
    }

    @Override
    public void showAcquaintances() {
        System.out.println(acquaintances.toString());
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


}
