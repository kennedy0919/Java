package if_problem_solving;

import java.util.Scanner;

public class if_example_5 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String id = "myId";
		String pw = "myPassword12";
		System.out.println("아이디를 입력하세요:");
		String input_id = input.next();
		System.out.println("비밀번호를 입력하세요:");
		String input_pw = input.next();
		
		// Java에서 문자열비교할때 == 사용하면 주소값비교
		// equals를 사용해야 값을 비교한다
		if (id.equals(input_id) && pw.equals(input_pw)) {
			System.out.println("로그인 성공");
		}
		if (!id.equals(input_id)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		if (!pw.equals(input_pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
}
