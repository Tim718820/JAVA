package tw.org.iii;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TEST44 {

	public static void main(String[] args) {
		TEST613 obj = new TEST613();
		//序列化
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/TEST44"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("-----------------------------------------");
		//解序列
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/TEST44"));
			Object obj2 = (TEST613)oin.readObject();
			oin.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
class TEST611 {
	TEST611(){System.out.println("TEST611");}
}
class TEST612 extends TEST611 {
	TEST612(){System.out.println("TEST612");}
}
class TEST613 extends TEST612 implements Serializable{
	TEST613(){System.out.println("TEST613");}
}