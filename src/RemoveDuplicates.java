import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "welcome to welcome";
		String str[] = s.split(" ");
		// Creating a set
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
		// comparing each char in set with each char in string
		for (String word : set) {
		/*	int count = 0;
			for (int i = 0; i < str.length; i++) {
				if (word.equals(str[i])) {
					// if char is matching increament count
					count++;*/
			System.out.println(word);
				}
			}
			// if(count==1)

			//System.out.println(word + " ");

			// print the unique char

		

	}


