package homework4;

public class Task4_2 {

	public static void main(String[] args) {
		
		MyTime time1 = new MyTime();
		time1.setBoo(false);
		time1.setHour(0);
		time1.setMinute(45);
		time1.setSecond(23);
		time1.printTime();
		
		MyTime time2 = new MyTime();
		time2.setBoo(true);
		time2.setHour(12);
		time2.setMinute(45);
		time2.setSecond(23);
		time2.printTime();

	}

}
