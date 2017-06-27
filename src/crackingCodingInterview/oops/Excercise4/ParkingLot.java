package crackingCodingInterview.oops.Excercise4;

/**
 * 1) The parking lot has multiple levels. Each level has multiple rows of spots.
 * 2) The parking lot can park motorcycles, cars, and buses.
 * 3) The parking lot has motorcycle spots, compact spots, and large spots.
 * 4) A motorcycle can park in any spot.
 * 5) A car can park in either a single compact spot or a single large spot.
 * 6) A bus can park in five large spots that are consecutive and within the same row. It
 * cannot park in small spots.
 */
public class ParkingLot {
    private Level[] levels;
    private final int NUM_LEVELS = 5;

    public ParkingLot() {
        levels = new Level[NUM_LEVELS];
        for (int i = 0; i < NUM_LEVELS; i++) {
            levels[i] = new Level(i, 30);
        }
    }

    /* Park the vehicle in a spot (or multiple spots). Return false if failed. */
    public boolean parkVehicle(Vehicle vehicle) {
        for (int i = 0; i < levels.length; i++) {
            if (levels[i].parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (int i = 0; i < levels.length; i++) {
            System.out.print("Level" + i + ": ");
            levels[i].print();
            System.out.println("");
        }
        System.out.println("");
    }
}
