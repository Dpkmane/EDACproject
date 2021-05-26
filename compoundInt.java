
public class compoundInt {

	public static void main(String[] args) {
		double principal =20000, rate=6,time=3,amount=0,ci;
		System.out.println("principal="+principal);
		System.out.println("rate="+rate);
		System.out.println("time="+time);
		amount=principal*((1+rate/100)*(1+rate/100)*(1+rate/100));
		System.out.println("amount="+amount);
		System.out.println("--------------------------------");
		ci=amount+principal;
		System.out.println("compound interest="+ci);
		
		
		
	}

}
