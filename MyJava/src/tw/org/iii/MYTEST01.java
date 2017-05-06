package tw.org.iii;
class AA123{
	int x = 10;
	int y = 10;
	
	void show(int x){
		int y = 20;
		System.out.println("x = " + x);
		System.out.println("y = " + this.y);
	}
}
public class MYTEST01 {

	public static void main(String[] args) {
		AA123 a = new AA123();
		a.show(20);

	}

}
