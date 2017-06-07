package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class DeadlockBetweenThreads {

    static String s1 = "abc";
    static String s2 = "def";

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s1) {
                        synchronized (s2) {
                            System.out.println("First thread");
                        }
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    synchronized (s2) {
                        synchronized (s1) {
                            System.out.println("second thread");
                        }
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}
