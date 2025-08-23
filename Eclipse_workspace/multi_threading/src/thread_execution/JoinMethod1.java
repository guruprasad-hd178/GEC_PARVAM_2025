package thread_execution;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ " strated exectution");
		for (int i = 0; i < 20; i++)
		{
			System.out.println("child thread : "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+ " completed execution");
	}
	
}

public class JoinMethod1 {
	public static void main(String[] args) {
		Thread thread = new Thread(new MyThread2());
		thread.start();
		try {
			thread.join();
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
