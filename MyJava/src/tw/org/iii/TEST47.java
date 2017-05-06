package tw.org.iii;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TEST47 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(2080);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
 			socket.close();
 			int len = packet.getLength();
 			byte[]rdata = packet.getData();
 			String urip = packet.getAddress().getHostAddress();
 			System.out.println(urip);
 			System.out.println(len);
 			System.out.println(rdata);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
