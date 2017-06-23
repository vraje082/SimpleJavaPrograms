package interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by vasanthan on 2017-06-20.
 */
public class Student implements Comparable<Student> {
    String username;
    int id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Test
    public void test() {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setUsername("abc");
        student2.setUsername("def");
        student1.setId(1);
        student2.setId(2);

        List<Student> list = new ArrayList<>();

        list.add(student2);
        list.add(student1);

        Collections.sort(list);

        assertThat(list.get(0).getUsername(), is("def"));
        assertThat(list.get(1).getUsername(), is("abc"));
    }

    @Override
    public int compareTo(Student o) {
        return o.getUsername().compareTo(this.username);
    }
}
