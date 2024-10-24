package if_problem_solving;

import java.util.Scanner;

public class if_example_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("등급을 입력하세요:");
		String user_authority = input.next();
		
		String authority = "";
		if (user_authority.equals("관리자")) {
			authority = "회원관리, 게시글 관리 게시글 작성, "
					+ "댓글 작성 게시글 조회";
		}
		if (user_authority.equals("회원")) {
			authority = "게시글 작성, 게시글 조회, 댓글 작성";
		}
		if (user_authority.equals("비회원")) {
			authority = "게시글 조회";
		}
		System.out.println(authority);
	}

}
