package random;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BuyCar {

    static int totalMoney = 0;
    static double lossPercentage = 0;

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int[] toReturn = new int[2];

        for (int i = 1; i < 10; i++) {

            totalMoney = totalMoney + savingperMonth;
            if (i != 1) {
                if (i % 2 == 1) {
                    percentLossByMonth = percentLossByMonth + .5;

                }
            }
            //  startPriceOld = (int) getPriceOfTheCar(startPriceOld, percentLossByMonth);
            startPriceNew = (int) getPriceOfTheCar(startPriceNew, percentLossByMonth);
            //  totalMoney = totalMoney ;

            if (totalMoney > startPriceNew) {
                toReturn[0] = i;
                toReturn[1] = totalMoney - startPriceNew;
                return toReturn;
            }
        }
        return null;
    }

    static double getPriceOfTheCar(int price, double percentage) {
        return price * ((100 - percentage) / 100);
    }

    @Test
    public void test1() {
        int[] r = new int[]{6, 766};
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    }
}