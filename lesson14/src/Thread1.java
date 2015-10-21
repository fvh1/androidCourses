
public class Thread1 implements Runnable {
	
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		System.out.println("Start "+Thread.currentThread());
		try {
			this.wait(40000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End "+Thread.currentThread());
	}

}
