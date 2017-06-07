import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class Arraylist {
    Object[] obj = null;
    int index = 0;
    int size = 10;

    public Arraylist() {

        obj = new Object[size];
    }

    public void add(Object o) {
        if (index > size / 2) {
            increaseArrayListSize();
        }
        if (obj[0] == null) {
            obj[index] = o;
        } else {
            obj[++index] = o;
        }
    }

    private void increaseArrayListSize() {
        obj = Arrays.copyOf(obj, size * 2);
    }

    public Object get(int index) {
        if (index <= this.index) {
            return obj[index];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public void print() {
        for (Object temp : obj) {
            if (temp != null)
                System.out.println(temp);
        }
    }

    public void remove(int index) {
    }

    @Test
    public void test() throws Exception{
        Arraylist arrayList = new Arraylist();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Object o = arrayList.get(3);
        System.out.println(o);
    }
}
