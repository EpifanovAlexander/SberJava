package Task2.ChainOfResponsibility;

import Task2.ChainOfResponsibility.Checkers.FinalChecker;
import Task2.ChainOfResponsibility.Checkers.TermsChecker;
import Task2.ChainOfResponsibility.Entities.Client;
import Task2.ChainOfResponsibility.Entities.Request;
import Task2.ChainOfResponsibility.Checkers.Checker;
import Task2.ChainOfResponsibility.Checkers.ClientChecker;
import Task2.ChainOfResponsibility.Entities.Bank;
import Task2.ChainOfResponsibility.Entities.CreditTerms;

public class Program {
    public static void main(String[] args) {
        Checker checker = new ClientChecker();
        checker.boundWithChecker(new TermsChecker()).boundWithChecker(new FinalChecker());

        // Хороший клиент
        Client client1 = new Client("Хороший Джон", 28, 100000, true);
        CreditTerms terms1 = new CreditTerms(20000,11, 8, 40000);
        startChecks(new Request(client1, terms1), checker);


        // Плохой клиент
        Client client2 = new Client("Плохой Джон", 28, 100000, false);
        CreditTerms terms2 = new CreditTerms(20000,11, 8, 40000);
        startChecks(new Request(client2, terms2), checker);


        // Клиент, который младше 18 лет
        Client client3 = new Client("Отрок Джон", 12, 100000, true);
        CreditTerms terms3 = new CreditTerms(20000,11, 8, 40000);
        startChecks(new Request(client3, terms3), checker);


        // Клиент, который хочет платить кредит больше 2 лет
        Client client4 = new Client("Не торопящийся Джон", 28, 100000, true);
        CreditTerms terms4 = new CreditTerms(20000,11, 27, 40000);
        startChecks(new Request(client4, terms4), checker);


        // Клиент, который хочет взять у банка в кредит больше, чем тот имеет
        Client client5 = new Client("Наглый Джон", 28, 100000, true);
        CreditTerms terms5 = new CreditTerms(Bank.balance+1,11, 27, 40000);
        startChecks(new Request(client5, terms5), checker);
    }

    public static void startChecks(Request request, Checker checker){
        ShowClient(request.getClient());
        System.out.println("Проверяем...");
        ShowInfo(checker.checkRequest(request), request);
    }

    public static void ShowInfo(boolean condition, Request request){
        System.out.println();
        if (condition){
            System.out.println("ИТОГ: Клиенту "+request.getClient().getName()+" одобрен кредит.");
            System.out.println("ИНФОРМАЦИЯ О КРЕДИТЕ:");
            System.out.println(" Сумма кредита: "+request.getTerms().getSum());
            System.out.println(" Ежемесячный платёж: "+request.getTerms().getPayment());
            System.out.println(" Процентная ставка: "+request.getTerms().getRate());
            System.out.println(" Число месяцев: "+request.getTerms().getMonthCount());
        }
        else{
            System.out.println("ИТОГ: Клиенту "+request.getClient().getName()+" не одобрен кредит.");
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println();
    }

    public static void ShowClient(Client client){
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("КЛИЕНТ: ");
        System.out.println(" Имя: "+client.getName());
        System.out.println(" Возраст: "+client.getAge());
        System.out.println(" Доход: "+client.getIncome());
        System.out.println(" Кредитная история: " + ((client.isHasGoodCreditStory()) ? "хорошая" : "плохая"));
        System.out.println();
    }
}
