import java.util.Scanner;
class Character 
{
	public static void main(String[] args) 

	{
		      Scanner sc=new Scanner(System.in);
			  char ch=sc.next().charAt(0);
	           
			   //System.out.println((ch>='A' && ch<='Z')?("it is uppercase"):("not uppercase")); 

              String op=((ch>='A'&&ch<='Z' )||(ch>='a'&&ch<=122))?((ch>='a'&&ch<='z')?(ch+"is lowercase"):(ch+"is uppercase")):((ch>='0' && ch<='9')?(ch+"is digit"):(ch+"is special char"));

           System.out.println(op);


	}
}
