
public class Multi_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t =new MyThread();
		Thread obj = new Thread(t);
		
		obj.start();
		for (int i=0;i<10;i++) {
			System.out.print("Main Thread");
		}
	}

}

class MyThread implements Runnable 
{
	public void run()
	{
		for (int i=0; i<10;i++)
		{
			System.out.print("Child Thread");
		}
		
	}
}
