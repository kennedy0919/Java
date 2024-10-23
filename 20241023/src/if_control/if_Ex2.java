package if_control;

import java.util.Scanner;

public class if_Ex2 {

	public static void main(String[] args) {
		 
//		 // if ~ else
//		 //  반드시 둘 중 하나는 실행!
//		 //  비교한 문장이 참이면 참을 실행! 거짓이면 else문
//		 //  밑에 실행한다.
//		 if(true) {
//		 System.out.println("실행!참");
//		 }else {
//		 System.out.println("거짓일 경우 실행!");
//		 }
//		 
//		 int age = 66;
//		 if (age < 8) {
//			 System.out.println("0원");
//			 } else { // 8세 이상의 나이가 들어온다.
//				 if (age < 65) {
//					 System.out.println("1500원");
//				 } else {
//					 System.out.println("0원");
//				 }
//			 
//			 }
		 // 수학시험
		 //  수학 점수를 키보드로 입력을 해서 저장
		 //  90점이상! A
		 //  80점~90점 미만 B
		 //  70점~80점 미만 C
		 //  60점~70점 미만 D
		 //  60점미만 모두 F
		Scanner input = new Scanner(System.in);
		System.out.println("점수:");
		int score = input.nextInt();
		String result = "";
		
		if (score > 60) {
			if (score >= 90) {
				result = "A";
			}
			if (80 < score && score <= 90) {
				result = "B";
			}
			if (70 < score && score <= 80) {
				result = "C";
			}
			if (60 < score && score <= 70) {
				result = "D";
			}
		} else {
			result = "F";
		}
		System.out.println(result);
		 
			}
		}
