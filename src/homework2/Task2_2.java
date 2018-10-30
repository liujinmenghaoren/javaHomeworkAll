package homework2;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("此程序将比较三个整数是否全等或者是否完全不等！");
		System.out.println("请输入第一个整数：");
		int first = s.nextInt();
		System.out.println("请输入第二个整数：");
		int second = s.nextInt();
		System.out.println("请输入第三个整数：");
		int third = s.nextInt();
		tripleEqual(first, second, third);

	}
	
	public static void tripleEqual(int first, int second, int third) {
		if (first == second) {
			if(second == third) {
				System.out.println("所有数值都相等");
			}else {
				System.out.println("不是所有值都相等或不等");
			}
		}else {
			if(first != third && second != third) {
				System.out.println("所有数值都不等");
			}else {
				System.out.println("不是所有值都相等或不等");
			}
			
		}
	}

}
