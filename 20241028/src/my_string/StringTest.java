package my_string;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		// ȸ�������� �޴� �޴�!
		// 1���� ������ ȸ������!
		// ���̵�, ��й�ȣ�� �Է� �޾Ƽ� newId, newPw �Է¹ޱ�
		
		// 2���� ������ �α���!
		//   ������ �Է¹��� ȸ�����԰� ���� �α����Է�
		// ���ؼ� �α��� ����, �α��� ����!
		
		Scanner input = new Scanner(System.in);
		
		String newId = "", newPw = "";
		System.out.println("1. ȸ������ 2. �α���");
		System.out.print(" >");
		
		int menu = input.nextInt();
		
		input.nextLine();
		
		if (menu == 1) {
			System.out.println("==== ȸ������ â ====");
			System.out.print("���̵� �Է��ϼ���: ");
			newId = input.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���: ");
			newPw = input.nextLine();
		} else if (menu == 2) {
			System.out.println("==== �α��� â ====");
			System.out.print("���̵�: ");
			String LoginId = input.nextLine();
			System.out.println("��й�ȣ: ");
			String LoginPw = input.nextLine();
			
			if (newId.equals(LoginId)) {
				
			}
			
			
		} else {
			System.out.println("����� �Է��ض�!");
		}
	}

}
