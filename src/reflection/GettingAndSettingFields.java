package reflection;

import string.SpecialCharReplacing;

import java.lang.reflect.Field;

public class GettingAndSettingFields {

    public static void main(String[] args) throws Exception {

        System.out.println("get and set fild values using reflection example");
        String[] array = {"<",">"};
        Username user = new Username(2222, "<Venkat2222", "venka@gmail.com",null,null);
        System.out.println();

        Class<Username> clazz = Username.class;

        SpecialCharReplacing.getInstance(clazz,user);

        System.out.println(user);
    }
}
