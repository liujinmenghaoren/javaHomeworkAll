package homework1;

import java.util.Scanner;


public class Task1_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�˳����г�100�����ܱ�ĳ������������������������Ҫ����ĳ�����");
		int divisor = s.nextInt();
		number(divisor);

	}
	
	public static void number(int num) {
		for (int i=1;i<101;i++) {
			if (i%num == 0) {
				System.out.println(i); 
			}
		}
		
	}

}
