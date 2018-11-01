package homework1;

import java.util.Scanner;

public class Caculate {

	public static void main(String[] args) {
		int firstNum = 0,
		    secondNum = 0;
		    //result = 0;
		String operator;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("请输入第一个运算数：");
		firstNum = s.nextInt();
		System.out.println("请输入‘+’、‘-’、‘*’、‘/’运算符：");
		operator = s.next();
		System.out.println("请输入第二个运算数：");
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
