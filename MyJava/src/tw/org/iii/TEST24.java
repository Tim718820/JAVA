package tw.org.iii;

public class TEST24 {

	public static void main(String[] args) {
		A271 b1 = new A272();
		b1.m1();
	}
}
abstract class A271{
	A271(){System.out.println("A271()");}
	void m1(){System.out.println("A271:m1()");}
	abstract void m2();
}
class A272 extends A271{
	void m2(){System.out.println("A272:m2");}
}
class A273 extends A271{
	void m2(){System.out.println("A273:m2");}
}
abstract class A274 extends A271{
	
}

