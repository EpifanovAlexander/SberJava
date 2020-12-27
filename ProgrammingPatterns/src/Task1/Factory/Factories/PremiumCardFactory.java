package Task1.Factory.Factories;

import Task1.Factory.Cards.CreditCard;
import Task1.Factory.Cards.PremiumCard;

public class PremiumCardFactory implements CreditCardFactory {
    @Override
    public CreditCard createCard(int balance, int limit) {
        return new PremiumCard(balance, limit);
    }
}
