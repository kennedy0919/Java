package if_problem_solving;

import java.util.Scanner;

public class if_example_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���:");
		int korean = input.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int english = input.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int math = input.nextInt();
		
		String result = "";
		double average = (korean + english + math) / (double) 3;
		if (average >= 60 && korean >= 40 && 
				english >= 40 && math >= 40) {
			result = "�����մϴ�,�հ��Դϴ�!";
		} else {
			result = "���հ��Դϴ�.";
		}
		System.out.println(result);
	}

}
