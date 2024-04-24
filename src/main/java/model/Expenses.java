package model;

public class Expenses {
    Money money;
    String title;
    String note;

    public Expenses(Money money) {
        this.money=money;
    }

    public void setMoney(Money money) {
        this.money=money;
    }
}
