package if_problem_solving;

import java.util.Scanner;

public class if_example_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.println("���� :");
		int choice = input.nextInt();
		System.out.println("(�ǽ�����" + choice + " " + "����)");
		
		if (choice == 1) {
			if_example_1.main(args);
		} else if (choice == 2) {
			if_example_2.main(args);
		} else if (choice == 3) {
			if_example_3.main(args);
		} else if (choice == 4) {
			if_example_4.main(args);
		} else if (choice == 5) {
			if_example_5.main(args);
		} else if (choice == 6) {
			if_example_6.main(args);
		} else if (choice == 7) {
			if_example_7.main(args);
		} else if (choice == 8) {
			if_example_8.main(args);
		} else if (choice == 9) {
			if_example_9.main(args);
		} else {
			System.out.println("�߸��Է� �ϼ̽��ϴ�");
		}

	}

}
