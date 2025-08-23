package runnable_interface;

class ThreadClass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread ");
	}
	
	public void start() {
		System.out.println("start");
	}

}
public class RunnableInterface {
	public static void main(String[] args) {
		ThreadClass class1 = new ThreadClass();
		Thread th = new Thread(class1);
		Thread th1 = new Thread();
		th.start();
		th1.start();
		class1.start();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println("Main thread");
		}
	}
}
