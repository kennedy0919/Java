package if_problem_solving;

import java.util.Scanner;

public class if_example_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("중간 고사 점수:");
		int middle_test_score = input.nextInt();
		System.out.println("기말 고사 점수:");
		int final_test_score = input.nextInt();
		System.out.println("과제 점수:");
		int task = input.nextInt();
		System.out.println("출석 회수:");
		int attendance = input.nextInt();
		
		String result = "";
		double sum_score = (middle_test_score * (double) 0.2) 
				+ (final_test_score * (double) 0.3)
				+ (task * (double) 0.3)
				+ (attendance * (double) 0.05 * 20);
		if (sum_score >= 70) {
			result = "PASS";
		}
		if(sum_score < 70) {
			result = "Fail [점수미달]";
		}
		if(attendance <= 14) {
			result = "Fail [출석 회수 부족 (" + attendance + "/20)]";
		}
		
		System.out.println("======== 결과 ========");
		System.out.println("중간고사 점수(20):" + " " + (middle_test_score * (double) 0.2));
		System.out.println("기말고사 점수(30):" + " " + (final_test_score * (double) 0.3));
		System.out.println("과제 점수(30):" + " " + (task * (double) 0.3));
		System.out.println("출석 점수(20):" + " " +(attendance * (double) 0.05 * 20));
		System.out.println("총점:" + " " +(sum_score));
		
		System.out.println(result);			
		

	}

}
