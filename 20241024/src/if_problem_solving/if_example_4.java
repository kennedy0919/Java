package if_problem_solving;

import java.util.Scanner;

public class if_example_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력:");
		int num = input.nextInt();
		
		String result = "";
		if (num < 1 || num > 12) {
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		} else {
			if (1 <= num && num <= 3) {
				result = "봄";
			} else if (4 <= num && num <= 6) {
				result = "여름";
			} else if (7 <= num && num <= 9) {
				result = "가을";
			} else if (10 <= num && num <= 12) {
				result = "겨울";
			}
			System.out.println(num + "월은" +" "+ result + "입니다.");
		}

	}

}
