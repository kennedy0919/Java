package Loop;

public class WhileEx1 {

	public static void main(String[] args) {
		
		// �ݺ��Ǵ� �ڵ� Ȥ�� ���� ������ �ڵ����� �������ִ� ��!
		 // �ݺ��� 
		 // while , for 
		 
		 // while(���ε��� ����) {
		 //   ��� ���� ������ �ݺ����� ����!
		 // }
		 
		 // 1) �� ���� ������ ��ٸ���.
		// 
		// boolean result1 = true;
		// // �� ���� ������ ������ ��ٸ��ų� �ǹ����� ��ٸ���.
		// while(result1) {
		// System.out.println("�� ���� ���� ��ٸ���.!");
		// }
		// 
		// // �� �ȿ��� �ɾ �̵��Ѵ�.
		// System.out.println("�� �ȿ��� �̵��Ѵ�.");
		// 
		 /*
		 *  while(���ε��� �ݺ� true/false){
		 *     ���̸� �ݺ��� ����
		 *      
		 *  
		 *  } 
		 *  �����̸� �ݺ��� ����!
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
		 
		 //1���� 10���� ���ڸ� ���� 10�� �Ѿ�� �ݺ��� �����.
		 //�����ϴ� ��: 1
		 //������ �� : 10
		 //������ 1�� 
		 
		 int count = 1;
		 
		 while(count <= 10) {
		 System.out.println(count);
		 count = count +1;
		 }
		 
		 // ���α׷��� ������ ���� ����!
		 // ��ü! Ŭ����!
		 
		 // 5 4 3 2 1 ��!
		 // �����ϴ� ���� 5
		 // ������ ���� 1
		 // 1�� ����!
		 
		count = 5;
		
		while (count >= 1) {
			System.out.println(count--);
		}
		System.out.println("��!");
	}

}
