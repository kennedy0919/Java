package if_control; //������

//Ű����� �Է¹ޱ� �����ϴ�!
import java.util.Scanner;

public class if_Ex1 { // ���ϸ�

	public static void main(String[] args) {

		// ���ǹ�
		// - � ������ ������ �ϸ� �����ϰ� �������� �������� �������
		// �����ϴ� ��ɹ�!

		// �α��� �� ��
		// ��й�ȣ�� ���̵� �Ȱ���(ȸ�������Ҷ���)
		// ���� â�� �����ش�.

		// ��й�ȣ�� ���̰� �ٸ���(�α���â�� �����ִ´�)
		// if ~���࿡
		/*
		 * if(true/ false){ ���� ��� ����~! }
		 * 
		 * ���� (ctrl + f11)
		 */
// if(true) {
// System.out.println("���̳�? �����ض�!");
// }
// 
// if(false) {
// System.out.println("�����̳�? �����ض�!");
// }
// 
		// 2������ ��ȣ 6�ڸ��� ���ڷ� Ű����� �Է� �غ���
		Scanner input = new Scanner(System.in);

// // ������ �� �Է��� ��й�ȣ!
// int password = 123456;
//
// // ������ü�� �ϱ� ���ؼ� 2����й�ȣ�� �Է�!
// System.out.println("2�� ��й�ȣ: ");
// int nowPasswd = input.nextInt();
//
// // ��й�ȣ�� ������ ������ü ����!
// // �� ������ ��й�ȣ�� Ȯ���ϼ���!
// if (password == nowPasswd) {
// System.out.println("������ü ����!");
// }
//
// if (password != nowPasswd) {
// System.out.println("��й�ȣ�� Ȯ���ϼ���!");
// }
//
// // �ڰ��� ���� 60���̻��� �Ǹ� �հ�!
// // �̸� ���հ�!
//
// System.out.println("����� ����:");
// int score = input.nextInt();
//
// if (score >= 60) {
// System.out.println("�հ�!");
// }
//
// if (score < 60) {
// System.out.println("���հ�!");
// }

		// ���̸� �������� 20�� �̻��̸� ����
		// 20�� �̸� û�ҳ�!

		// �ڵ带 �ۼ��� �� �ߺ������� �ܾ
		// ��� ������ System.out.println()
		System.out.println("���� :");
		int age = input.nextInt();

		// ���ڸ� �����ϴ� ����
		// ���ڿ������� �����ϴ� Ÿ���� String
		// ����� �����ϴ� ����!
		String result = "";

		if (age >= 20) {

			result = "����";
		}
		if (age < 20) {
			result = "û�ҳ�";
		}
		// ����� �ѹ��� ���!
		System.out.println(result);

		//�������
		// ���� ��� 8�� �̸� 0��
		// 		 65�� �̻� 0��
		// 20�� �̻� 1500��
		System.out.println("���� :");
		int age1 = input.nextInt();
		
		
		// �ڵ� ���� ����Ű
		// ctrl + shift + f

	}
}