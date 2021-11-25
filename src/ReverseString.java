
public class ReverseString {
	void reverse(){
		ReverseString r=new  ReverseString();
		String k[]= {"khgk"};
		r.main(k);
	}

	public  void main(String[] args) {
		
		
		String s = "chaithanya";
		String s1 = "";
		for(int i =s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		

	}

		}


