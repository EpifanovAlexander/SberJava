package Task1.Factory.Factories;

import Task1.Factory.Cards.CommonCard;
import Task1.Factory.Cards.CreditCard;

public class CommonCardFactory implements CreditCardFactory {
    @Override
    public CreditCard createCard(int balance, int limit) {
        return new CommonCard(balance, limit);
    }
}
