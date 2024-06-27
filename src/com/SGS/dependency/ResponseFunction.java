package com.SGS.dependency;

import java.util.HashMap;

public class ResponseFunction {
    public HashMap<Message, Message> getResponses() {
        return responses;
    }

    @Override
    public String toString() {
return "ResponseFunction{" +
                "responses=" + responses +
                '}';
    }
    public String mapToString() {
        return responses.entrySet().stream().map(entry -> entry.getKey() + " -> " + entry.getValue()).reduce("", (acc, entry) -> acc + entry + "\n");
    }

    public void setResponses(HashMap<Message, Message> responses) {
        this.responses = responses;
    }


    private HashMap<Message, Message> responses;

    public ResponseFunction(HashMap<Message, Message> responses) {
        this.responses = responses;
    }

    public Message getResponse(Message message) {
        return responses.get(message);
    }
}
