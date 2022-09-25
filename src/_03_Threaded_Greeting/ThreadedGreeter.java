package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable{
	
	private int x;
	
	public ThreadedGreeter(int set) {
		x = set;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number " + x);
		if(x < 50) {
			x++;
			Thread t = new Thread(new ThreadedGreeter(x));
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
