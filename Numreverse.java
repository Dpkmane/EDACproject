import java.util.Scanner;

//Write a  program to enter a number and print its reverse
public class Numreverse {

	public static void main(String[] args) 
	{
		int a,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
           a=sc.nextInt();	
           while(a>0)
           { rem=a%10;
           rev=rev*10+rem;
           a=a/10;
           }
        	System.out.println("reverse="+rev);	
        	sc.close();
	}

}
