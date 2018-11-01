package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		//String info[][] = {{"01","张三","50","50","90"},{"02","李四","40","60","80"},{"03","王五","30","70","70"},{"04","张三丰","80","80","40"},{"05","张无忌","90","90","50"}};
		
		Student s[] = new Student[5];
		
		Student s0 = new Student();
		s0.setNumber("01");
		s0.setName("张三");
		s0.setScoreEn(50);
		s0.setScoreMath(50);
		s0.setScoreSport(90);
		s[0] = s0;
		
		Student s1 = new Student();
		s1.setNumber("02");
		s1.setName("李四");
		s1.setScoreEn(40);
		s1.setScoreMath(60);
		s1.setScoreSport(80);
		s[1] = s1;
		
		Student s2 = new Student();
		s2.setNumber("03");
		s2.setName("王五");
		s2.setScoreEn(30);
		s2.setScoreMath(70);
		s2.setScoreSport(70);
		s[2] = s2;
		
		Student s3 = new Student();
		s3.setNumber("04");
		s3.setName("张三丰");
		s3.setScoreEn(80);
		s3.setScoreMath(80);
		s3.setScoreSport(40);
		s[3] = s3;
		
		Student s4 = new Student();
		s4.setNumber("05");
		s4.setName("张无忌");
		s4.setScoreEn(90);
		s4.setScoreMath(90);
		s4.setScoreSport(50);
		s[4] = s4;
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入您要查询的人名");
//		String inputName = scanner.next();
//		searchScore(inputName, s);
		
		searchScore("张三", s);
		
		System.out.println("请输入您要查询不及格人数的科目");
		String inputCourse = scanner.next();
		statistics(inputCourse, s);

	}
	
	public static void searchScore(String name, Student arr[]) {
		for (int i=0;i<arr.length;i++) {
			String insideName = arr[i].getName();
			if (insideName == name) {
				String result = arr[i].toString();
				System.out.println(result);
			}
		}
	}
	
	public static void statistics(String course, Student arr[]) {
		String result = "";
		int j = 0;
		switch (course) {
		case "英语":
			for (int i=0;i<arr.length;i++) {
				double score = arr[i].getScoreEn();
				if (score<60) {
					j++;
					result = result + " " + arr[i].getName();
				}
			}
			break;
		case "数学":
			for (int i=0;i<arr.length;i++) {
				double score = arr[i].getScoreMath();
				if (score<60) {
					j++;
					result = result + " " + arr[i].getName();
				}
			}
			break;
		case "体育":
			for (int i=0;i<arr.length;i++) {
				double score = arr[i].getScoreSport();
				if (score<60) {
					j++;
					result = result + " " + arr[i].getName();
				}
			}
			break;
		}
		
		System.out.println(course + "成绩不及格的学生有："+result+",人数为："+j);
	}

}
