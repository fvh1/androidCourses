
public class Triangle extends Figure {
	public Triangle() {
		System.out.println("Init triangle");
		System.out.println("Point#1");
		this.points[0]=new Point();
		System.out.println("Point#2");
		this.points[1]=new Point();
		System.out.println("Point#3");
		this.points[2]=new Point();
		this.ab=this.points[0].getDistance(points[1]);
		this.bc=this.points[1].getDistance(points[2]);
		this.ac=this.points[2].getDistance(points[0]);
	}
	public Triangle(Point a, Point b, Point c) {
		this.points[0]=a;
		this.points[1]=b;
		this.points[2]=c;
	}
	public Triangle(double a, double b, double c, double d, double e, double f) {
		this.points[0]=new Point(a, b);
		this.points[1]=new Point(c, d);
		this.points[2]=new Point(e, f);
	}
	private Point [] points=new Point[3];
	private double ab;
	private double bc;
	private double ac;
	@Override
	public double getSquare() {
		double p=(this.ab+this.ac+this.bc)/2;
		// TODO Auto-generated method stub
		return Math.sqrt(p*(p-this.ac)*(p-this.ab)*(p-this.bc));
	}
	boolean isTriangle(){
		return (this.ab+this.ac>this.bc)&&(this.ab+this.bc>this.ac)&&(this.bc+this.ac>this.ab);
	}
	public Point[] getPoints() {
		return points;
	}
	public double getAb() {
		return ab;
	}
	public double getBc() {
		return bc;
	}
	public double getAc() {
		return ac;
	}

}
