import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int fact = 1;
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;++i) 
		{
		
			 fact=fact*i;
			
		}
	
		System.out.println("factorial="+fact);
		sc.close();
	}
}