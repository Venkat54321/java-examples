package threadstest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main1 {

    public static void main(String[] args) {

        String username= "problems";
        String password= "problems";

        UserValidator ldapValidator=new UserValidator("LDAP");
        UserValidator dbValidator=new UserValidator("DataBase");

        TaskValidator ldapTask=new TaskValidator(ldapValidator,
                username, password);
        TaskValidator dbTask=new TaskValidator(dbValidator,username,password);

        List<TaskValidator> taskList=new ArrayList<>();
        taskList.add(ldapTask);
        taskList.add(dbTask);

        ExecutorService executor=Executors.
                newCachedThreadPool();
        String result;

        try {
            result = executor.invokeAny(taskList);
            System.out.printf("Main: Result: %s\n",result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        executor.shutdown();
        System.out.printf("Main: End of the Execution\n");
    }
}
