
public class StringSort {

	public static void main(String[] args) {
		String s[] = { "hi", "hello", "a", "sun", "good" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 1) {
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

}
