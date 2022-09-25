package test;

public class string
{

	public static void main(String[] args) 
	{
		
		
//		String s="shivprasad1234choudhary4567";
		String s="I am Ram";
		
		System.out.println(s.length());
		//you have to find index of given string Value
//		System.out.println(s.indexOf("c"));
		
//		//you have to count numbers from that string by using length method.
//		String s1 =s.replaceAll("[^0-9]","");
//		System.out.println(s1);
//		System.out.println(s1.length());
		
//		you have to count duplicate cha.
//		String s1 =s.replaceAll("[^m]","");
//		System.out.println(s1);
//		System.out.println(s1.length());
//		
		
	//count total number of whitespaces
//		String s2="shi $%&vpr asad 1 2 34ch oud hary 45 67";
//		System.out.println(s2.length());
//        String s3=s2.replaceAll("[^a-z0-9$%&]","");
//        System.out.println(s3);
//        System.out.println(s3.length());
		
		//swap two strings without using third variable
     String str7="Shivay";
     String str8="Om";
     str7=str7+str8;
     str8=str7.substring(0, 6);
     str7=str7.substring(6);
//     System.out.println("After swapping:"+str7+ " "+str8);
     System.out.println( " "+str8);
     System.out.println( " "+str7);
     
	}

}
