package A79;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.���� | 2.��� | 3.�ܰ� | 4.����
		Scanner sc = new Scanner(System.in);
		int num = 0, mi = 0, money = 0, mo = 0;
		boolean boo = true;
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		do {
			num = sc.nextInt();
			System.out.println("����>" + num);
			if (num == 1) {
				System.out.println("���ݾ�");
				mi = sc.nextInt();
				money += mi;
				System.out.println("���� �ܰ�� :" + money + "�� �Դϴ�.");
			} else if (num == 2) {
				System.out.println("��ݾ�");
				mo = sc.nextInt();
				if (mo > money) {
					System.out.println("�ܾ׺���");
					System.out.println("���� �ܰ�� :" + money + "�� �Դϴ�.");
				} else {
					money -= mo;
					System.out.println("���� �ܰ�� :" + money + "�� �Դϴ�.");
				}
				
			} else if (num == 3) {
				System.out.println("�ܾ�");
				System.out.println("���� �ܰ�� :" + money + "�� �Դϴ�.");
			} else {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				boo = false;
			}
		} while (boo);
	}
}
