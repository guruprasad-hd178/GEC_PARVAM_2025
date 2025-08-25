package thread_communication;

import java.util.Iterator;

class MyThread extends Thread {
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("child thread function : "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("child thread giving notification");
			this.notify();
		}
	}
}
public class InterThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.start();
		synchronized (t1) {
			System.out.println("Main thread calling wait method");
			t1.wait();
		}
		System.out.println("the end");
	}
}
