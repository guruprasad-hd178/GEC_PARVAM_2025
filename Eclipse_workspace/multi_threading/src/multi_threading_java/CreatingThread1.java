package multi_threading_java;

class MyThread1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Child thread "+(i + 1));
		}
	}
	
}

public class CreatingThread1 {
	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
//		myThread.start(); 	//	new thread
		myThread.run();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main thread "+(i + 1));
		}
	}
}
