package homework4;

public class MyTime {

	private int hour;
	private int minute;
	private int second;
	private boolean boo;
	
	public int getHour() { return hour; }
	public void setHour(int _hour) { hour = _hour; }
	
	public int getMinute() { return minute; }
	public void setMinute(int _minute) { minute = _minute; }
	
	public int getSecond() { return second; }
	public void setSecond(int _second) { second = _second; }
	
	public boolean getBoo() { return boo; }
	public void setBoo(boolean _boo) { boo = _boo; }
	
	
	
	public void printTime() {
		boolean boo = this.getBoo();
		int hour = this.getHour();
		int minute = this.getMinute();
		int second = this.getSecond();
		
		if (0<=hour && hour < 23) {
			if (0<=minute && minute<59) {
				if (0<=second && second<59) {
					if(boo == true) {
						if (hour<12) {
							System.out.printf("时间为：%02d:%02d:%02d AM\n",hour,minute,second);
						}else {
							hour = hour-12;
							System.out.printf("时间为：%02d:%02d:%02d PM\n",hour,minute,second);
						}
					}else {
						System.out.printf("时间为：%02d:%02d:%02d\n",hour,minute,second);
					}
				}else {
					System.out.println("请秒输入为 0--59 之间的整数");
				}
			}else {
				System.out.println("请分钟输入为 0--59 之间的整数");
			}
		}else {
			System.out.println("请小时输入为 0--23 之间的整数");
		}
		
	}

}
