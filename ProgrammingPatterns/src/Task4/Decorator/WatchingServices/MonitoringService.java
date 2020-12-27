package Task4.Decorator.WatchingServices;

import java.util.ArrayList;

public class MonitoringService extends WatchingService {

    public MonitoringService(){
        messages = new ArrayList<>();
    }

    @Override
    public String getNameService() {
        return "MonitoringService";
    }
}
