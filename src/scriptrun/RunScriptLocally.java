package scriptrun;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class RunScriptLocally {

    public static void main(String[] args)  throws Exception
    {
        Process procScript = Runtime.getRuntime().exec("ls -l /home/Venkateswararao");
        PrintStream out = new PrintStream(procScript.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(procScript.getInputStream()));

        while (in.ready()) {
            String s = in.readLine();
            System.out.println(s);
        }
    }
}
