package tw.org.iii;

public class Bike01 {

	public static void main(String[] args) {
		Bike b1 = new Bike(); //new����Φ� Bike()�����l��
		Bike b2 = new Bike(1.2);
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b1.upSpeed();
		b2.upSpeed();
		b2.upSpeed();
		b2.upSpeed();
		b2.upSpeed();
		System.out.println(b1.getSpeed());
		System.out.println(b2.getSpeed());
		

	}

}
