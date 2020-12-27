package Task2.ChainOfResponsibility.Entities;

public class Request {

    private Client client;
    private CreditTerms terms;

    public Client getClient() {
        return client;
    }

    public CreditTerms getTerms() {
        return terms;
    }

    public Request(Client _client, CreditTerms _terms){
        client = _client;
        terms = _terms;
    }
}
