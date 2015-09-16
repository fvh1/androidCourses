//import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Scanner sc= new Scanner(System.in);
		String arr []= new String [6];
		for (int i=0; i<arr.length; i++){
			arr[i]=sc.nextLine();
		}
		sc.close();
		for (String a:arr){
			System.out.print(a+" ");
		}*/
		System.out.println(OneMoreClass.square(4));
		System.out.println(OneMoreClass.square(2,4));
		System.out.println(OneMoreClass.square(3,4,5));
		System.out.println(OneMoreClass.square(4,4,14));
	}
	
	public static void test(){
		System.out.println("test");
	}
	public static void test(String s){
		System.out.println(s+" test");
	}
	public static void test(String s, int it){
		for (int i=0;i<it;i++){
			System.out.println(s+" test");
		}
	}
	public static int sum(int a, int b){
		return a+b;
	}

}
