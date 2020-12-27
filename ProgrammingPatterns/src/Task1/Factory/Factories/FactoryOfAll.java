package Task1.Factory.Factories;

import Task1.Factory.Cards.TypeCard;

public class FactoryOfAll {
    public static CreditCardFactory getCard(TypeCard type){
        switch(type){
            case COMMON: return new CommonCardFactory();
            case GOLD: return new GoldCardFactory();
            case PREMIUM: return new PremiumCardFactory();
        }
        return null;
    }
}
