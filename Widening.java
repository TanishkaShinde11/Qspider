class Widening 
{
	public static void main(String[] args) 
	{   System.out.println("byte widening :"); 
		byte b=100;
		short s=b;
		//char c=b;
		int i=b;
		long l=b;
		float f=b;
		double d=b;
		System.out.println("byte :"+b);
	    System.out.println("short : "+s);
		// System.out.println("char : "+c);  incompatible types: possible lossy conversion from byte to char
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double  :"+d);

         System.out.println();
		
        System.out.println("short widening :"); 
		 s=20;
		// c=s;
		 i=s;
		 l=s;
		 f=s;
		 d=s;
		System.out.println("short : "+s);
		 // System.out.println("char : "+c); // possible lossy conversion from short to char
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double  :"+d);
		 
		 System.out.println();
		 System.out.println("char widening :"); 
          char c='a';
		 i=c;
		 l=c;
		 f=c;
		 d=c; 
       
		System.out.println("char : "+c);
		System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		
		
		System.out.println("double  :"+d);

		System.out.println();
		 System.out.println("int widening :"); 
		 i =99;
		 l=i;
		  f =i;
		  d=i;
          System.out.println("int :"+i);
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double  :"+d);

		System.out.println();
		 System.out.println("long widening :"); 
		  l=2323232323l;
		  f =l;
		  d=l;
		System.out.println("long :"+l);
		System.out.println("float :"+f);
		System.out.println("double  :"+d);
   
        System.out.println();
        System.out.println("float widening :");
        f=8.9f;
		d=f;
		System.out.println("float :"+f);
		System.out.println("double  :"+d);
        



	   
	}
}
