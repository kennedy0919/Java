package my_string;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		
		// 회원가입시 아이디를 저장
		String dbId = "qwer";
		
		// 로그인 할때는 키보드로 입력받기
		// 키보드로 입력을 받을 때는 input변수에서
		// 원하는 기능을 가지고 가서 키보드로 입력 받으면 된다.
		Scanner input = new Scanner(System.in);
		
		// 문자를 입력받기
		// nextLine() 엔터를 치기 전까지 모든 문자를
		//            저장한다. 특수문자, 공백까지 다 입력 가능
		// 객체들은 주소값을 비교한다!! == 사용하면
		String LoginId = input.nextLine();
		if (LoginId.equals(dbId)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 아이디를 입력받고 아이디의 길이가
		// 5자 이상~ 10자 이하일 경우 아이디를 사용
		// 가능합니다!
		
		int size = LoginId.length();
		System.out.println("현재 문자 길이:" + size);
		if (5 <= size && size <= 10) {
			System.out.println("아이디 사용 가능!");
		} else {
			System.out.println("아이디 사용 불가능!");
		}
		
		/*
		 * 1. 동전의 앞면 / 뒷면을 문자로 입력 받는다.
		 * 
		 * "앞면", "뒷면" 출력
		 * 
		 * 2. 저녁 메뉴 정하기
		 * 	   "중식" 입력을 하면 "짜장면 먹을래?"
		 * 	   "일식" 입력을 하면 "초밥먹을래?"
		 *     "한식" 입력을 하면 "비빔밥먹을래?"
		 *     그 외에 음식은 "먹기싫다!"
		 */
		// 1.
		System.out.println("앞면 혹은 뒷면을 입력하세요: ");
		String coin_direction = input.nextLine();
		if (coin_direction.equals("앞면")) {
			System.out.println("앞면");
		} else if (coin_direction.equals("뒷면")) {
			System.out.println("뒷면");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// 2.
		System.out.println("저녁 메뉴 정하자 :");
		String result = "";
		String dinner_menu = input.nextLine();
		if (dinner_menu.equals("중식")) {
			result = "짜장면 먹을래?";
		} else if (dinner_menu.equals("일식")) {
			result = "초밥먹을래?";
		} else if (dinner_menu.equals("한식")) {
			result = "비빔밥먹을래?";
		} else {
			result = "먹기싫다!";
		}
		System.out.println(result);
		
		// 3.
		// 끝말잇기 게임
		
		
	}
	

}
