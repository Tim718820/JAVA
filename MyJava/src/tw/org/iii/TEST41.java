package tw.org.iii;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TEST41 {

	public static void main(String[] args) {
		int a=1,b=2; String c = "AAA",d="資策會";
		
			try {
				FileOutputStream fout = new FileOutputStream("./dir1/data1.txt");
				DataOutputStream dout = new DataOutputStream(fout);
				dout.writeInt(a);
				dout.writeInt(b);
				dout.writeChars(c);
				dout.writeUTF(d);
				dout.flush();
				dout.close();
				
			} catch (Exception e) {
				System.out.println(e.toString());
			} 

	}

}
