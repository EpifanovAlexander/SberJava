package Task2.ChainOfResponsibility.Checkers;

import Task2.ChainOfResponsibility.Entities.Request;

import java.util.Random;

public class FinalChecker extends Checker {
    @Override
    public boolean checkRequest(Request request) {

        // Допустим по какой-то причине мы не принимаем половину заявок
        if (!(new Random().nextInt(10) < 8)){
            System.out.println("Ваш кредит не был одобрен по особым причинам. В кредите отказано.");
            return false;
        }
        System.out.println("Ваш кредит прошёл проверку.");
        return checkNext(request);
    }
}
