package input;

import java.util.Scanner;

public class InputEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����1:");
		int num1 = sc.nextInt();
		
		System.out.println("����2:");
		int num2 = sc.nextInt();
		
		// �����ϰ� ���� ���ؼ� ����� ��Ÿ���� ��ȣ
		// ���׿�����
		
		// �񱳱�ȣ ? true : false
		
		int result = (num1 == num2) ? 1 : -1;
		System.out.println("���:" + result);
		
		// ���̰� 20�� �̸��̸� û�ҳ�
		//      20�� �̻��̸� ����
		System.out.println("����:");
		int age = sc.nextInt();
		
		String ans = (age < 20) ? "û�ҳ�" : "����";
		System.out.println(ans);
		
		// ���� �ϳ��� �Է� �޾Ƽ�
		// 8�� ������� �ƴ��� ���
		
		int num3 = sc.nextInt();
		int change_num3 = num3 % 8;
		boolean result2 = (change_num3 == 0) ? true : false;
		System.out.println("���:" + result2);
		
		
		
	}

}
