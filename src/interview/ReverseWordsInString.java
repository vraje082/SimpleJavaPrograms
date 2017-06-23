package interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class ReverseWordsInString {
    public String reverse(String str) {
        StringBuffer buffer = new StringBuffer();
        String[] array = str.split(" ");
        for (int i = array.length - 1; i > -1; i--) {
            buffer.append(array[i]);
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }

    @Test
    public void test() {
        assertThat(reverse("java is best programming language"), is("language programming best is java"));

    }
}
