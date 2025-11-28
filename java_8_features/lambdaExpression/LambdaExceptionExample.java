package java_8_features.lambdaExpression;

import java_8_features.functional_Interface.Validator;

public class LambdaExceptionExample {
    public static void main(String[] args) {
        Validator v = (s)->{
            if (s == null || s.isEmpty()){
                throw new EmptyStringException("String can not be empty!");
            }
            System.out.println("Valid String : " + s);
        };

        try{
            v.validate("");
        } catch (Exception e) {
            System.out.println("Exception caught : " + e.getMessage());
        }
    }
}
