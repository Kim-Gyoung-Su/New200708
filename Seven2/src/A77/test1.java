package A77;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* do while�� ������ �ѹ� ���� �Ѵ�.
 * ������ ������ ������ �ݺ� �ƴϸ� �ߴ�
 * do {�ݺ� ���೻��
 * }while(�ݺ�����);
 */
		
		int i=10;
		boolean boo = true;
		System.out.println("�ݺ��� ���� �� ");
		do {
			System.out.println("do while�� i�� : "+i);
			if(i==20) {
				boo = false;
			}
		i++;
		}while(boo);
		System.out.println("�ݺ��� ���� ��");
	}

}
