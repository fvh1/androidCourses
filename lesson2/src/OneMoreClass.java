
public class OneMoreClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static double square(double a){
		return a*a;
	}
	public static double square(double a, double b){
		return a*b;
	}
	public static double square(double a, double b, double c){
		if (((a+b)<c)||((a+c)<b)||((b+c)<a)){
			System.out.println("Not an triangle");
			return -1;
		}
		double p=(a+b+c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
