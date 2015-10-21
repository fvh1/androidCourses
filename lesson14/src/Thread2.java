
public class Thread2 implements Runnable {
	Thread2(Thread t2){
		this.t2=t2;
	}
	private Thread t2;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0;i<10;i++){
			System.out.println("Missisipi "+i);
		}
		this.t2.notify();
	}

}
