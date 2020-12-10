public class Lobby {

    public static void main (String[] args) throws InterruptedException {

        FrontSystem bank = new FrontSystem();

        Client client1 = new Client("Клиент 1", 1, bank);
        Client client2 = new Client("Клиент 2", 2, bank);
        Client client3 = new Client("Клиент 3", 3, bank);
        Client client4 = new Client("Клиент 4", 400, bank);

        client1.setDaemon(true);
        client2.setDaemon(true);
        client3.setDaemon(true);
        client4.setDaemon(true);

        client1.start();
        client2.start();
        client3.start();
        client4.start();

        Worker worker1 = new Worker("Рабочий 1", bank);
        Worker worker2 = new Worker("Рабочий 2", bank);

        worker1.setDaemon(true);
        worker2.setDaemon(true);

        worker1.start();
        worker2.start();

        Thread.sleep(100);
    }
}
