package A72;

import java.util.Scanner;

public class zzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int A = 0 , B = 0;
System.out.println("첫번째 숫자를 입력하세요 : ");
A = sc.nextInt();
System.out.println("두번째 숫자를 입력하세요 : ");
B = sc.nextInt();
if(A == B) {System.out.println("입력값이 같습니다.");}
else {
	if(A > B) {System.out.println("A의값이 더 큽니다");}
	else {System.out.println("B의값이 더 큽니다");}
sc.close();
}
}
}
	