package thread_execution;

class MyThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
		{
			System.out.println("child thread : "+i);
		}
	}	
}

public class JoinMethod {
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		Thread thread = new Thread(myThread);
		thread.start();
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main thread "+i);
		}
	}
}
