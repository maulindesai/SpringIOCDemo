package model;

public class Money {

    public Money() {
        System.out.println("called constructor!");
    }
    double amount;

    enum currency {
        Rs,
        Dollar
    }
}
