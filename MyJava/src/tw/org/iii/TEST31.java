package tw.org.iii;
//¨Ò¥~
public class TEST31 {

	public static void main(String[] args) {
		int a=10, b=3;
		int[] c = {1,2,3,4};
		try{
			System.out.println(a/b);
			System.out.println(c[4]);
		}catch(ArithmeticException ae){
			System.out.println("!!!");
		}catch(ArrayIndexOutOfBoundsException ee){
			System.out.println("XXX");
		}
		
		System.out.println("Hello, World");
	}

}
