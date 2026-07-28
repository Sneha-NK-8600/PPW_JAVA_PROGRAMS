/* **Q3. Race Condition Demo**
Write a program where two threads increment a shared counter variable 100,000 times each without synchronization.
Run it and observe that the final count is often less than 200,000. Explain why.
*Concepts: race condition, shared mutable state* */


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
   Counter.count++;
 }
 }
}

class RaceConditionDemo
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