package runnable_interface;

class NameOfThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread - "+Thread.currentThread().getName());
	}
	
}

public class GettingName {
	public static void main(String[] args) {
		NameOfThread nameOfThread = new NameOfThread();
		Thread th = new Thread(nameOfThread);
		th.start();
		Thread th1 = new Thread(nameOfThread);
		th1.start();
		Thread th2 = new Thread(nameOfThread);
		th2.start();
		
		System.out.println("The main method run by - "+Thread.currentThread().getName());
		Thread.currentThread().setName("Hello main");
		System.out.println(10/0);
		
		Thread.currentThread().setName("Hello");
		System.out.println("Hello");
	}
}
