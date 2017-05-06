package tw.org.iii;

public class TEST22 {
	

	public static void main(String[] args) {
		H125.m1();
		H125 c = new H125();
	}
}
	class H123{
		H123(int a){System.out.println("1");}
	}
	class H124 extends H123{
		H124(String b){super(1);
		System.out.println("2");}
	}
	class H125 extends H124{
		H125(){super("XXX");
		System.out.println("3");}
		static void m1(){
			System.out.println("m1");}
		
		
	}