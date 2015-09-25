import java.util.Scanner;

public class Circle extends Figure {
	public Circle(double r, Point c) {
		
		this.r = r;
		this.c = c;
	}
	public Circle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Init circle");
		System.out.println("Radius:");
		this.r=sc.nextDouble();
		System.out.println("Center:");
		this.c = new Point();
	}
	private double r;
	private Point c;
	
	@Override
	double getSquare() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r/2;
	}
	public double getR() {
		return r;
	}
	public Point getC() {
		return c;
	}

}
