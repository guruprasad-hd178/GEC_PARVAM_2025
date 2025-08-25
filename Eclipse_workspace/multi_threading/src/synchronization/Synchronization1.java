package synchronization;

class Display {
	public synchronized void wish (String name) {
		for (int i = 0; i < 5; i++)
		{
			System.out.println("good morning : ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name);
		}
	}
}

class MyThread extends Thread {
	Display d;
	String name;
	
	MyThread(Display d, String s)
	{
		this.d = d;
		this.name = s;
	}
	
	public void run() {
		d.wish(name);
	}
}
public class Synchronization1 {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "mohan");
		MyThread t2 = new MyThread(d, "yuvraj");
		t1.start();
		t2.start();
	}
}
