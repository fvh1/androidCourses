import java.util.Scanner;


public class Point {
	public Point(){
		Scanner sc=new Scanner(System.in);
		this.a=sc.nextDouble();
		this.b=sc.nextDouble();
	}
	public Point(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Point(Point point) {
		super();
		this.a = point.a;
		this.b = point.b;
	}
	double a;
	double b;
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getDistance(Point point){
		return Math.sqrt((this.a-point.a)*(this.a-point.a)+(this.b-point.b)*(this.b-point.b));
	}
	public double getDistance(double a, double b){
		return Math.sqrt((this.a-a)*(this.a-a)+(this.b-b)*(this.b-b));
	}
	public String toString(){
		return "("+Double.toString(this.a)+','+Double.toString(this.b)+")";
	}
}
