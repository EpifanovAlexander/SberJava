package Task2.ChainOfResponsibility.Entities;

public class Client {

    private String name;
    private int age;
    private int income;
    private boolean hasGoodCreditStory;

    public Client(String _name, int _age, int _income, boolean _hasGoodCreditStory){
        name = _name;
        age = _age;
        income = _income;
        hasGoodCreditStory = _hasGoodCreditStory;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getIncome() {
        return income;
    }

    public boolean isHasGoodCreditStory() {
        return hasGoodCreditStory;
    }
}
