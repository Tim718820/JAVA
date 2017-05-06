package tw.org.iii;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TEST48 {

	public static void main(String[] args) {
		//for(int i=0;i<137;i++){	
			try {
				Socket socket = new Socket(InetAddress.getByName("10.2.1.116"),5544);
				
				OutputStream out = socket.getOutputStream();
				out.write("Hello, World".getBytes());
				out.flush();
				out.close();
				//System.out.println("port:");
			} catch (Exception e) {
			    System.out.println();
			//} 
		}

	}

}
