
public class ConvertToLower {

	public static void main(String[] args) {
String s="AGJBIOegs674982=-';";
String s1=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
	if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
	{
		System.out.println(s.charAt(i));
	}
}
	}

}
