import java.util.HashMap;

public class Response {
    private HashMap<Message, Message> responses;
    public Message getResponse(Message message) {
        return responses.get(message);
    }
}
