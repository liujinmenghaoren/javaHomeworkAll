package homework4;

public class Square {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	private double border;
	
	public double getBorder() {
		return border;
	}
	public void setBorder(double _border) {
		border = _border;
	}
	
	
	public void area() {
		double border = this.getBorder();
		double result = border*border;
		System.out.println("�������ε����Ϊ��"+result);
	}
	
	public void perimeter() {
		double border = this.getBorder();
		double result = border*4;
		System.out.println("�������ε��ܳ�Ϊ��"+result);
	}

}
