package A78;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0, ex = 0;
		boolean roma = true;
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���");
		while (roma) {
			num = sc.nextInt();
			if (num != 0) {
				sum += num;
				ex++;
			} else {
				roma = false;
			}
		}
		System.out.println("�Է��� ��" + ex+"��");
		System.out.println("��� : " + sum / ex);
	}
}