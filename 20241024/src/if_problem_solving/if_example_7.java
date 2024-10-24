package if_problem_solving;

import java.util.Scanner;

public class if_example_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키(m)를 입력해 주세요:");
		double hight = input.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요:");
		double weight = input.nextDouble();
		
		double bmi = weight / (hight * hight);
		
		String result = "";
		if (bmi < 18.5) {
			result = "저체중";
		} else if (18.5 <= bmi && bmi < 23) {
			result = "정상체중";
		} else if (23 <= bmi && bmi < 25) {
			result = "과체중";
		} else if (25 <= bmi && bmi < 30) {
			result = "비만";
		} else if (30 <= bmi) {
			result = "고도비만";
		}
		System.out.println(result);
	}

}
