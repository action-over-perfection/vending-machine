package vendingmachine.domain.model;

public enum Products {
    COLA(1, "콜라", 2000, 3),
    CIDER(2, "사이다", 2000, 5),
    WATER(3, "생수", 500, 10),
    COFFEE(4, "커피", 1000, 5),
    ION(5, "이온음료", 3000, 2);

    private final int id;
    private final String name;
    private final int price;
    private final int stockCount;

    Products(int id, String name, int price, int stockCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stockCount = stockCount;
    }
}
