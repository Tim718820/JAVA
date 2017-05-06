package tw.org.iii;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Student2 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(new FileInputStream("./dir1/data2.Object"));
			Object obj1 = oin.readObject();
			Object obj2 = oin.readObject();
			oin.close();
			Student s1 = (Student)obj1;
			Student s2 = (Student)obj2;
			System.out.println(s1.sum()+"\t"+s1.avg());
			System.out.println(s2.sum()+"\t"+s2.avg());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
