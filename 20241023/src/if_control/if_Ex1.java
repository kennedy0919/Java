package if_control; //폴더명

//키보드로 입력받기 가능하다!
import java.util.Scanner;

public class if_Ex1 { // 파일명

	public static void main(String[] args) {

		// 조건문
		// - 어떤 조건이 만족을 하면 실행하고 만족하지 않을때는 어떤식으로
		// 실행하는 명령문!

		// 로그인 할 때
		// 비밀번호랑 아이디가 똑같다(회원가입할때랑)
		// 메인 창을 보여준다.

		// 비밀번호랑 아이가 다르다(로그인창에 남아있는다)
		// if ~만약에
		/*
		 * if(true/ false){ 참일 경우 실행~! }
		 * 
		 * 실행 (ctrl + f11)
		 */
// if(true) {
// System.out.println("참이네? 실행해라!");
// }
// 
// if(false) {
// System.out.println("거짓이네? 실행해라!");
// }
// 
		// 2차인증 번호 6자리를 숫자로 키보드로 입력 해보기
		Scanner input = new Scanner(System.in);

// // 가입할 때 입력한 비밀번호!
// int password = 123456;
//
// // 계좌이체를 하기 위해서 2차비밀번호를 입력!
// System.out.println("2차 비밀번호: ");
// int nowPasswd = input.nextInt();
//
// // 비밀번호가 맞으면 계좌이체 성공!
// // 안 맞으면 비밀번호를 확인하세요!
// if (password == nowPasswd) {
// System.out.println("계좌이체 성공!");
// }
//
// if (password != nowPasswd) {
// System.out.println("비밀번호를 확인하세요!");
// }
//
// // 자격증 시험 60점이상이 되면 합격!
// // 미만 불합격!
//
// System.out.println("당신의 점수:");
// int score = input.nextInt();
//
// if (score >= 60) {
// System.out.println("합격!");
// }
//
// if (score < 60) {
// System.out.println("불합격!");
// }

		// 나이를 기준으로 20세 이상이면 성인
		// 20세 미만 청소년!

		// 코드를 작성할 때 중복적으로 단어가
		// 계속 나오는 System.out.println()
		System.out.println("나이 :");
		int age = input.nextInt();

		// 문자를 저장하는 공간
		// 문자여러개를 저장하는 타입은 String
		// 결과를 저장하는 공간!
		String result = "";

		if (age >= 20) {

			result = "성인";
		}
		if (age < 20) {
			result = "청소년";
		}
		// 결과를 한번에 출력!
		System.out.println(result);

		//버스요금
		// 무료 대상 8세 미만 0원
		// 		 65세 이상 0원
		// 20세 이상 1500원
		System.out.println("나이 :");
		int age1 = input.nextInt();
		
		
		// 자동 정렬 단축키
		// ctrl + shift + f

	}
}