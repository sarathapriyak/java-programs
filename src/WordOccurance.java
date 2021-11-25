import java.util.HashSet;
import java.util.LinkedHashSet;

public class WordOccurance {

	public static void main(String[] args) {
		String s = "Welcome to TestYantra";
		String str[] = s.split(" ");
//Creating a set
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
//comparing each char in set with each char in string
		for (String word : set) {
			int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (word.equals(str[i])) {
					// if char is matching increament count
					count++;
				}

			}
			// print the unique char

			System.out.print(word + " " + count);
		}

	}

}
