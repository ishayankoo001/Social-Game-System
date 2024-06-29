package com.SGS.dependency;

public interface IPlayer {
    Message getNewMessagesInbox();
    boolean isActive = true;


    void setNewMessagesInbox(Message newMessagesInbox);

    void respondToMessages();

    boolean checkDeath();

    IResponseFunction getResponseFunction();

    void setResponseFunction(ResponseFunction responseFunction);

    Message respond(Message message);

    void respondToAllAcquiantances(Message calculatedResponses);

    String getName();

    void receiveMessage(int message, int index);

    AcquaintanceArray getAcquaintances();

    void setAcquaintances(AcquaintanceArray acquaintances);

    void showAcquaintances();
    public void setMessagesToRespond(Message messagesToRespond);
    public Message getMessagesToRespond();

    @Override
    String toString();

    void setIsActive(boolean isActive);


}
