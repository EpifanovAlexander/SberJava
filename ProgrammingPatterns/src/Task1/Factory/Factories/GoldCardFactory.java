package Task1.Factory.Factories;

import Task1.Factory.Cards.CreditCard;
import Task1.Factory.Cards.GoldCard;

public class GoldCardFactory implements CreditCardFactory {
    @Override
    public CreditCard createCard(int balance, int limit) {
        return new GoldCard(balance,limit);
    }
}
