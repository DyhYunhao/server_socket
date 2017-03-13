package tread;
import java.lang.Thread;
import java.lang.*;
/**
 * Created by dyh on 17-3-2.
 */
public class tread {
   public static void main(String[] args){
       Runnable r1 = new task1();
       Runnable r2 = new task2();
       //Thread t1 = new Thread((java.lang.Runnable) r1);
       Thread t2 = new Thread((java.lang.Runnable) r2,"thread-2");
      // t1.start();
       t2.start();
       System.out.println("done");
   }
}

interface Runnable{
    public void run();
}
class task1 implements Runnable{
    public void run(){
        int sum = 0;
        for (int i=0;i<1000;i++)
            sum += i;
        System.out.println("sun:"+sum);
    }
}
class task2 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName() + "started");
        int k = 0;
        for (int i=0;i<10;i++) {
            for (int j = 0; j < 100; j++)
                k = i * j;
            System.out.println("time millis: " + System.currentTimeMillis());
        }
        System.out.println(Thread.currentThread().getName() + "end");
    }
}

