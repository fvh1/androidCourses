
public class Rectangle extends Figure {
	public Rectangle() {
		this.points[0]=new Point();
		this.points[1]=new Point();
		this.points[2]=new Point();
		this.points[3]=new Point();
	}
	public Rectangle(Point a, Point b, Point c, Point d) {
		this.points[0]=a;
		this.points[1]=b;
		this.points[2]=c;
		this.points[3]=d;
	}
	public Rectangle(double a, double b, double c, double d, double e, double f, double g, double h) {
		this.points[0]=new Point(a, b);
		this.points[1]=new Point(c, d);
		this.points[2]=new Point(e, f);
		this.points[3]=new Point(g, h);
	}
	Point [] points=new Point[4];
	double ab=this.points[0].getDistance(points[1]);
	double bc=this.points[1].getDistance(points[2]);
	double cd=this.points[2].getDistance(points[3]);
	double da=this.points[3].getDistance(points[0]);
	
	@Override
	public double getSquare() {
		
		return this.ab*this.bc;
	}

}
