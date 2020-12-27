package Task4.Decorator.WatchingServices;

import java.util.List;

public abstract class WatchingService {
    protected List<String> messages;

    public void takeMessage(String message){
        messages.add(message);
    }

    public List<String> getMessagesInService(){
        return messages;
    }

    public abstract String getNameService();
}
