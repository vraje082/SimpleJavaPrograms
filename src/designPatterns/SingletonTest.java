package designPatterns;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class SingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
            }
        });

        t1.start();
        t2.start();
    }


}
