/*package mythreading;
import java.lang.*;
import java.util.*;
class Medical extends Thread
{
	public void run()
	{
			try
			{
				Thread.sleep(1000);
				System.out.println("Medical Thread Start.");
				Thread.sleep(3000);
				System.out.println("Medical Thread Completed."+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
class Testdrive extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Testdrive Thread Start.");
				Thread.sleep(5000);
				System.out.println("Testdrive Thread Completed."+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			this.notify();
		}
	}
}
class Officersign extends Thread
{
	public void run()
	{
		synchronized(this)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Officersign Thread Start.");
				Thread.sleep(7000);
				System.out.println("Officersign Thread Completed."+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			this.notify();
		}
	}
}
public class MainThread
{
	public static void main(String... args) throws InterruptedException
	{	
		Medical m=new Medical();
		m.start();
		synchronized(m)
		{
			m.wait();
		}
		
		Officersign os=new Officersign();
		os.start();
		synchronized(os)
		{
			os.wait();
		}
		
		Testdrive td=new Testdrive();
		td.start();
		
	}
}*/


//Using join excepton
package mythreading;
import java.lang.*;
import java.util.*;
class Medical extends Thread
{
	public void run()
	{
			try
			{
				Thread.sleep(1500);
				System.out.println("Medical Thread Start.");
				Thread.sleep(3000);
				System.out.println("Medical Thread Completed."+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
class Testdrive extends Thread
{
	public void run()
	{
			try
			{
				Thread.sleep(1500);
				System.out.println("Testdrive Thread Start.");
				Thread.sleep(3000);
				System.out.println("Testdrive Thread Completed."+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
class Officersign extends Thread
{
	public void run()
	{
			try
			{
				Thread.sleep(1500);
				System.out.println("Officersign Thread Start.");
				Thread.sleep(3000);
				System.out.println("Officersign Thread Completed."+"\n");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}

class TaskComplete extends Thread
{
	public void run()
	{
			try
			{
				Thread.sleep(1500);
				System.out.println("Congratualtions! You have cleared all levels succesfully...");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}

public class MainThread
{
	public static void main(String... args) throws InterruptedException
	{	
		Medical m=new Medical();
		m.start();
		m.join();
		
		Officersign os=new Officersign();
		os.start();
		os.join();
		
		Testdrive td=new Testdrive();
		td.start();
		td.join();
		
		TaskComplete tc=new TaskComplete();
		tc.start();
		
	}
}