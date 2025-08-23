package thread_execution;

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
		{
			System.out.println("child thread : "+i);
			Thread.yield();
		}
	}
	
}
public class YieldMethod {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main thread "+i);
		}
	}
}
