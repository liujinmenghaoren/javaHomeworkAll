package homework3;

public class Task3_2 {

	public static void main(String[] args) {
		
		double x = 5;
		double y = 10;
		
		MyPoint point1 = new MyPoint();
		point1.setX(0);
		point1.setY(0);
		
		
		MyPoint point2 = new MyPoint();
		point2.setX(10);
		point2.setY(30.5);
		
		point1.doubleDistance(point2);
		point1.distanceTo(x, y);

	}

}
