package designPatterns;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class Singleton {

    private Singleton() {
        System.out.println("Instance created");
    }

    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
