package homework3;

public class MyPoint {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double _x) {
		x = _x;
	}
	public double getY() {
		return y;
	}
	public void setY(double _y) {
		y = _y;
	}
	
	public void doubleDistance(MyPoint anotherPoint) {
		double x1 = this.getX();
		double y1 = this.getY();
		double x2 = anotherPoint.getX();
		double y2 = anotherPoint.getY();
		double result= Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		System.out.println("两点间的距离为："+result);
	}
	
	public void distanceTo(double x, double y) {
		double x1 = this.getX();
		double y1 = this.getY();
		double result= Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
		System.out.println("两点间的距离为："+result);
	}

}
