package A73;

import java.util.Scanner;

public class dustmq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1부터 10까지 합한 결과 출력
		Scanner sc = new Scanner(System.in);
		int sum = 0, s = 0, e = 0;
		System.out.print("시작 숫자 : ");
		s = sc.nextInt();
		System.out.print("마지막 숫자 : ");
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
	System.out.println(s +"부터 "+e+"까지의 합계는 "+sum+"입니다.");
	}
}
