class Product

{
	public static void main(String[] args) 
	{
		int num=2345;
		int product=1;
		int rem=0;
		 rem=num%10;
		product=product*rem;
		 num =  num/10;
		
		
		 rem=num%10;
		product=product*rem;
		 num =  num/10;
		
		
		 rem=num%10;
		product=product*rem;
		 num =  num/10;
		
		
		 rem=num%10;
		product=product*rem;
		// num =  num/10;
		 System.out.println("product"+product);
        
	}
}
