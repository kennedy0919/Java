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
		String LoginId = input.nextLine();
		if (LoginId.equals(dbId)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}

}
