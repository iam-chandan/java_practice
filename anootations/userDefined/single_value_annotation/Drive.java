package anootations.userDefined.single_value_annotation;

/*
    Single valued annotation
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface FullStack{
    String technology();
}


class Dev{
    @FullStack(technology = "java")
    public void pay(){
        System.out.println("payed successfully.");
    }
}

public class Drive {
    public static void main(String[] args) throws NoSuchMethodException {
        Dev dev = new Dev();
        dev.pay();
        Method method = dev.getClass().getMethod("pay");
        FullStack fs = method.getAnnotation(FullStack.class);
        System.out.println(fs);
    }
}
