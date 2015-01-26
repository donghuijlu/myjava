package java_12;

class Point{
	double x;
	double y;
	double z;
	Point(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void setX(double x){
		this.x=x;
	}
	void setY(double y){
		this.y=y;
	}
	void setZ(double z){
		this.z=z;
	}
	
	 double getDistance(Point p){
		
		return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
	}
}
public class TestPoint {
	public static void main(String[] args){
		Point p=new Point(1.0,2.0,3.0);
		Point p1=new Point(0.0,0.0,0.0);
		System.out.println(p.getDistance(p1));
		
		p.setX(5.0);
		System.out.println(p.getDistance(new Point(1.0,1.0,1.0)));
	}
}
