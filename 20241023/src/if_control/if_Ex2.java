package if_control;

import java.util.Scanner;

public class if_Ex2 {

	public static void main(String[] args) {
		 
//		 // if ~ else
//		 //  �ݵ�� �� �� �ϳ��� ����!
//		 //  ���� ������ ���̸� ���� ����! �����̸� else��
//		 //  �ؿ� �����Ѵ�.
//		 if(true) {
//		 System.out.println("����!��");
//		 }else {
//		 System.out.println("������ ��� ����!");
//		 }
//		 
//		 int age = 66;
//		 if (age < 8) {
//			 System.out.println("0��");
//			 } else { // 8�� �̻��� ���̰� ���´�.
//				 if (age < 65) {
//					 System.out.println("1500��");
//				 } else {
//					 System.out.println("0��");
//				 }
//			 
//			 }
		 // ���н���
		 //  ���� ������ Ű����� �Է��� �ؼ� ����
		 //  90���̻�! A
		 //  80��~90�� �̸� B
		 //  70��~80�� �̸� C
		 //  60��~70�� �̸� D
		 //  60���̸� ��� F
		Scanner input = new Scanner(System.in);
		System.out.println("����:");
		int score = input.nextInt();
		String result = "";
		
		if (score > 60) {
			if (score >= 90) {
				result = "A";
			}
			if (80 < score && score <= 90) {
				result = "B";
			}
			if (70 < score && score <= 80) {
				result = "C";
			}
			if (60 < score && score <= 70) {
				result = "D";
			}
		} else {
			result = "F";
		}
		System.out.println(result);
		 
			}
		}
