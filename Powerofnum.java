import java.util.Scanner;

public class Powerofnum {

	public static void main(String[] args) {
		int a,b,pow=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a base");
		a=sc.nextInt();
		System.out.println("enter power");
		b=sc.nextInt();
		for (int i=1;i<=b;i++)
		{  
			pow*=a;
		
		}
		System.out.println("power="+pow);
		sc.close();
	}

}
