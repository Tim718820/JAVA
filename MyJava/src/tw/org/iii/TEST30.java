package tw.org.iii;

public class TEST30 {

	public static void main(String[] args) {
		A431 obj1 = new A431();
		A431.A4311 obj2 = obj1.new A4311();
		obj2.m1();
		A431.A4312 obj3 = new A431.A4312();
	}
}
class A431{
	A431(){System.out.println("A431()");}
	void m1(){System.out.println("A431:m1()");}
	void m2(){System.out.println("A431:m2()");}
	class A4311{
		A4311(){System.out.println("A4311()");}
		void m1(){System.out.println("A4311:m1()");
		A431.this.m1();
		}
	}
	static class A4312{
		A4312(){System.out.println("A4312()");}
		void m1(){System.out.println("A4312:m1()");
		}
	}
}
