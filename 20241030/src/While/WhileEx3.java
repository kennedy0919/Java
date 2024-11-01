package While;

import java.util.Random;
import java.util.Scanner;

public class WhileEx3 {

	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner input = new Scanner(System.in);
		int cnt = 1;
		// 변수 선언은 밖에서 하자 ㅎㅎ
		int score = 0;
		
		while (cnt <= 5) {
			int num1 = 0;
			int num2 = 0;
			int ans = 0;
			
			num1 = r.nextInt(9) + 1;
			num2 = r.nextInt(9) + 1;
			ans = num1 * num2;
			
			System.out.print(num1 + "*" + num2 + "=");
			int input_ans = input.nextInt();
			if (input_ans == ans) {
				System.out.println("정답");
				score = score + 20;
			} else {
				System.out.println("땡!");
			}
			cnt = cnt + 1;
		}
		System.out.println("점수:" + score);
	}

}
