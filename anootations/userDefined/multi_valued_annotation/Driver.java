package anootations.userDefined.multi_valued_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Info{
    String author();
    int version();
}

@Info(author = "chandan",version = 3)
public class Driver {
    public static void main(String[] args) {
        System.out.println("Multi valued annotation.");
        Driver d =  new Driver();
        Info info = d.getClass().getAnnotation(Info.class);
        System.out.println(info);
    }
}
