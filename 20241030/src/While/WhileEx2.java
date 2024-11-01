package While;

// WhileEx2 자바파일이 컴파일을 할 때 Random 도구를 포함해서
// 기능을 사용하겠다!
import java.util.Random;
import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		// 1. 컴퓨터가 정답을 저장했다!
		int com = 8;

		// 2. me는 숫자를 하나입력받는다.

		// 3. 밑에 코드를 반복하기 위해서 개수를 저장하는 변수
// int count = 1;
//
// while (count <= 5) {
//
// System.out.println("숫자:");
// int me = a.nextInt();
// String result3 = "";
//
// if (me == com) {
// result3 = "정답입니다~";
// } else {
// if (me > com) { // 내가 입력한 숫자가 크다!
// result3 = "Down!";
// } else { // 작다.
// result3 = "Up!";
// }
// }
// System.out.println(result3);
// 
// // while 은 무한 반복이 일어날 수 있다.
// // 시작하는 값을 증가하거나 감소해서 무한반복을
// // 막아야된다.
// count = count +1;
// }
		// 자동으로 주석처리(메모처리)단축키
		// ctrl + /

		// 구구단
		// 키보드로 단을 입력하면
		// 1부터 9까지 곱한 값을 출력!
		// 값 출력!

		// 시작하는 값은 1
		// 끝나는 값은 9
		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 3 = 15

// int count = 1; // 곱하는 수!
//
// // 5단 3단 8단
// Scanner a = new Scanner(System.in);
// System.out.print("단 :");
// int dan = a.nextInt();
//
// while (count <= 9) {
// System.out.println(dan * count);
// count = count + 1;
// }

		/*
		 * 백준 알고리즘 A + B 요 문제들만 풀기 모르는 내용은 넘어가 된다!
		 * 
		 * 
		 * # 369게임[2단계] 1. 1~50까지 반복을 한다. 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다. 예) 1 2 짝 4 5
		 * 짝 7 8 짝 10 11 12 짝 ...
		 * 
		 * 
		 */

		// 프로그램에서 랜덤한 숫자값을 뽑을 때 사용하는
		// 라이브러리(도구)

		Random r = new Random();

		// 랜덤 도구가 가지고 있는 nextInt()
		// -21억 부터 + 21억사이에 아무 숫자나
		// 뽑는다.
		System.out.println(r.nextInt());

		// 1~3사이에 랜덤한 숫자를 뽑고 싶다!
		// nextInt(개수) 0부터 개수-1
		// 0 1 2 사이에서 숫자를 하나 뽑는다.
		System.out.println(r.nextInt(3));

		// r.nextInt(개수) +시작하는 수
		// 1부터 3사이의 숫자 중에서 하나를뽑는다.
		System.out.println(r.nextInt(3) + 1);

		System.out.println(r.nextInt(50) + 100);

		// 로또숫자 6개를 출력
		// 중복이 되도 상관없다!
		

	}
}