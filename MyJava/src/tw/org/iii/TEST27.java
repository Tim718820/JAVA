package tw.org.iii;

public class TEST27 {

	public static void main(String[] args) {

	}
}
interface Shape{
	double calLength();
	double calArea();
}
class TriShape implements Shape{
	private double s1,s2,s3,h1;
	TriShape(double s1,double s2,double s3,double h1){
		this.s1=s1;
	}
	public double calLength(){return s1+s2+s3;}
	public double calArea(){return s1*h1/2;}
}
