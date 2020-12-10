import java.util.Random;

public class Client extends Thread{

    private int balance;
    private RequestType requestType;
    private FrontSystem bank;

    public Client(String name, int _balance, FrontSystem bank) {
        super (name);
        balance = _balance;
        this.bank = bank;
    }

    public void run(){
        Random rand = new Random();

        RequestType type = (rand.nextBoolean()) ? RequestType.GET : RequestType.GIVE;
        int sum = rand.nextInt(balance) + balance;

        bank.clientSendRequest(CreateRequest(this.getName(), type, sum));
    }

    private Request CreateRequest(String clientName, RequestType type, int sum){
        return new Request(clientName, type, sum);
    }
}
