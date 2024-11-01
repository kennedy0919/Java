package Loop;

public class WhileEx1 {

	public static void main(String[] args) {
		
		// 반복되는 코드 혹은 일을 여러번 자동으로 실행해주는 것!
		 // 반복문 
		 // while , for 
		 
		 // while(참인동안 실행) {
		 //   어디서 부터 어디까지 반복문을 실행!
		 // }
		 
		 // 1) 비가 멈출 때까지 기다린다.
		// 
		// boolean result1 = true;
		// // 비가 오는 동안은 집에서 기다리거나 건물에서 기다린다.
		// while(result1) {
		// System.out.println("비가 오는 동안 기다린다.!");
		// }
		// 
		// // 비가 안오면 걸어서 이동한다.
		// System.out.println("비가 안오니 이동한다.");
		// 
		 /*
		 *  while(참인동안 반복 true/false){
		 *     참이면 반복을 실행
		 *      
		 *  
		 *  } 
		 *  거짓이면 반복문 멈춤!
		 * 
		 */
		 
		 
		 System.out.println(1);
		 System.out.println(2);
		 System.out.println(3);
		 System.out.println(4);
		 System.out.println(5);
		 System.out.println(6);
		 System.out.println(7);
		 System.out.println(8);
		 System.out.println(9);
		 System.out.println(10);
		 
		 //1부터 10까지 숫자를 새고 10이 넘어가면 반복을 멈춘다.
		 //시작하는 수: 1
		 //끝나는 수 : 10
		 //증가는 1씩 
		 
		 int count = 1;
		 
		 while(count <= 10) {
		 System.out.println(count);
		 count = count +1;
		 }
		 
		 // 프로그램이 끝나도 값을 유지!
		 // 객체! 클래스!
		 
		 // 5 4 3 2 1 땡!
		 // 시작하는 값은 5
		 // 끝나는 값은 1
		 // 1씩 감소!
		 
		count = 5;
		
		while (count >= 1) {
			System.out.println(count--);
		}
		System.out.println("땡!");
	}

}
