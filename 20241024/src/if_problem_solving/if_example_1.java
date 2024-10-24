package if_problem_solving;

import java.util.Scanner;

public class if_example_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("메뉴 번호를 입력하세요:");
		int menu = input.nextInt();
		String select_menu = "";
		if (menu == 1) {
			select_menu = "입력";
		} else if (menu == 2) {
			select_menu = "수정";
		} else if (menu == 3) {
			select_menu = "조회";
		} else if (menu == 4) {
			select_menu = "삭제";
		} else if (menu == 7) {
			System.out.println("프로그램이 종료됩니다.");
		} else {
				System.out.println("잘못된 번호를 입력했습니다.");				
			}
		if (menu != 7) {
			System.out.println(select_menu + "메뉴입니다.");
		}

	}

}
