package OOPS.Project.PasswordVerification;

public class UserBO {
    private User[] getUsers(){
        User[] users = new User[5];

        users[0] = new User(101,"Arul","BCDEF");
        users[1] = new User(102,"Megha","Nfhi@");
        users[2] = new User(103,"Swarna","@swr");
        users[3] = new User(104,"Chinmay","Dijon@z");
        users[4] = new User(105,"Tushar","T@$!");

        return users;
    }

    private String encryptPassword(String password){
        String res = "";
        for (int i = 0; i < password.length(); i++) {
           res = res + (char)(password.charAt(i) + 1);
        }
        return res;
    }

    public boolean validate(String userName,String password){
        User[] users = getUsers();
        for (int i = 0; i < users.length; i++) {
            String uName = users[i].getUserName();
            String uPassword = users[i].getPassword();
            if (uName.equals(userName) && uPassword.equals(encryptPassword(password))){
                return true;
            }
        }
        return false;
    }
}
