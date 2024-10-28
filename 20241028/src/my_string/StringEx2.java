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
		String LoginId = input.nextLine();
		if (LoginId.equals(dbId)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}

}
