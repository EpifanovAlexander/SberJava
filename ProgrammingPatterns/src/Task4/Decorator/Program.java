package Task4.Decorator;

import Task4.Decorator.WatchingServices.WatchingService;
import Task4.Decorator.WorkServices.Worker;

public class Program {
    public static void main(String[] args) {

        Worker worker1 = new Worker();
        Request request1 = new Request("Заявка 1");

        worker1.createRequest("Заявка 2");
        worker1.updateRequest(request1, worker1.getRequest());
        worker1.getRequest();

        for (WatchingService service : worker1.getWatchingServices()){
            System.out.println(service.getNameService());
            for (String message : service.getMessagesInService()){
                System.out.println(" - "+message);
            }
            System.out.println();
        }
    }
}
