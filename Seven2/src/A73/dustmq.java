package A73;

import java.util.Scanner;

public class dustmq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1���� 10���� ���� ��� ���
		Scanner sc = new Scanner(System.in);
		int sum = 0, s = 0, e = 0;
		System.out.print("���� ���� : ");
		s = sc.nextInt();
		System.out.print("������ ���� : ");
		e = sc.nextInt();
		for (int num = s; num <= e; num++) {
		sum += num;
		System.out.print(num);
		if (num < e) {
			System.out.print(" + ");
		} else {
			System.out.print(" = ");
			System.out.println(sum);
		}
		}
	System.out.println(s +"���� "+e+"������ �հ�� "+sum+"�Դϴ�.");
	}
}
