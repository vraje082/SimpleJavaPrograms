package objectorienteddesign.rubik;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class RubiksCube {
    List<Side> list = new ArrayList<>();

    public RubiksCube() {
        list = initialize();
    }

    private List<Side> initialize() {
        Side side1 = new Side(new Block[3][3]);
        Side side2 = new Side(new Block[3][3]);
        Side side3 = new Side(new Block[3][3]);
        Side side4 = new Side(new Block[3][3]);
        Side side5 = new Side(new Block[3][3]);
        Side side6 = new Side(new Block[3][3]);


        Side side1 = initializeBlocksWithSameColour(side1, Colour.BLUE);
        Side side2 = initializeBlocksWithSameColour(side2, Colour.GREEN);
        Side side3 = initializeBlocksWithSameColour(side3, Colour.ORANGE);
        Side side4 = initializeBlocksWithSameColour(side4, Colour.RED);
        Side side5 = initializeBlocksWithSameColour(side5, Colour.WHITE);
        Side side6 = initializeBlocksWithSameColour(side6, Colour.YELLOW);

        list.add(side1);
        list.add(side2);
        list.add(side3);
        list.add(side4);
        list.add(side5);
        list.add(side6);
        return list;

    }

    private Side initializeBlocksWithSameColour(Side side, Colour colour) {
        for (int i = 0; i < side.getBlock().length; i++) {
            for (int j = 0; j < side.getBlock()[0].length; j++) {
                side.getBlock()[i][j] = new Block(colour);
            }
        }
        return side;
    }

    private void showCube(List<Side> tempList) {
        int index = 1;
        for (Side b : tempList) {
            System.out.println();
            System.out.println("Side" + index++);
            System.out.println();
            showCubeBlock(b.getBlock());
        }
    }

    private void showCubeBlock(Block[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void test() {
        RubiksCube cube = new RubiksCube();
        showCube(cube.list);
    }

    public List<Block[][]> rotateRowWise(int sideNumber, int row) {
        return null;
    }

    public List<Block[][]> rotateColumnWise(int sideNumber, int column) {
        return null;
    }
}
