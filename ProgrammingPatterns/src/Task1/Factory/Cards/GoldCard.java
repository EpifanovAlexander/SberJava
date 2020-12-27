package Task1.Factory.Cards;

public class GoldCard implements CreditCard {
    private int balance;
    private int limit;

    public GoldCard(int _balance, int _limit){
        balance = _balance;
        limit = _limit;
    }

    @Override
    public TypeCard getType() {
        return TypeCard.GOLD;
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
