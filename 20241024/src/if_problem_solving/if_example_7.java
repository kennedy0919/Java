package if_problem_solving;

import java.util.Scanner;

public class if_example_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű(m)�� �Է��� �ּ���:");
		double hight = input.nextDouble();
		System.out.println("������(kg)�� �Է��� �ּ���:");
		double weight = input.nextDouble();
		
		double bmi = weight / (hight * hight);
		
		String result = "";
		if (bmi < 18.5) {
			result = "��ü��";
		} else if (18.5 <= bmi && bmi < 23) {
			result = "����ü��";
		} else if (23 <= bmi && bmi < 25) {
			result = "��ü��";
		} else if (25 <= bmi && bmi < 30) {
			result = "��";
		} else if (30 <= bmi) {
			result = "����";
		}
		System.out.println(result);
	}

}
