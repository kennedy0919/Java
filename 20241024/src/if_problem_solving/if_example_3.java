package if_problem_solving;

import java.util.Scanner;

public class if_example_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요:");
		int korean = input.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int english = input.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int math = input.nextInt();
		
		String result = "";
		double average = (korean + english + math) / (double) 3;
		if (average >= 60 && korean >= 40 && 
				english >= 40 && math >= 40) {
			result = "축하합니다,합격입니다!";
		} else {
			result = "불합격입니다.";
		}
		System.out.println(result);
	}

}
