package objectorienteddesign.rubik;

/**
 * Created by vasanthan on 2017-06-25.
 */
public enum Colour {
    YELLOW("yellow"), RED("red"), GREEN("green"), BLUE("blue"), ORANGE("orange"), WHITE("white");
    private String color;

    private Colour(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
