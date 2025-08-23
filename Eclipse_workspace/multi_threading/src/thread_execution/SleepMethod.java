package thread_execution;

class MyThread4 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ " strated exectution");
		for (int i = 0; i < 20; i++)
		{
			System.out.println("child thread : "+i);
		}
		System.out.println(Thread.currentThread().getName()+ " completed execution");
	}
	
}

public class SleepMethod {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread4());
		thread.start();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ " strated exectution");

		for (int i = 0; i < 20; i++)
		{
			System.out.println("main thread : "+i);
		}
		System.out.println(Thread.currentThread().getName()+ " completed execution"); 
	}
}

