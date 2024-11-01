package While;

public class WhileEx1 {

	public static void main(String[] args) {
		
		// 1 부터 100까지 출력하는 반복문
//		int i = 1;
//		while (i <= 100) {
//			System.out.println(i);
//			i = i + 2;
//		}
		

//		while (i <= 100) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//			i = i + 1;
		
		// 10번 찍어 안 넘아가는 나무없다!
		int i = 1;
		while (i <= 10) {
			System.out.println(i + "번 찍었다!");
			i = i + 1;
		}
		System.out.println("10번찍어 안 넘어가는 나무없다!");
	}

}
