package anonymous_inner_class;

public class AnnonymousInnerClass3 {
	public static void main(String[] args) {
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("child thread");
			}
		});
		th.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main thread");
		}
	}
}
