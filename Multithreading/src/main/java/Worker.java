public class Worker extends Thread{

    private FrontSystem frontSystem;

    public Worker(String workerName, FrontSystem bank) {
        super(workerName);
        frontSystem = bank;
    }

    @Override
    public void run() {
        while (true){
            Request request = frontSystem.workerGetRequest();
            System.out.println("Поступила заявка. КЛИЕНТ: "+request.clientName+"; РАБОТНИК БАНКА: "+getName());
            BackSystem.handleRequest(request);
        }
    }
}
