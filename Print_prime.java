import java.util.Scanner;

public class Print_prime{
   public static void main(String[] args) 
{	
  int n,flag=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter a number");
  n=sc.nextInt();
  System.out.println("prime no from 1 to "+n);
  for (int i=2;i<=n;i++)
  {
	flag=1;
	for(int j=2;j<=i-1;j++)  
	{
		if(i%j==0)
		{
		   flag=0;
		   break;
		}
	}
	if(flag==1)
	{
		System.out.println("--" +i);
	}
  }	   
   sc.close();
}
}
