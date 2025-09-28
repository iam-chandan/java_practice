package OOPS.Project.PasswordVerification;

import java.util.SplittableRandom;

public class User {
    private Integer userId;
    private String userName;
    private String password;

    public User(Integer userId,String userName,String password){
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return password;
    }
}
