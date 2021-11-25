import java.util.HashSet;

public class UniqueString {

	public static void main(String[] args) {
		String s="welcome to welcome";
		String str[]=s.split(" ");
		//Creating a set
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		//comparing each char in set with each char in string
		for(String word:set)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					//if char is matching increament count
					count++;
				}
				}
				if(count==1)
				
					System.out.println(word+" ");
			
		
			//print the unique char
			
				
		}
			

			}
	

	}


