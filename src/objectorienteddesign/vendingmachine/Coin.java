package objectorienteddesign.vendingmachine;

/**
 * 1) Accepts coins of 1,5,10,25 Cents i.e. penny, nickel, dime, and quarter.
 * 2) Allow user to select products Coke(25), Pepsi(35), Soda(45)
 * 3) Allow user to take refund by canceling the request.
 * 4) Return selected product and remaining change if any
 * 5) Allow reset operation for vending machine supplier.
 */
public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return this.denomination;
    }
}
