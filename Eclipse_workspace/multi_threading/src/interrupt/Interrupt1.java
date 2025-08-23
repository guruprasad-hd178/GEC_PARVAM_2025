package interrupt;

class Mythread extends Thread 
{
	public void run () {
		try {
			for (int i = 1; i < 5; i++)
			{
				System.out.println("Thread running... iteration " +i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("thread was interrupted! cleaning up... ");
		}
		System.out.println("Thread ends");
	}
}
public class Interrupt1 {
	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread interrupts child thread ");
		t.interrupt();
	}
}
