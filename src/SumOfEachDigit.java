
public class SumOfEachDigit {

	public static void main(String[] args) {
int n=2345;
int sum=0;
while(n!=0)
{
	int num=n%10;
	sum=sum+num;
	n=n/10;
}
System.out.println(sum);
	}

}
