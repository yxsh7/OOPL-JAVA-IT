/*
SI32 Yash Kamthe
Implement multithreading in java
https://github.com/yxsh7
*/
import java.util.*;

class ThreadExample1 extends Thread 
{
    public void run()     
    {
        try 
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Thread 1 is running");
                sleep(1000);
            }
            System.out.println("Thread 1 ends");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class ThreadExample2 extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0; i<10; i++)
            {
                System.out.println("Thread 2 is running");
                sleep(1500);
            }
            System.out.println("Thread 2 ends");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

public class thread_example
{
    public static void main(String[] args)
    {
        ThreadExample1 thread1 = new ThreadExample1();
        thread1.start();
        ThreadExample2 thread2 = new ThreadExample2();
        thread2.start();
    }
}
/*
OUTPUT:

Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 2 is running
Thread 1 is running
Thread 1 ends
Thread 2 is running
Thread 2 is running
Thread 2 is running
Thread 2 ends
*/