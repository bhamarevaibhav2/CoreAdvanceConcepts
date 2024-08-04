package logical_Core;

public class DSA {
	
	public int sumofNumbers(int a,int b)
	{
		int sum;
		sum = a+b;
		return sum;
	}
	
	public String reversString(String norString)
	{
		String rvs = "";
		char ch;
		
		for (int i = 0; i < norString.length(); i++) {
			
			ch = norString.charAt(i);
			rvs = ch+rvs;
		}
		
		return rvs;
	}
	public static void reversnum(int num)
	{
		int rev =0;
		
		while(num != 0)
		{
			int remainder = num%10;
			rev = rev*10 + remainder;
			num =num/10;
		}
		
		System.out.println(rev);
	}
	
	
	public static void main(String[] args) {
		
		DSA d = new DSA();
		int sumofnum = d.sumofNumbers(23,34);
		System.out.println(sumofnum);
		
		
		String rversestr = d.reversString("Vaibhav");	
		System.out.println(rversestr);
		System.out.println("----------------------");
		reversnum(1234563840);
	}

}
