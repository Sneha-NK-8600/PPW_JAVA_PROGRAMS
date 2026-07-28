/* **Q2. Runnable Interface**
Rewrite Q1 using the `Runnable` interface instead of extending `Thread`. 
Explain why implementing `Runnable` is generally preferred over extending `Thread`.
*Concepts: Runnable vs Thread, multiple inheritance limitation*

 */


class EvenRunnable implements Runnable
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
class OddRunnable implements Runnable
{
public void run()
{
for(int i=0;i<=20;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
}
class EvenOddRunnable

{
public static void main(String args[])
{
EvenRunnable en=new EvenRunnable();
OddRunnable on=new OddRunnable();

Thread t1=new Thread(en);
Thread t2=new Thread(on);

t1.start();
t2.start();
}
}

