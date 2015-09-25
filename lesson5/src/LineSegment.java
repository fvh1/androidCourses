import java.util.Scanner;


public class LineSegment {
	public LineSegment(Point a, Point b) {
		this.A = a;
		this.B = b;
	}
	public LineSegment(double a, double b, double c, double d) {
		this.A = new Point(a,b);
		this.B = new Point(c,d);
	}
	public LineSegment() {
		Scanner sc= new Scanner(System.in);
		this.A = new Point(sc.nextDouble(),sc.nextDouble());
		this.B = new Point(sc.nextDouble(),sc.nextDouble());
	}
	Point A;
	Point B;
	public Point getA() {
		return A;
	}
	public Point getB() {
		return B;
	}
	public String toString(){
		return "("+this.A.toString()+','+this.B.toString()+")"; 
	}
	Point getMiddle(){
		return new Point((this.A.getA()+this.B.getA())/2,(this.A.getB()+this.B.getB())/2);
	}
}
