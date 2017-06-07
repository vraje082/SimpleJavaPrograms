package interview;

        import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class EvenNumber {

    public boolean isEvenNumber(int input) {
        if (input % 2 == 0) return true;
        return false;
    }

    @Test
    public void test() {
        System.out.println(isEvenNumber(10));
        System.out.println(isEvenNumber(17));

    }
}
