package tw.org.iii;

public class TEST34 {

	public static void main(String[] args) {
		new A471().m1();
	}
}
class A471 {
	void m1(){
	 try{
		throw new Exception();
	}catch(Exception ee){
		System.out.println("catch");
	}finally{
		System.out.println("OK");
	}
	 System.out.println("AA");
	}
}
