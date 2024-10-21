package input;

import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수1:");
		int num1 = sc.nextInt();
		
		System.out.println("정수2:");
		int num2 = sc.nextInt();
		
		// 간단하게 값을 비교해서 결과를 나타내는 기호
		// 삼항연산자
		
		// 비교기호 ? true : false
		
		int result = (num1 == num2) ? 1 : -1;
		System.out.println("결과:" + result);
		
		// 나이가 20세 미만이면 청소년
		//      20세 이상이면 성인
		System.out.println("나이:");
		int age = sc.nextInt();
		
		String ans = (age < 20) ? "청소년" : "성인";
		System.out.println(ans);
		
		// 정수 하나를 입력 받아서
		// 8의 배수인지 아닌지 출력
		
		int num3 = sc.nextInt();
		int change_num3 = num3 % 8;
		boolean result2 = (change_num3 == 0) ? true : false;
		System.out.println("결과:" + result2);
		
		
		
	}

}
