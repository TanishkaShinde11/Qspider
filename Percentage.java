import java.util.Scanner;
class Percentage

{
	public static void main(String[] args) 
	{    Scanner sc=new Scanner(System.in);
	System.out.println("enter marks");
		int marks=sc.nextInt();
		float per=((marks*100)/600);

        //String ans=(per>=35)?("pass"):("fail");
        String ans=((per<=100 && per>=75)?("A")?((per<=75 && per>=60)?("B")):((per<=60 && per>=35)?("C"):("fail"));
		System.out.println("percentage"+per+ "is "+ans );
	} 
}
