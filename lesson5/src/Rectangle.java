
public class Rectangle extends Figure {
	public Rectangle() {
		boolean isRectangle=false;
		while(!isRectangle){
			System.out.println("Init rectangle");
			System.out.println("Point#1");
			this.points[0]=new Point();
			System.out.println("Point#2");
			this.points[1]=new Point();
			System.out.println("Point#3");
			this.points[2]=new Point();
			System.out.println("Point#4");
			this.points[3]=new Point();
			LineSegment ab=new LineSegment(this.points[0],this.points[1]);
			LineSegment bc=new LineSegment(this.points[1],this.points[2]);
			LineSegment cd=new LineSegment(this.points[2],this.points[3]);
			LineSegment da=new LineSegment(this.points[3],this.points[0]);
			isRectangle=ab.isPerpendicular(bc)&&bc.isPerpendicular(cd)&&cd.isPerpendicular(da);
			if (!isRectangle){
				System.out.println("Not rectangle");
			}
		}
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
	protected Point [] points=new Point[4];
	
	
	@Override
	public double getSquare() {
		
		return this.points[0].getDistance(points[1])*this.points[1].getDistance(points[2]);
	}
}
