package A77;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* do while은 무조건 한번 실행 한다.
 * 실행후 조건이 맞으면 반복 아니면 중단
 * do {반복 실행내용
 * }while(반복조건);
 */
		
		int i=10;
		boolean boo = true;
		System.out.println("반복문 시작 전 ");
		do {
			System.out.println("do while문 i값 : "+i);
			if(i==20) {
				boo = false;
			}
		i++;
		}while(boo);
		System.out.println("반복문 종류 후");
	}

}
