package if_problem_solving;

import java.util.Scanner;

public class if_example_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���:");
		int menu = input.nextInt();
		String select_menu = "";
		if (menu == 1) {
			select_menu = "�Է�";
		} else if (menu == 2) {
			select_menu = "����";
		} else if (menu == 3) {
			select_menu = "��ȸ";
		} else if (menu == 4) {
			select_menu = "����";
		} else if (menu == 7) {
			System.out.println("���α׷��� ����˴ϴ�.");
		} else {
				System.out.println("�߸��� ��ȣ�� �Է��߽��ϴ�.");				
			}
		if (menu != 7) {
			System.out.println(select_menu + "�޴��Դϴ�.");
		}

	}

}
