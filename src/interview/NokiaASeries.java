package interview;

import java.lang.annotation.*;

/**
 * Created by vasanthan on 2017-06-20.
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {

    String os() default "Symbian";

    int version() default 1;
}

@SmartPhone(version = 6)
public class NokiaASeries {

    public static void main(String[] args){
        NokiaASeries a = new NokiaASeries();

        Class c = a.getClass();
        Annotation an = c.getAnnotation(SmartPhone.class);
        SmartPhone s = (SmartPhone) an;
        System.out.println(s.os()+", "+s.version());
    }

}
