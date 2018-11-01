package homework4;

public class Circle {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	private double r;
	public double PI = 3.14;
	
	public double getR() {
		return r;
	}
	public void setR(double _r) {
		r = _r;
	}
	
	public void area() {
		double r = this.getR();
		double result = PI*r*r;
		System.out.println("该圆的面积为："+result);
	}
	
	public void perimeter() {
		double r = this.getR();
		double result = PI*r*2;
		System.out.println("该圆的周长为："+result);
	}

}
