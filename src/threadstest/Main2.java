package threadstest;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        CompletionService<String> service=new ExecutorCompletionService<>(executor);

        ReportRequest faceRequest=new ReportRequest("Face", service);
        ReportRequest onlineRequest=new ReportRequest("Online",service);
        Thread faceThread=new Thread(faceRequest);
        Thread onlineThread=new Thread(onlineRequest);


    }
}
