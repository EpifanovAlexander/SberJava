package Task1.Factory.Cards;

public class PremiumCard implements CreditCard {
    private int balance;
    private int limit;

    public PremiumCard(int _balance, int _limit){
        balance = _balance;
        limit = _limit;
    }

    @Override
    public TypeCard getType() {
        return TypeCard.PREMIUM;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public int getLimit() {
        return limit;
    }
}
