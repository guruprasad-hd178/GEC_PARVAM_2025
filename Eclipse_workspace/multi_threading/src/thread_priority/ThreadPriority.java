package thread_priority;

class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is child method");
		System.out.println("The name of thread "+Thread.currentThread().getName());
		System.out.println("The priority "+Thread.currentThread().getPriority());
	}
	
}

public class ThreadPriority {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();
		System.out.println("Main method name of thread "+Thread.currentThread().getName());
		System.out.println("Main method priority "+Thread.currentThread().getPriority());
	}
}
