package if_problem_solving;

import java.util.Scanner;

public class if_example_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("피연산자1 입력:");
		int num1 = input.nextInt();
		System.out.println("피연산자2 입력:");
		int num2 = input.nextInt();
		System.out.println("연산자를 입력:");
		String operator = input.next();

		double result = 0;
		String error = "";
		boolean is_valid = true;

		if (num1 > 0 && num2 > 0) {
			if (operator.equals("+")) {
				result = num1 + num2;
			} else if (operator.equals("-")) {
				result = num1 - num2;
			} else if (operator.equals("*")) {
				result = num1 * num2;
			} else if (operator.equals("/")) {
				result = num1 / (double) num2;
			} else if (operator.equals("%")) {
				result = num1 % (double) num2;
			} else {
				error = "잘못 입력하셨습니다. 프로그램을 종료합니다.";
				is_valid = false;
			}
		} else {
			error = "잘못 입력하셨습니다. 프로그램을 종료합니다.";
			is_valid = false;
		}
		if (is_valid) {
			System.out.println(num1 + " " + operator + " " 
					+ num2 + " = " + result);
		} else {
			System.out.println(error);
		}
	}

}
