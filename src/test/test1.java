package test;

import java.util.Scanner;

public class test1 {

////	public static void main(String[] args) 
////	{
//////		        Scanner sc = new Scanner(System.in);
//////		        System.out.println("Enter the no");
//////		        int n = 4;
////		        int i=1,fact=1;
////		 for(i=1;i<=4;i++) 
////		 {            
////		 fact=fact*i;      
////		 }
////		 System.out.println("Factorial of "+4+" = "+fact);
////		   
////		}
////	}
//	 public static void main(String[] args) {
////	        Scanner sc = new Scanner(System.in);
////	        System.out.println("Enter the no");
//	        int n = 8;
//	        int i=1,c=0;//1,2
//	 for(i=1;i<=n;i++) //2,3  
//	 {            
//	 if(n%i==0) //0,0, 3.33,
//	 {
//	 c++;
//	 }       
//	 
//	}
//	 
//	 if(c==2)
//	 {
//	 System.out.println(n+" is a PRIME no");
//	 }
//	 else
//	 {
//	 System.out.println(n+" is a NOT a prime no");
//	 }
//	 
//	 }
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 int n,copy,remainder,sum=0;

		 
		 
		     n=sc.nextInt();
		            	copy=n;
		               while(copy!=0)
		    	       {
		 remainder=copy%10;
		       sum=sum+remainder*remainder*remainder;
		         copy=copy/10;
		     }
		 
		 if(sum==n)
		         System.out.println(n+" is an Armstrong number");
		     else
		         System.out.println(n+" is not an Armstrong number");
}}