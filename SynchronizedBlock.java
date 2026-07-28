/* **Q5. Synchronized Blocks**
Modify Q4 to use a `synchronized` block instead of a synchronized method, synchronizing only on the specific object needed. Explain the performance benefit over synchronizing the whole method.
*Concepts: synchronized blocks, lock granularity* */

class Counter
{
static int count=0;
}
class CounterIncrement extends Thread
{
 public void run()
 {
 for(int i=0;i<100000;i++)
 {
 synchronized(Counter.class)
 {
	Counter.count++;
	}
    }
	}
 }


class SynchronizedBlock
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