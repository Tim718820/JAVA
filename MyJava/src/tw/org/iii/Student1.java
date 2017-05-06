package tw.org.iii;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Student1 {

	public static void main(String[] args) {
		Student s1 = new Student("Andy",50,30,24);
		Student s2 = new Student("Eric",90,50,64);
		System.out.println(s1.sum());
		System.out.println(s1.avg());
		
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("./dir1/data2.Object"));
			oout.writeObject(s1);
			oout.writeObject(s2);
			oout.flush();
			oout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
