package multi_threading_java;

class MyThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Child thread "+(i + 1));
		}
	}
	
}

public class CreatingThread {
	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("Main thread");
	}
}
