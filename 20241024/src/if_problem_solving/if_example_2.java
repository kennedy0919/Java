package if_problem_solving;

import java.util.Scanner;

public class if_example_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("���ڸ� �� �� �Է��ϼ���:");
		int num = input.nextInt();
		String text = "";

		if (num <= 0) {
			text = "����� �Է����ּ���.";
		} else {
			if ((num % 2) == 0) {
				text = "¦����";
			} else {
				text = "Ȧ����";
			}
		}

		System.out.println(text);
	}

}
