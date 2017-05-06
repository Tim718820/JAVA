package tw.org.iii;

import java.io.Serializable;

public class Student implements Serializable {
	private int Ch,Math,Eng;
	private String name;
	private Car1 car;
	public Student(String name,int Ch,int Math,int Eng){
		this.name = name;this.Ch = Ch; this.Math = Math; this.Eng = Eng; 
		car = new Car1();
	}
	String getName(){return name;}
	double sum(){return Ch+Math+Eng;}
	double avg(){return sum()/3;}
}
class Car1 implements Serializable{
	
}
