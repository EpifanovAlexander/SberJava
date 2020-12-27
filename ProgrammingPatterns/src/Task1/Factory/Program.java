package Task1.Factory;

import Task1.Factory.Cards.CreditCard;
import Task1.Factory.Cards.TypeCard;
import Task1.Factory.Factories.CreditCardFactory;
import Task1.Factory.Factories.FactoryOfAll;


public class Program {
    public static void main(String[] args) {

        CreditCardFactory factoryCommon = FactoryOfAll.getCard(TypeCard.COMMON);
        showMessage(factoryCommon.createCard(100, 50000));

        CreditCardFactory factoryGold = FactoryOfAll.getCard(TypeCard.GOLD);
        showMessage(factoryGold.createCard(10000, 70000));

        CreditCardFactory factoryPremium = FactoryOfAll.getCard(TypeCard.PREMIUM);
        showMessage(factoryPremium.createCard(999999999, Integer.MAX_VALUE));

//        CreditCardFactory factoryNull = FactoryOfAll.getCard(null);
//        showMessage(factoryNull.createCard(1));
    }

    static void showMessage(CreditCard card){
        System.out.println("Я карта типа " + card.getType() + " и на мне сейчас " + card.getBalance() + " " +
                "р а всего на мне может быть " + card.getLimit() + " р");
    }
}
