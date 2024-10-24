package if_problem_solving;

import java.util.Scanner;

public class if_example_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("숫자를 한 개 입력하세요:");
		int num = input.nextInt();
		String text = "";

		if (num <= 0) {
			text = "양수만 입력해주세요.";
		} else {
			if ((num % 2) == 0) {
				text = "짝수다";
			} else {
				text = "홀수다";
			}
		}

		System.out.println(text);
	}

}
