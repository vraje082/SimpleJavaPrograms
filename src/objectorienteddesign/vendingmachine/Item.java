package objectorienteddesign.vendingmachine;

/**
 * 1) Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
 * 2) Allow user to select products Coke(25), Pepsi(35), Soda(45)
 * 3) Allow user to take refund by canceling the request.
 * 4) Return selected product and remaining change if any
 * 5) Allow reset operation for vending machine supplier.
 */
public enum Item {

    COKE("coke", 25), PEPSI("pepsi", 35), SODA("soda", 45);

    private String name;
    private int price;

    private Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }
}

