import java.util.ArrayDeque;
import java.util.Deque;

public class FrontSystem {

    private Deque<Request> requests = new ArrayDeque<>();

    public synchronized void clientSendRequest(Request request){
        while (requests.size() > 1){
            try{
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted");
                e.printStackTrace();
            }
        }
        requests.add(request);
        notifyAll();
    }


    public synchronized Request workerGetRequest(){
        while(requests.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread interrupted");
                e.printStackTrace();
            }
        }
        notifyAll();
        return requests.removeFirst();
    }
}
