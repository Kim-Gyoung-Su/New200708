package A78;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, i = 0;
		boolean bool = true;
		do {
			System.out.print(i);
			i++;
			if (i % 2 == 0) {
				System.out.print("-");
				sum -= i;
			} else {
				System.out.print("+");
				sum += i;
			}
			if (sum >= 100) {
				bool = false;
			}
		} while (bool);
		System.out.println(i);
	}
}  
