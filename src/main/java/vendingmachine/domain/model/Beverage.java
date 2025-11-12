package vendingmachine.domain.model;

import camp.nextstep.edu.missionutils.Randoms;

public enum Beverage {
    COLA(1, "콜라", 2000, 0),
    CIDER(2, "사이다", 2000, 0),
    WATER(3, "생수", 500, 0),
    COFFEE(4, "커피", 1000, 0),
    ION(5, "이온음료", 3000, 0);

    private final int id;
    private final String name;
    private final int price;
    private final int count;

    Beverage(int id, String name, int price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = generateCount();
    }

    private int generateCount() {
        return Randoms.pickNumberInRange(1, 10);
    }

    @Override
    public String toString() {
        return String.format("%d. %s - %d원 (재고: %d개)", id, name, price, count);
    }
}
