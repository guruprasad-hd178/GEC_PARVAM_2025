package synchronization;

class Display1 
{
	public void wish (String name) 
	{
		synchronized (this) 
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println("good morning : ");
				try 
				{
					Thread.sleep(2000);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			System.out.println(name);
			}
		}
//		different
	}
}

class MyThread9 extends Thread {
	Display1 d;
	String name;
	
	
	MyThread9(Display1 d1, String s) {
		this.d = d1;
		this.name = s;	}

	public void run() {
		d.wish(name);
	}
}

public class Synchronization2 {
	public static void main(String[] args) {
		Display1 d1 = new Display1();
		MyThread9 t1 = new MyThread9(d1, "mohan");
		t1.start();
	}
}
