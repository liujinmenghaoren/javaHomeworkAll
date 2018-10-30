package homework2;

import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("此程序将列出某数以内的乘法表，请输入您的数值：");
		int num = s.nextInt();
		multiplicationTable(num);

	}
	
	public static void multiplicationTable(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
