package Task2.ChainOfResponsibility.Checkers;

import Task2.ChainOfResponsibility.Entities.Client;
import Task2.ChainOfResponsibility.Entities.Request;

public class ClientChecker extends Checker {
    @Override
    public boolean checkRequest(Request request) {

        Client client = request.getClient();

        if (!client.isHasGoodCreditStory()) {
            System.out.println("У этого клиента плохая кредитная история. В кредите отказано.");
            return false;
        }
        System.out.println("У этого клиента хорошая кредитная история.");

        if (client.getAge() < 18) {
            System.out.println("Несовершеннолетние не могут заказывать кредиты в нашем банке. В кредите отказано.");
            return false;
        }
        System.out.println("Этот клиент совершеннолетний.");

        if (client.getIncome() < request.getTerms().getPayment()) {
            System.out.println("Доход этого клиента не позволит взять такой большой кредит.");
            return false;
        }
        System.out.println("Этот клиент имеет достаточный для покрытия кредита доход.");

        return checkNext(request);
    }
}
