/* **Q1. Basic Thread Creation**
Write a Java program that creates two threads — one printing even numbers (1–20) and the other printing odd numbers (1–20) — by extending the `Thread` class.
*Concepts: extending Thread, `run()`, `start()`* */


class EvenThread extends Thread
{
 public void run()
 {
	for(int i=1;i<=20;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}		
 }
}
class OddThread extends Thread
{
 public void run()
 {
	for(int i=1;i<=20;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}		
 }
}
class EvenOddThread
{
	public static void main(String args[])
	{
		EvenThread et=new EvenThread();
		OddThread ot=new OddThread();
		
		et.start();
		ot.start();
	}
}

