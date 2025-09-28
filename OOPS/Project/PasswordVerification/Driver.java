package OOPS.Project.PasswordVerification;

public class Driver {
    public static void main(String[] args) {
        UserBO userBO = new UserBO();

        System.out.println(userBO.validate("Arul","ABCDE"));
        System.out.println(userBO.validate("Arul","BCDEF"));
    }
}
