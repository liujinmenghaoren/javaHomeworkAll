package homework2;

import java.util.Arrays;

public class Task2_3 {

	public static void main(String[] args) {
		int number[] = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365};
		int number1[] = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365};
		int number2[];
//		System.out.println(Arrays.toString(number1));
		String language[] = {"Java","Python","PHP","C#","C Programming","C++"};
		String language1[] = {"Java","Python","PHP","C#","C Programming","C++"};
		String language2[];
		arrayCaculate(number);
		
		Arrays.sort(number);
		number2 = number;
		number = number1;
		
		Arrays.sort(language);
		language2 = language;
		language = language1;
		
		System.out.println("整型数组原始数据："+Arrays.toString(number)+"\n排序后："+Arrays.toString(number2)+"\n字符串数组原始数据："+Arrays.toString(language)+"\n排序后："+Arrays.toString(language2));

	}
	
	public static void arrayCaculate(int[] arr) {
		int a = arr[0];
		int b = arr[0];
		int sum =0;
		for (int i=0; i<arr.length; i++) {
			if (a<arr[i]) {
				a = arr[i];
			}
			if (b>arr[i]) {
				b = arr[i];
			}
			sum += arr[i];
		}
		System.out.println("整型数组中的最大值是："+a+"\n整型数组中的最小值是："+b+"\n整型数组中的数据和是："+sum);
	}
	
//	public static void arraySort(int[] arr) {
//		
//	}
	
}
