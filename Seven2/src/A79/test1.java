package A79;

public class test1 {

	public static void main(String[] args) {
		// ������ �迭���� ����
		int num[];
		int[]num1;
		//�迭 �����ϸ鼭 �ʱⰪ ����
		int[] num2 = {1,2,3,4};
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		//String Ÿ�� �迭�� �����Ͽ� 
		//���� �ٿ� ���� 4���� �̸��� �����ϰ� ���.
		String[] str = {"�Ǵܱ�","����","�߿���","�ѻ��"};
		str[1] = "��ǻ��";
		String n ="";
		n = "����Į����";
		str[2] = n;
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		//str �迭�� ũ��� 4, ������ �ε����� 3
		//�迭�� ũ�� �� Ȱ���ϱ�
		System.out.println(str.length);
		// for���� �̿��Ͽ� �迭�� ����� �� ��� ����ϱ�
		for(int i=0; i<=str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
	}
}
