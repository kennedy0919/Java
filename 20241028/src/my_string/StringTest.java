package my_string;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		// 회원가입을 받는 메뉴!
		// 1번을 누르면 회원가입!
		// 아이디, 비밀번호를 입력 받아서 newId, newPw 입력받기
		
		// 2번을 누르면 로그인!
		//   위에서 입력받은 회원가입과 현재 로그인입력
		// 비교해서 로그인 성공, 로그인 실패!
		
		Scanner input = new Scanner(System.in);
		
		String newId = "", newPw = "";
		System.out.println("1. 회원가입 2. 로그인");
		System.out.print(" >");
		
		int menu = input.nextInt();
		
		input.nextLine();
		
		if (menu == 1) {
			System.out.println("==== 회원가입 창 ====");
			System.out.print("아이디를 입력하세요: ");
			newId = input.nextLine();
			System.out.println("비밀번호를 입력하세요: ");
			newPw = input.nextLine();
		} else if (menu == 2) {
			System.out.println("==== 로그인 창 ====");
			System.out.print("아이디: ");
			String LoginId = input.nextLine();
			System.out.println("비밀번호: ");
			String LoginPw = input.nextLine();
			
			if (newId.equals(LoginId)) {
				
			}
			
			
		} else {
			System.out.println("제대로 입력해라!");
		}
	}

}
