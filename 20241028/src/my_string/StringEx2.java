package my_string;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		
		// ȸ�����Խ� ���̵� ����
		String dbId = "qwer";
		
		// �α��� �Ҷ��� Ű����� �Է¹ޱ�
		// Ű����� �Է��� ���� ���� input��������
		// ���ϴ� ����� ������ ���� Ű����� �Է� ������ �ȴ�.
		Scanner input = new Scanner(System.in);
		
		// ���ڸ� �Է¹ޱ�
		// nextLine() ���͸� ġ�� ������ ��� ���ڸ�
		//            �����Ѵ�. Ư������, ������� �� �Է� ����
		// ��ü���� �ּҰ��� ���Ѵ�!! == ����ϸ�
		String LoginId = input.nextLine();
		if (LoginId.equals(dbId)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		// ���̵� �Է¹ް� ���̵��� ���̰�
		// 5�� �̻�~ 10�� ������ ��� ���̵� ���
		// �����մϴ�!
		
		int size = LoginId.length();
		System.out.println("���� ���� ����:" + size);
		if (5 <= size && size <= 10) {
			System.out.println("���̵� ��� ����!");
		} else {
			System.out.println("���̵� ��� �Ұ���!");
		}
		
		/*
		 * 1. ������ �ո� / �޸��� ���ڷ� �Է� �޴´�.
		 * 
		 * "�ո�", "�޸�" ���
		 * 
		 * 2. ���� �޴� ���ϱ�
		 * 	   "�߽�" �Է��� �ϸ� "¥��� ������?"
		 * 	   "�Ͻ�" �Է��� �ϸ� "�ʹ������?"
		 *     "�ѽ�" �Է��� �ϸ� "����������?"
		 *     �� �ܿ� ������ "�Ա�ȴ�!"
		 */
		// 1.
		System.out.println("�ո� Ȥ�� �޸��� �Է��ϼ���: ");
		String coin_direction = input.nextLine();
		if (coin_direction.equals("�ո�")) {
			System.out.println("�ո�");
		} else if (coin_direction.equals("�޸�")) {
			System.out.println("�޸�");
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		// 2.
		System.out.println("���� �޴� ������ :");
		String result = "";
		String dinner_menu = input.nextLine();
		if (dinner_menu.equals("�߽�")) {
			result = "¥��� ������?";
		} else if (dinner_menu.equals("�Ͻ�")) {
			result = "�ʹ������?";
		} else if (dinner_menu.equals("�ѽ�")) {
			result = "����������?";
		} else {
			result = "�Ա�ȴ�!";
		}
		System.out.println(result);
		
		// 3.
		// �����ձ� ����
		
		
	}
	

}
