import java.util.Scanner;

public class sumofseries {

	
	public static void main(String[] args) {
		int add=0;
            System.out.println("enter number n");
            
			Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
           for(int i=1;i<=n;++i)
           {
                  add=add+i;
           }
           System.out.println("Addition of sereies upto" +n+" is="+add);
    sc.close();       
	}

}
