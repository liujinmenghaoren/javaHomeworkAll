package homework2;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�˳��򽫱Ƚ����������Ƿ�ȫ�Ȼ����Ƿ���ȫ���ȣ�");
		System.out.println("�������һ��������");
		int first = s.nextInt();
		System.out.println("������ڶ���������");
		int second = s.nextInt();
		System.out.println("�����������������");
		int third = s.nextInt();
		tripleEqual(first, second, third);

	}
	
	public static void tripleEqual(int first, int second, int third) {
		if (first == second) {
			if(second == third) {
				System.out.println("������ֵ�����");
			}else {
				System.out.println("��������ֵ����Ȼ򲻵�");
			}
		}else {
			if(first != third && second != third) {
				System.out.println("������ֵ������");
			}else {
				System.out.println("��������ֵ����Ȼ򲻵�");
			}
			
		}
	}

}
