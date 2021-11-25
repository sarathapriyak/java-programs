
public class SwapFirstAndLastString {

	public static void main(String[] args) {
String s="welcome to testyantra";
String[] arr = s.split(" ");
String temp=arr[0];
arr[0]=arr[arr.length-1];
arr[arr.length-1]=temp;
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	}

}
