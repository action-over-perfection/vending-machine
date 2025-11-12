package vendingmachine.domain.model;

public class Money {
    private final int amount;

    public Money(int amount) {
        this.amount = amount;
    }

    public int subtractBy(int price) {
        return amount - price;
    }
}
