package homework4;

public class Rectangle {

	private double height;
	private double width;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double _height) {
		height = _height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double _width) {
		width = _width;
	}
	
	public void area() {
		double height = this.getHeight();
		double width = this.getWidth();
		double result = height*width;
		System.out.println("�ó����ε����Ϊ��"+result);
	}
	
	public void perimeter() {
		double height = this.getHeight();
		double width = this.getWidth();
		double result = height*width*2;
		System.out.println("�ó����ε��ܳ�Ϊ��"+result);
	}


}
