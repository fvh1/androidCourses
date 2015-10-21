
import java.util.Scanner;

public class Main {
	static class NewThread extends Thread {
		@Override
		public void run(){
			for (int i=0; i<10;i++){
				print10(i);
			}
		}
		
	}
	static class NewThreadS extends Thread {
		@Override
		public void run(){
			print10s();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while (true){
			Scanner sc=new Scanner(System.in);
			sc.useDelimiter("\\s*\n");
			System.out.println("Input start -s for synchrone output or start -a for assynchrone output");
			String command=sc.next();
			if (command.equals("start -a")){
				NewThread thread1= new NewThread();
				NewThread thread2= new NewThread();
				thread1.start();
				thread2.start();
				break;
			}else if(command.equals("start -s")){
				NewThreadS thread1= new NewThreadS();
				NewThreadS thread2= new NewThreadS();
				thread1.start();
				thread2.start();
				break;
			}
				
		}
		
	}
	public static void print10(int i){
		System.out.println(Thread.currentThread()+":");
		for (int j=1;j<11;j++){
			System.out.print((i*10+j)+" ");
		}
		System.out.println();
		
	}
	public static synchronized void print10s(){
		for (int i=0;i<10;i++){
			System.out.println(Thread.currentThread()+":");
			System.out.println((1+10*i)+" "+(2+10*i)+" "+(3+10*i)+" "+(4+10*i)+" "+(5+10*i)+" "+(6+10*i)+" "+(7+10*i)+" "+(8+10*i)+" "+(9+10*i)+" "+(10+10*i));
		}
	}
}
