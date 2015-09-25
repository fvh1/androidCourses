
public class LineSegment {
	public LineSegment(Point a, Point b) {
		this.A = a;
		this.B = b;
	}
	public LineSegment(double a, double b, double c, double d) {
		this.A = new Point(a,b);
		this.B = new Point(c,d);
	}
	private Point A;
	private Point B;
	public Point getA() {
		return A;
	}
	public Point getB() {
		return B;
	}
	public double getK(){
		return (this.A.getB()-this.B.getB())/(this.A.getA()-this.B.getA());
	}
	boolean isPerpendicular (LineSegment line){
		if((this.A.getA()-this.B.getA())==0){
			return (line.A.getB()-line.B.getB())==0;
		}else if((line.A.getA()-line.B.getA())==0){
			return (this.A.getB()-this.B.getB())==0;
		}else {
			return (this.A.getB()-this.B.getB())/(this.A.getA()-this.B.getA())*(line.A.getB()-line.B.getB())/(line.A.getA()-line.B.getA())==-1;
		}
	}
	public String toString(){
		return "("+this.A.toString()+','+this.B.toString()+")"; 
	}
	Point getMiddle(){
		return new Point((this.A.getA()+this.B.getA())/2,(this.A.getB()+this.B.getB())/2);
	}
}
