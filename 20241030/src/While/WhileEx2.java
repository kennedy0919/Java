package While;

// WhileEx2 �ڹ������� �������� �� �� Random ������ �����ؼ�
// ����� ����ϰڴ�!
import java.util.Random;
import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1. ��ǻ�Ͱ� ������ �����ߴ�!
		int com = 8;

		// 2. me�� ���ڸ� �ϳ��Է¹޴´�.

		// 3. �ؿ� �ڵ带 �ݺ��ϱ� ���ؼ� ������ �����ϴ� ����
// int count = 1;
//
// while (count <= 5) {
//
// System.out.println("����:");
// int me = a.nextInt();
// String result3 = "";
//
// if (me == com) {
// result3 = "�����Դϴ�~";
// } else {
// if (me > com) { // ���� �Է��� ���ڰ� ũ��!
// result3 = "Down!";
// } else { // �۴�.
// result3 = "Up!";
// }
// }
// System.out.println(result3);
// 
// // while �� ���� �ݺ��� �Ͼ �� �ִ�.
// // �����ϴ� ���� �����ϰų� �����ؼ� ���ѹݺ���
// // ���ƾߵȴ�.
// count = count +1;
// }
		// �ڵ����� �ּ�ó��(�޸�ó��)����Ű
		// ctrl + /

		// ������
		// Ű����� ���� �Է��ϸ�
		// 1���� 9���� ���� ���� ���!
		// �� ���!

		// �����ϴ� ���� 1
		// ������ ���� 9
		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 3 = 15

// int count = 1; // ���ϴ� ��!
//
// // 5�� 3�� 8��
// Scanner a = new Scanner(System.in);
// System.out.print("�� :");
// int dan = a.nextInt();
//
// while (count <= 9) {
// System.out.println(dan * count);
// count = count + 1;
// }

		/*
		 * ���� �˰��� A + B �� �����鸸 Ǯ�� �𸣴� ������ �Ѿ �ȴ�!
		 * 
		 * 
		 * # 369����[2�ܰ�] 1. 1~50���� �ݺ��� �Ѵ�. 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�. ��) 1 2 ¦ 4 5
		 * ¦ 7 8 ¦ 10 11 12 ¦ ...
		 * 
		 * 
		 */

		// ���α׷����� ������ ���ڰ��� ���� �� ����ϴ�
		// ���̺귯��(����)

		Random r = new Random();

		// ���� ������ ������ �ִ� nextInt()
		// -21�� ���� + 21����̿� �ƹ� ���ڳ�
		// �̴´�.
		System.out.println(r.nextInt());

		// 1~3���̿� ������ ���ڸ� �̰� �ʹ�!
		// nextInt(����) 0���� ����-1
		// 0 1 2 ���̿��� ���ڸ� �ϳ� �̴´�.
		System.out.println(r.nextInt(3));

		// r.nextInt(����) +�����ϴ� ��
		// 1���� 3������ ���� �߿��� �ϳ����̴´�.
		System.out.println(r.nextInt(3) + 1);

		System.out.println(r.nextInt(50) + 100);

		// �ζǼ��� 6���� ���
		// �ߺ��� �ǵ� �������!
		

	}
}