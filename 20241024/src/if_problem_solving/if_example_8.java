package if_problem_solving;

import java.util.Scanner;

public class if_example_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ǿ�����1 �Է�:");
		int num1 = input.nextInt();
		System.out.println("�ǿ�����2 �Է�:");
		int num2 = input.nextInt();
		System.out.println("�����ڸ� �Է�:");
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
				error = "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.";
				is_valid = false;
			}
		} else {
			error = "�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.";
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
