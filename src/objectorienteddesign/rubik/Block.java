package objectorienteddesign.rubik;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class Block {

    private Colour color;

    public Block(Colour color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color.getColor();
    }
}
