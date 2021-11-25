
public class SumFirstThreeMin {

	public static void main(String[] args) {
		int a[]= {30,60,10,50,70};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		int sum=0;
		for(int i=a.length;i>2;i--)
		{
			sum=sum+a[i-1];
			
		}
		System.out.println(sum);
	}

}
