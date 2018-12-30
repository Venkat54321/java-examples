package examples;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        String s = "H#Heeee";
       // boolean pwdPolicy = checkPwdPolicy(s);
        boolean pwdPolicy = checkPwdPolicy1(s);
        System.out.println(pwdPolicy);
        
    }

    public static boolean checkPwdPolicy1(String pwd){

        if(!pwd.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{7,}$")){
            return false;
        }
        return true;
    }

    public static boolean checkPwdPolicy(String pwd){

        if(pwd.length() < 7){
            System.out.println("Password should contain seven character length");
            return false;
        }
        boolean hasUpper = !pwd.equals(pwd.toLowerCase());
        if(!hasUpper){
            System.out.println("Password should contain at least one upper case character");
            return false;
        }
        boolean hasLower = !pwd.equals(pwd.toUpperCase());
        if(!hasLower){
            System.out.println("Password should contain at least one lower case character");
            return false;
        }
        boolean hasSpecial = !pwd.matches("[A-Za-z0-9 ]*");
        if(!hasSpecial){
            System.out.println("Password should contain at least one special character");
            return false;
        }
        boolean hasNumber = !pwd.matches("\\?=.*?[0-9]");
        if(!hasNumber){
            System.out.println("Password should contain at least one number");
            return false;
        }
        return true;
    }
}
