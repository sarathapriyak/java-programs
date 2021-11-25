
public class SumOfNumInString {

	public static void main(String[] args) {
String s="4vad=--=67catd3";
int sum=0;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='0'&&s.charAt(i)<='9')
	{
		//int n=s.charAt(i)-48;
		sum=sum+(s.charAt(i)-48);
	}
	
}
System.out.println(sum);

	}

}
