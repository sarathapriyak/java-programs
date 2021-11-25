
public class SeperateCharAndNum {

	public static void main(String[] args) {
String s="ab234)***#6";
String alpha="";
String num="";
String specialchar="";
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A' && s.charAt(i)<='Z')
	//if(s.charAt(i)>=65 && s.charAt(i)<=90||(s.charAt(i)>=97&&s.charAt(i)<=122))
	{
		alpha=alpha+s.charAt(i);
		
		
	}
	else if(s.charAt(i)>=48 && s.charAt(i)<=57)
	{
		num=num+s.charAt(i);
	}
	else 
	{
		specialchar=specialchar+s.charAt(i);
	}
		
	
}
System.out.println(alpha);
System.out.println(num);
System.out.println(specialchar);
	}

}
