package homework4;

public class Task4_1 {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		circle1.setR(5);
		circle1.area();
		circle1.perimeter();
		
		Square square = new Square();
		square.setBorder(10);
		square.area();
		square.perimeter();
		
		Rectangle rec = new Rectangle();
		rec.setHeight(3);
		rec.setWidth(2);
		rec.area();
		rec.perimeter();
	}

}
