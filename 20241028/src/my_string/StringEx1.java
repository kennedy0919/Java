package my_string;

public class StringEx1 {

	public static void main(String[] args) {
 // String Ÿ��!(�ڷ���)
 //  - S�� �빮�ڷ� �ۼ�!
 //  - ���� ���� ���ڸ� �����ϴ� Ÿ��!
 //  - ���ڵ��� ���ӵ� ����!
 //  - ���� �������� ������ ���� ���� " "�ȿ� �ۼ�!
 String name = "�̼���";
 String name2 = "�̼���";
 
 String text = " Hi~!!";
 
 // ���ڿ� ���ڴ� ����
 // ���ϱ� ��ȣ�� �� ������ �ٿ��ش�.
 System.out.println(name + text);
 
 // ����, ���ϱ�, ������ ���ڿ����� ����� ��
 // ����!
 // System.out.println(name / text);
 
 String str = "������ 5��° " +
             "10�� ���� �����߾��!"+
     "�����ϱ����� 10�� ��" +
             "���ø� �ǿ�~";
 
 // ���ڿ� ���� ���
 // ���� �������� ����(������)
 // ���� ����
 System.out.println(str.length());
 
 // ���ڸ� ���� �� 
 // ����.equals(�񱳴��) ���ڿ��� ������ true
 //                 �ٸ��� false
 //   ��ҹ��� ��!
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
 
 
 
 // �ڹٹ���(JDK)
 // �ڹ� 13�������ʹ� �������� �ѹ��� �ۼ�
// String str2 = """ "
// �������� ������� 
// ���ڿ� ó���� �� ��
// �ֽ��ϴ�1
// ���� ���ϰ� ����Ǿ�����?""";
 
 
 
 
	}
}