package test;

public class palindromenumber {

	public static void main(String[] args)
	{
		int num=12321;
		int digit;
		int reverse=0;
		int orignalnum;
		
		orignalnum=num;
		
		while(num!=0)
		   {
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		    }
			if(orignalnum==reverse)
			{
				System.out.println(orignalnum+ "is palindrome number");
		    }
			else 
			{
				System.out.println(orignalnum+ "is not palindrome number");
			}
	}

}
