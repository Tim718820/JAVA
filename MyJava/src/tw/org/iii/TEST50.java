package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TEST50 {

	public static void main(String[] args) {
			try {
				File sendFile = new File("./dir1/Chrysanthemum.jpg");
				byte[] buf = new byte[(int)sendFile.length()];
				BufferedInputStream bin = new BufferedInputStream(new FileInputStream(sendFile));
				bin.read(buf);
				bin.close();
				
				Socket socket = new Socket(InetAddress.getByName("10.2.1.115"),9999);
				
				OutputStream out = socket.getOutputStream();
				out.write(buf);
				out.flush();
				out.close();
			} catch (Exception e) {
			    System.out.println();
			
		}

	}

}
