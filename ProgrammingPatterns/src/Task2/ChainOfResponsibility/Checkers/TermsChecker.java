package Task2.ChainOfResponsibility.Checkers;

import Task2.ChainOfResponsibility.Entities.Request;
import Task2.ChainOfResponsibility.Entities.Bank;
import Task2.ChainOfResponsibility.Entities.CreditTerms;

public class TermsChecker extends Checker {
    @Override
    public boolean checkRequest(Request request) {

        CreditTerms terms = request.getTerms();

        if (terms.getSum() > Bank.balance){
            System.out.println("В банке нет столько денег. В кредите отказано.");
            return false;
        }
        System.out.println("В банке достаточно средств.");

        if (terms.getMonthCount() > 24){
            System.out.println("Наш банк не даёт кредиты больше, чем на два года. В кредите отказано.");
            return false;
        }
        System.out.println("Срок кредита меньше двух лет.");

        if (terms.getPayment() < 20000){
            System.out.println("Наш банк не работает с кредитами, платёж кторых меньше 20 тысяч. В кредите отказано.");
            return false;
        }
        System.out.println("Планируемый ежемесячный платёж не меньше 20 тысяч.");

        return checkNext(request);
    }
}
