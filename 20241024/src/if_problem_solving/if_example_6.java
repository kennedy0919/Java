package if_problem_solving;

import java.util.Scanner;

public class if_example_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����� �Է��ϼ���:");
		String user_authority = input.next();
		
		String authority = "";
		if (user_authority.equals("������")) {
			authority = "ȸ������, �Խñ� ���� �Խñ� �ۼ�, "
					+ "��� �ۼ� �Խñ� ��ȸ";
		}
		if (user_authority.equals("ȸ��")) {
			authority = "�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�";
		}
		if (user_authority.equals("��ȸ��")) {
			authority = "�Խñ� ��ȸ";
		}
		System.out.println(authority);
	}

}
