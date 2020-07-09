package A79;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.예금 | 2.출금 | 3.잔고 | 4.종료
		Scanner sc = new Scanner(System.in);
		int num = 0, mi = 0, money = 0, mo = 0;
		boolean boo = true;
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		do {
			num = sc.nextInt();
			System.out.println("선택>" + num);
			if (num == 1) {
				System.out.println("예금액");
				mi = sc.nextInt();
				money += mi;
				System.out.println("현재 잔고는 :" + money + "원 입니다.");
			} else if (num == 2) {
				System.out.println("출금액");
				mo = sc.nextInt();
				if (mo > money) {
					System.out.println("잔액부족");
					System.out.println("현재 잔고는 :" + money + "원 입니다.");
				} else {
					money -= mo;
					System.out.println("현재 잔고는 :" + money + "원 입니다.");
				}
				
			} else if (num == 3) {
				System.out.println("잔액");
				System.out.println("현재 잔고는 :" + money + "원 입니다.");
			} else {
				System.out.println("프로그램이 종료되었습니다.");
				boo = false;
			}
		} while (boo);
	}
}
