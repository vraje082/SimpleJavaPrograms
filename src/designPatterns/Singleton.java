package designPatterns;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class Singleton {

    private Singleton() {
        System.out.println("Instance created");
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
