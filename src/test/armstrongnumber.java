package test;

public class armstrongnumber {

	public static void main(String[] args) 
	{
		int n=153;
		int sum=0;
		int d;
		int a;
		
		a=n;
		while(n!=0)
		{
			d=n%10;
			sum=sum+d*d*d;
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println(a + " is armstrong number");
		}
		else
		{
			System.out.println(a + " is not armstrong number");
		}
	}

}
