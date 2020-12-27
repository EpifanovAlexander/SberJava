package Task1.Factory.Cards;

public class CommonCard implements CreditCard {

    private int balance;
    private int limit;

    public CommonCard(int _balance, int _limit){
        balance = _balance;
        limit = _limit;
    }

    @Override
    public TypeCard getType() {
        return TypeCard.COMMON;
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
