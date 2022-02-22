//package mythreading;
/*import java.lang.*;
import java.util.*;
class Medical extends Thread
{
	public void run()
	{
	synchronized(this)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Medical Thread Start.");
				Thread.sleep(3000);
				System.out.println("Medical Thread Completed."+"\n");
			}
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
	
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
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
			
		}this.notify();
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
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
			this.notify();
		}
	}
}
public class MainThread
{
	public static void main(String[] args) throws InterruptedException
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
		synchronized(td)
		{
			td.wait();
		}
			System.out.println("Congratulation program has runned the way you wanted :) ");
	}
}*/


//Using join excepton
//package mythreading;
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
			catch(InterruptedException e)
			{
				e.getStackTrace();
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
			catch(InterruptedException e)
			{
				e.getStackTrace();
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
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
	}
}

/*class TaskComplete extends Thread
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
}*/

public class MainThread
{
	public static void main(String... args) throws InterruptedException
	{	
		Medical m=new Medical();
		m.start();
		try{m.join();}catch(InterruptedException e){e.getStackTrace();}
		
		Officersign os=new Officersign();
		os.start();
		try{os.join();}catch(InterruptedException e){e.getStackTrace();}
		
		Testdrive td=new Testdrive();
		td.start();
		try{td.join();}catch(InterruptedException e){e.getStackTrace();}
		
		/*TaskComplete tc=new TaskComplete();
		tc.start();*/
		try
			{
				Thread.sleep(1500);
				System.out.println("Congratualtions! You have cleared all levels succesfully...");
			}
			catch(InterruptedException e)
			{
				e.getStackTrace();
			}
		
	}
}
