package sample;
 class Thread1 extends Thread
{
	Thread1(){}
	Thread1(String name){
		super(name);
	}
	 
	 @Override
	public void run() {
		System.out.println("Using Thread1......");
	}
}
class Thread2 implements Runnable
{
	Thread2(){}
	 Thread2(String name)
	 {
		 super();
	 }
	 @Override
	public void run() 
	{
		System.out.println("using runnable........");
	}
	
}
public class ThreadDemo1 {

	public static void main(String[] args)
	{
		Thread1 t1=new Thread1("child thread1");
		t1.start();
		System.out.println("using main Thread ...."+Thread.currentThread().getName());
		
		Thread t2=new Thread(new Thread2("Chlid Thread"));
		t2.start();
		System.out.println("end using main Thread2 ...."+Thread.currentThread().getName());

	}

}
