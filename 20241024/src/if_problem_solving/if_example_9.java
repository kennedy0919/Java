package if_problem_solving;

import java.util.Scanner;

public class if_example_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("�߰� ��� ����:");
		int middle_test_score = input.nextInt();
		System.out.println("�⸻ ��� ����:");
		int final_test_score = input.nextInt();
		System.out.println("���� ����:");
		int task = input.nextInt();
		System.out.println("�⼮ ȸ��:");
		int attendance = input.nextInt();
		
		String result = "";
		double sum_score = (middle_test_score * (double) 0.2) 
				+ (final_test_score * (double) 0.3)
				+ (task * (double) 0.3)
				+ (attendance * (double) 0.05 * 20);
		if (sum_score >= 70) {
			result = "PASS";
		}
		if(sum_score < 70) {
			result = "Fail [�����̴�]";
		}
		if(attendance <= 14) {
			result = "Fail [�⼮ ȸ�� ���� (" + attendance + "/20)]";
		}
		
		System.out.println("======== ��� ========");
		System.out.println("�߰���� ����(20):" + " " + (middle_test_score * (double) 0.2));
		System.out.println("�⸻��� ����(30):" + " " + (final_test_score * (double) 0.3));
		System.out.println("���� ����(30):" + " " + (task * (double) 0.3));
		System.out.println("�⼮ ����(20):" + " " +(attendance * (double) 0.05 * 20));
		System.out.println("����:" + " " +(sum_score));
		
		System.out.println(result);			
		

	}

}
