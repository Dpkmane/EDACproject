import java.util.Scanner;


public class Armstrongnumber 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		System.out.print("a=");
		a=sc.nextInt();
		int n=a,r,an=0;
		
		 while(n>0)
	       {
	         r=n%10;
	         
	         an=an+ (r*r*r);
	         
			 n=n/10;
			
	       }
		 
		 if(a==an)
			 System.out.println("Number is Armstrong");
		 else
			 System.out.println("Number is Not Armstrong");
		 sc.close();
	}

	

}
