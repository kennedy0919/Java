package if_problem_solving;

import java.util.Scanner;

public class if_example_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1~12 ������ ���� �Է�:");
		int num = input.nextInt();
		
		String result = "";
		if (num < 1 || num > 12) {
			System.out.println(num + "���� �߸� �Էµ� ���Դϴ�.");
		} else {
			if (1 <= num && num <= 3) {
				result = "��";
			} else if (4 <= num && num <= 6) {
				result = "����";
			} else if (7 <= num && num <= 9) {
				result = "����";
			} else if (10 <= num && num <= 12) {
				result = "�ܿ�";
			}
			System.out.println(num + "����" +" "+ result + "�Դϴ�.");
		}

	}

}
