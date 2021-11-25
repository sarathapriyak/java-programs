import java.util.HashSet;

public class NumOfCharOcurInstring {

	public static void main(String[] args) {
String s="malayalam";
//Creating a set
HashSet<Character> set=new HashSet<Character>();
for(int i=0;i<s.length();i++)
{
	set.add(s.charAt(i));
}
//comparing each char in set with each char in string
for(char ch:set)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{//if it is equal then increase the count
		if(ch==s.charAt(i))
		{
			count++;
		}
	}
	//print the char and count
	System.out.println(ch+" "+count);
}

	}

}
