package if_problem_solving;

import java.util.Scanner;

public class if_example_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String id = "myId";
		String pw = "myPassword12";
		System.out.println("���̵� �Է��ϼ���:");
		String input_id = input.next();
		System.out.println("��й�ȣ�� �Է��ϼ���:");
		String input_pw = input.next();
		
		// Java���� ���ڿ����Ҷ� == ����ϸ� �ּҰ���
		// equals�� ����ؾ� ���� ���Ѵ�
		if (id.equals(input_id) && pw.equals(input_pw)) {
			System.out.println("�α��� ����");
		}
		if (!id.equals(input_id)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		if (!pw.equals(input_pw)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
}
