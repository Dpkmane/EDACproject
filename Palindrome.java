import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int a,rev=0,temp,r;
		System.out.println("Enter a no");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		 temp=a;
		while(a>0) {
			
			r=a%10;
			rev=(rev*10)+r;
			a=a/10;	
			
		}
		
		if(temp==rev) 
			System.out.println("number is palindrome");
		else
			System.out.println("number is not  palindrome");
		
		
		
		

	}

}
