package objectorienteddesign.rubik;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class Side {
    private Block[][] block;

    public Side(Block[][] block) {
        this.block = block;
    }

    public Block[][] getBlock() {
        return block;
    }

    public void setBlock(Block[][] block) {
        this.block = block;
    }
}
