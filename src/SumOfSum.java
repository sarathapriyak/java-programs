
public class SumOfSum {

	public static void main(String[] args) {
		int n = 897;
		while (n > 9) {
			int sum = 0;
			while (n > 0) {
				int num = n % 10;
				sum = sum + num;
				n=n/10;

			}
			n = sum;
		}
		System.out.println(n);
	}
}
