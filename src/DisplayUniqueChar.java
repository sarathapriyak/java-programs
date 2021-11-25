import java.util.HashSet;
import java.util.LinkedHashSet;

public class DisplayUniqueChar {

	public static void main(String[] args) {
		String s="apartment";
		//Creating a set
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		//comparing each char in set with each char in string
		for(char ch:set)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					//if char is matching increament count
					count++;
				}
				
			
		}
			//print the unique char
			if(count==1)
			{
				System.out.print(ch);
		}

	}

}}
