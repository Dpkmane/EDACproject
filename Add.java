import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
        
		System.out.println("enter two number");

		Scanner sc = new Scanner(System.in);
		 
		System.out.println("num1=");
		int a=sc.nextInt();
		System.out.println("num2=");
		int b=sc.nextInt();
		int add=a+b;
		System.out.println("------------------");
		System.out.println("addintion of num1 and num2 ="+add);
		System.out.println("=====================");
		
		
		
		sc.close();
	}
	
}

