
public class StringRevwithoutLength {

	public static void main(String[] args) {
String s="palindrome";
String s1="";
int count = s.compareTo(s1);
for(int i=count-1;i>=0;i--)
{
	s1=s1+s.charAt(i);
	
}
System.out.print(s1);

	}

}
