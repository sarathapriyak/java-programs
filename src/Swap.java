
public class Swap {

	public static void main(String[] args) {
int a=10;
int b=20;
System.out.println("Before Swapping");
System.out.println(a+" "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping");
System.out.println(a+" "+b);
	}

}
