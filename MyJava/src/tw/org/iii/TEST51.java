package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TEST51 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5544);
			Socket socket  = server.accept();
			
			System.out.println(socket.getInetAddress().getHostAddress());
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/tw.org.iii.jpg"));
			BufferedInputStream bin = new BufferedInputStream(socket.getInputStream());
			byte[] buf = new byte[4096]; int len;
			while((len = bin.read(buf)) != -1){
				bout.write(buf, 0 , len);
			}
			bin.close();
			bout.flush();
			bout.close();
			server.close();
		} catch (Exception e) {
			System.out.println(e.toString());

		}
	}
}
