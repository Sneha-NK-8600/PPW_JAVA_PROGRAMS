/* **Q4. Synchronized Methods**
Fix the program in Q3 using the `synchronized` keyword on the increment method. Verify the counter now always reaches 200,000.
*Concepts: synchronized methods, monitor lock* */


class Counter
{
static int count=0;

    public static synchronized void increment() 
	{
        count++;
    }

}
class CounterIncrement extends Thread
{
 public void run()
 {
 for(int i=0;i<100000;i++)
 {
	  Counter.increment();
		}
    }
 }


class SynchronizedMethod
{
public static void main(String args[]) throws InterruptedException
{
CounterIncrement c1=new CounterIncrement();
CounterIncrement c2=new CounterIncrement();

 c1.start();
 c2.start();

 c1.join();
 c2.join();

 System.out.println("Count is: "+Counter.count);
}
}