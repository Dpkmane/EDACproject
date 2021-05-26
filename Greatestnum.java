import java.util.Scanner;

//Write a program to find greatest of three numbers using nested if-else.
public class Greatestnum {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		System.out.print("a=");
		a=sc.nextInt();
		System.out.print("b=");
		b=sc.nextInt();
		System.out.print("c=");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("max="+a);
			}
			
		}
		else if(b>c)
		{ 
			System.out.println("max="+b);
		}
		else 
		{
			System.out.println("max="+c);
		}
		sc.close();
	}

}
