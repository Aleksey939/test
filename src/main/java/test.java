import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class test {
    public static void main(String[] args) throws InterruptedException, IOException {



        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(()->System.out.println(1));
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.MILLISECONDS);

        new Thread(()-> {
            for (int i=10;i<12;i++){
                System.out.println(i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        FileWriter fileWriter =null;
        fileWriter=new FileWriter("1.txt");
        for(int i=0;i<256;i++){
        fileWriter.write(i);
            System.out.println(i);}
        fileWriter.close();

        List<String> list=new ArrayList<>();
        list.add("hello");
//new coment
        List<String> list2=new ArrayList<>();
        list2.add("Hi");
        list2.add("all");
    }

}
