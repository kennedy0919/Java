package if_control;

import java.util.Scanner;

public class if_Ex3 {

	public static void main(String[] args) {
		
		// 2�� �̻��� �����ؾߵǴ� ��찡 ���� ����
		/*
		 * if (�񱳹���) {
		 * 		���̸� ����
		 * } else if (�񱳹���) {
		 * 		�ٸ����� �ִ�? ���̸� ����
		 * } else if (�񱳹���) {
		 * 		�ٸ����� �ִ�? ���̸� ����
		 * } else if (�񱳹���) {
		 * 		�ٸ����� �ִ�? ���̸� ����
		 * } else {
		 *  ���� � ���ǵ� �ش����� �ʰ� �����̸� ����
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
