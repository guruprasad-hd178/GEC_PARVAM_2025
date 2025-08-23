package thread_execution;

class MyThread3 implements Runnable {

	static Thread mt;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ " strated exectution");
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 20; i++)
		{
			System.out.println("child thread : "+i);
		}
		System.out.println(Thread.currentThread().getName()+ " completed execution");
	}
	
}

public class JoinMethod2 {
	public static void main(String[] args) {
		MyThread3.mt = Thread.currentThread();
		Thread thread = new Thread(new MyThread3());
		thread.start();
		
		System.out.println(Thread.currentThread().getName()+ " strated exectution");

		for (int i = 0; i < 20; i++)
		{
			System.out.println("main thread : "+i);
		}
		System.out.println(Thread.currentThread().getName()+ " completed execution"); 
	}
}
