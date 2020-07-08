package A78;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0, sum = 0, ex = 0;
		boolean roma = true;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		while (roma) {
			num = sc.nextInt();
			if (num != 0) {
				sum += num;
				ex++;
			} else {
				roma = false;
			}
		}
		System.out.println("입력한 수" + ex+"개");
		System.out.println("평균 : " + sum / ex);
	}
}