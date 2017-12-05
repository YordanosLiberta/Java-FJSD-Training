package Basics;

public class HelloWorld {
	public static void main(String[]args)
	{
		int i = 10;
		int k = 0;
		
		for (int m=0;m<i;m++)
		{
			for (int s=0;s<i;s++)
			{	
		      System.out.print(s);
			}
		      System.out.println();
		} 
		
		do {
			System.out.println(k);
			k= k+1;
				
		   }while(k<i);
	}

}
