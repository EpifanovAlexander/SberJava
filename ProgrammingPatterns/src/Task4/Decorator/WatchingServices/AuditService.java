package Task4.Decorator.WatchingServices;

import java.util.ArrayList;

public class AuditService extends WatchingService {

    public AuditService(){
        messages = new ArrayList<>();
    }

    @Override
    public String getNameService() {
        return "AuditService";
    }
}
