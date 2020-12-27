package Task1.Factory.Factories;

import Task1.Factory.Cards.CreditCard;

public interface CreditCardFactory {
    CreditCard createCard(int balance, int limit);
}
