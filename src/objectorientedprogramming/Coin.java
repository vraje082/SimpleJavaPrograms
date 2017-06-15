package objectorientedprogramming;

/**
 * Created by Vasanth on 2017-06-14.
 */
public enum Coin {
    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    private int denomination;

    Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return this.denomination;
    }
}
