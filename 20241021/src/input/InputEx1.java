package input;

import java.util.Scanner;

public class InputEx1 {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����:");
//		
//		int num = sc.nextInt();
//		System.out.println("num:" + num);
//		
//		// �ΰ��� ������ �Է¹޴� ��ɹ�
//		System.out.println("����:");
//		int age = sc.nextInt();
//		System.out.println("���� ���̴�:" + age + "�Դϴ�.");
//		
//		System.out.println("���� ���̴�:" + (age + 1) + "�Դϴ�.");
		
		// ����1
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 - num2);
		
		// ����2
		Scanner sc1 = new Scanner(System.in);
		int num3 = sc1.nextInt();
		int num4 = sc1.nextInt();
		System.out.println(num3 / num4);
		
		// ����3
		int num5 = sc.nextInt();
		int age = 23;
		int year = 2000;
		System.out.println(year - (num5 - age));
	}

}
