package A79;

public class test1 {

	public static void main(String[] args) {
		// 정수형 배열변수 선언
		int num[];
		int[]num1;
		//배열 선언하면서 초기값 지정
		int[] num2 = {1,2,3,4};
		System.out.println(num2[2]);
		System.out.println(num2[3]);
		//String 타입 배열을 선언하여 
		//같은 줄에 앉은 4명의 이름을 저장하고 출력.
		String[] str = {"권단군","김경수","추영제","한상욱"};
		str[1] = "컴퓨터";
		String n ="";
		n = "엑스칼리버";
		str[2] = n;
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str[2]);
		System.out.println(str[3]);
		//str 배열의 크기는 4, 마지막 인덱스는 3
		//배열의 크기 값 활용하기
		System.out.println(str.length);
		// for문을 이용하여 배열에 저장된 값 모두 출력하기
		for(int i=0; i<=str.length; i++) {
			System.out.println(str[i]);
		}
		
		
		
		
		
	}
}
