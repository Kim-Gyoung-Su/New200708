package A72;

import java.util.Scanner;

public class zzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int A = 0 , B = 0;
System.out.println("ù��° ���ڸ� �Է��ϼ��� : ");
A = sc.nextInt();
System.out.println("�ι�° ���ڸ� �Է��ϼ��� : ");
B = sc.nextInt();
if(A == B) {System.out.println("�Է°��� �����ϴ�.");}
else {
	if(A > B) {System.out.println("A�ǰ��� �� Ů�ϴ�");}
	else {System.out.println("B�ǰ��� �� Ů�ϴ�");}
sc.close();
}
}
}
	