package While;

import java.util.Random;
import java.util.Scanner;

public class WhileExample1 {

	public static void main(String[] args) {

		/* * # �����л� * 
		 * 1. 10ȸ �ݺ��� �Ѵ�. * 
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����) * 
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�. 
		 * * --------------------------------------- * . 
		 * ������(10��)�� ������ ����� ����Ѵ�. 
		 * * . �հ��� ���� ����Ѵ�. 
		 * * . 1�� �л��� ��ȣ�� ������ ����Ѵ�. 
		 * */
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int cnt = 1;
		int score = 0;
		int max_score_num = 0;
		int ans_student_num = 0; // �հ��� ��
		int max_ans_score = 0;
		int sum_score = 0;
		while (cnt <= 10) {
			score = r.nextInt(100) + 1;
			System.out.println(cnt + "�� �л�" + " score: " + score);
			sum_score = sum_score + score;
			if (score >= 60) {
				ans_student_num = ans_student_num + 1;
				if (max_ans_score < score) {
					max_ans_score = score;
					max_score_num = cnt;
				}
			}
			cnt = cnt + 1;
		}
		System.out.println("����: " + sum_score);
		System.out.println("���: " + sum_score / (double) 10);
		System.out.println("�հ��ڼ�: " + ans_student_num);
		System.out.println("1�� �л� ��ȣ: " + max_score_num);
		System.out.println("1�� �л� ����: " + max_ans_score);


	}

}
