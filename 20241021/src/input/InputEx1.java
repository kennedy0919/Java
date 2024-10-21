package input;

import java.util.Scanner;

public class InputEx1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수:");
//		
//		int num = sc.nextInt();
//		System.out.println("num:" + num);
//		
//		// 두개의 정수를 입력받는 명령문
//		System.out.println("나이:");
//		int age = sc.nextInt();
//		System.out.println("현재 나이는:" + age + "입니다.");
//		
//		System.out.println("내년 나이는:" + (age + 1) + "입니다.");
		
		// 문제1
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 - num2);
		
		// 문제2
		Scanner sc1 = new Scanner(System.in);
		int num3 = sc1.nextInt();
		int num4 = sc1.nextInt();
		System.out.println(num3 / num4);
		
		// 문제3
		int num5 = sc.nextInt();
		int age = 23;
		int year = 2000;
		System.out.println(year - (num5 - age));
	}

}
