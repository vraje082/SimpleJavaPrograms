package objectorienteddesign.rubik;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class RubiksCube {
    List<Block[][]> list = new ArrayList<>();

    public RubiksCube() {
        list = initialize();
    }

    private List<Block[][]> initialize() {
        Block[][] side1 = initializeBlocksWithSameColour(new Block[3][3], Colour.BLUE);
        Block[][] side2 = initializeBlocksWithSameColour(new Block[3][3], Colour.GREEN);
        Block[][] side3 = initializeBlocksWithSameColour(new Block[3][3], Colour.ORANGE);
        Block[][] side4 = initializeBlocksWithSameColour(new Block[3][3], Colour.RED);
        Block[][] side5 = initializeBlocksWithSameColour(new Block[3][3], Colour.WHITE);
        Block[][] side6 = initializeBlocksWithSameColour(new Block[3][3], Colour.YELLOW);

        list.add(side1);
        list.add(side2);
        list.add(side3);
        list.add(side4);
        list.add(side5);
        list.add(side6);
        return list;

    }

    private Block[][] initializeBlocksWithSameColour(Block[][] array, Colour colour) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = new Block(colour);
            }
        }
        return array;
    }

    private void showCube(List<Block[][]> tempList) {
        int index = 1;
        for (Block[][] b : tempList) {
            System.out.println();
            System.out.println("Side" + index++);
            System.out.println();
            showCubeBlock(b);
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
