package if_control;

import java.util.Scanner;

public class if_Ex3 {

	public static void main(String[] args) {
		
		// 2개 이상의 선택해야되는 경우가 있을 때는
		/*
		 * if (비교문장) {
		 * 		참이면 실행
		 * } else if (비교문장) {
		 * 		다른조건 있니? 참이면 실행
		 * } else if (비교문장) {
		 * 		다른조건 있니? 참이면 실행
		 * } else if (비교문장) {
		 * 		다른조건 있니? 참이면 실행
		 * } else {
		 *  위에 어떤 조건도 해당하지 않고 거짓이면 실행
		 * }
		 */
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int result = 0;
		if (num1 > num2 && num1 > num3) {
			result = num1;
		} else if (num2 > num1 && num2 > num3) {
			result = num2;
		} else if (num3 > num1 && num3 > num2) {
			result = num3;
		} else {
			System.out.println("?");
		}
		System.out.println(result);
	}

}
