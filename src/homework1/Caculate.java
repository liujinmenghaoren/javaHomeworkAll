package homework1;

import java.util.Scanner;

public class Caculate {

	public static void main(String[] args) {
		int firstNum = 0,
		    secondNum = 0;
		    //result = 0;
		String operator;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("�������һ����������");
		firstNum = s.nextInt();
		System.out.println("�����롮+������-������*������/���������");
		operator = s.next();
		System.out.println("������ڶ�����������");
		secondNum = s.nextInt();
		
		int result = caculate(firstNum, secondNum, operator);
		System.out.println(firstNum+operator+secondNum+"="+result);
	}
	
	public static int caculate(int first, int second, String oper) {
		int result = 0;
		switch (oper) {
		case "+" : 
			result =  first + second;
			break;
		case "-" :
			result =  first - second;
			break;
		case "*" :
			result =  first * second;
			break;
		case "/" :
			result =  first / second;
			break;
		}
		
		return result;
	}

}
