import java.util.Scanner;

public class swap {
	public static void main(String[] args)
	{
		int a,b,t;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter two numb");
		System.out.println("a=");
		a=sc.nextInt();
		System.out.println("b=");
		b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.println("--a="+a+"--b="+b);
		
		
		
		sc.close();
	}

}
