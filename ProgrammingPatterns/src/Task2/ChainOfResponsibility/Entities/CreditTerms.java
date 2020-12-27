package Task2.ChainOfResponsibility.Entities;

public class CreditTerms {

    private int sum;
    private int rate;
    private int monthCount;
    private int payment;

    public CreditTerms(int _sum, int _rate, int _monthCount, int _payment){
        sum = _sum;
        rate = _rate;
        monthCount = _monthCount;
        payment = _payment;
    }

    public int getSum() {
        return sum;
    }

    public int getRate() {
        return rate;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public int getPayment() {
        return payment;
    }
}
