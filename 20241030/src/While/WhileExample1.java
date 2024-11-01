package While;

import java.util.Random;
import java.util.Scanner;

public class WhileExample1 {

	public static void main(String[] args) {

		/* * # 랜덤학생 * 
		 * 1. 10회 반복을 한다. * 
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적) * 
		 * 3. 성적이 60점 이상이면 합격생이다. 
		 * * --------------------------------------- * . 
		 * 전교생(10명)의 총점과 평균을 출력한다. 
		 * * . 합격자 수를 출력한다. 
		 * * . 1등 학생의 번호와 성적을 출력한다. 
		 * */
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		
		int cnt = 1;
		int score = 0;
		int max_score_num = 0;
		int ans_student_num = 0; // 합격자 수
		int max_ans_score = 0;
		int sum_score = 0;
		while (cnt <= 10) {
			score = r.nextInt(100) + 1;
			System.out.println(cnt + "번 학생" + " score: " + score);
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
		System.out.println("총점: " + sum_score);
		System.out.println("평균: " + sum_score / (double) 10);
		System.out.println("합격자수: " + ans_student_num);
		System.out.println("1등 학생 번호: " + max_score_num);
		System.out.println("1등 학생 성적: " + max_ans_score);


	}

}
