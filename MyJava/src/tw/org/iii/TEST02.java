package tw.org.iii;

public class TEST02 {

	public static void main(String[] args) {
		System.out.printf("BTYE %10d~%10d%n",Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("%d~%d%n",Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("%d~%d%n",Double.MIN_EXPONENT, Double.MAX_EXPONENT);
		
		System.out.printf("1 AND 1 %5d%n", 1 & 1);
	
		System.out.printf("%o%n", 19);
		
		System.out.printf("%x%n", 19); 
		
		int i = 1;
		System.out.println(i<<2);
	}

}
