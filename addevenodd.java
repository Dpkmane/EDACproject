import java.util.Scanner;

public class addevenodd {

	public static void main(String[] args)
	{ int add=0,sum=0;
	 System.out.println("enter num n");
	 Scanner sc=new Scanner (System.in);
	 int n=sc.nextInt();
     for(int i=1;i<=n;++i)
	 {
    	 if (i%2==0)
    	 {
         add=add+i;
    	
    	 }
	 
    	 else if(i%2!=0)
    	 {
    		 sum=sum+i;
    		 	 
    	 }
	 
	 }System.out.println("Add even no bwteen 1 to n="+add);
	 System.out.println("Add even no bwteen 1 to n ="+sum);
	 sc.close();
	}

}


