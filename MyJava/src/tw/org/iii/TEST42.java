package tw.org.iii;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TEST42 {

	public static void main(String[] args) {
		try {
			FileInputStream fout = new FileInputStream("./dir1/data1.txt");
			DataInputStream dout = new DataInputStream(fout);
			int a = readInt();
			int b = readInt();
		
			dout.close();
			System.out.println(a);
		} catch (Exception e) {
			System.out.println(e.toString());
		} 

	}

	private static int readInt() {
		// TODO Auto-generated method stub
		return 0;
	}

}
