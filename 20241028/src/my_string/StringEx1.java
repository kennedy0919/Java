package my_string;

public class StringEx1 {

	public static void main(String[] args) {
 // String 타입!(자료형)
 //  - S는 대문자로 작성!
 //  - 여러 개의 문자를 저장하는 타입!
 //  - 문자들의 연속된 집합!
 //  - 문자 여러개를 저장할 때는 시작 " "안에 작성!
 String name = "이서희";
 String name2 = "이서희";
 
 String text = " Hi~!!";
 
 // 문자와 문자는 연결
 // 더하기 기호가 두 문장을 붙여준다.
 System.out.println(name + text);
 
 // 빼기, 곱하기, 나눗셈 문자열에서 사용할 수
 // 없다!
 // System.out.println(name / text);
 
 String str = "오늘은 5번째 " +
             "10분 일찍 시작했어요!"+
     "수요일까지만 10분 전" +
             "오시면 되요~";
 
 // 문자에 관한 기능
 // 문자 여러개의 길이(사이즈)
 // 문자 개수
 System.out.println(str.length());
 
 // 문자를 비교할 때 
 // 기준.equals(비교대상) 문자열이 같으면 true
 //                 다르면 false
 //   대소문자 비교!
 boolean result = str.equals("hello");
 System.out.println(result);
 
 String str2 = "LeeSeoHee";
 String str3 = "leeseohee";
 
 boolean result2 = str2.equals(str3);
 System.out.println("result2 :" + result2);
 
 String str4 = "LeeSeoHee";
 String str5 = "leeseohee";
 
 boolean result3 = str4.equalsIgnoreCase(str5);
 System.out.println("result3 :" + result3);
 
 
 
 // 자바버전(JDK)
 // 자바 13번전부터는 여러줄을 한번에 작성
// String str2 = """ "
// 여러줄을 마음대로 
// 문자열 처리를 할 수
// 있습니다1
// 아주 편하게 변경되었지요?""";
 
 
 
 
	}
}