package Task4.Decorator.WatchingServices;

import java.util.ArrayList;

public class LogService extends WatchingService {

    public LogService(){
        messages = new ArrayList<>();
    }

    @Override
    public String getNameService() {
        return "LogService";
    }
}
