import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter char");
		char result =sc.next().charAt(0);
		
       String ans =(result>='a' && result<='z')?(result+"is lowercase"):(result+"is not lowercase");
	   System.out.println(ans);

	}
}
