
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Thread1());
		Thread t2=new Thread(new Thread2(t1));
		
		t1.start();
		t2.start();
		
	}
	

}
