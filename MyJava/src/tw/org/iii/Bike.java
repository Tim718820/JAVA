package tw.org.iii;

public class Bike {
	double speed;
	Bike(){ //�غc�� �⪫���l��
		this(0);
		//System.out.println("XXXXXXX v1");
	}
	Bike(double s){ //�غc�� �⪫���l��
		speed = s;
		System.out.println("XXXXXXX v2");
	}
	Bike(int s){ //�غc�� �⪫���l��
		speed = s;
		System.out.println("XXXXXXX v3");
	}
	Bike(float s){ //�غc�� �⪫���l��
		speed = s;
		System.out.println("XXXXXXX v4");
	}
	void upSpeed(){
		speed = (speed<1)?1:(speed*1.2);
	}
	void downSpeed(){
		speed *=0.7;
	}
	double getSpeed(){
		return speed;
	}
}
