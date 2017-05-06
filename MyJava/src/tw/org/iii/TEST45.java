package tw.org.iii;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TEST45 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.net");
			for(InetAddress ip:ips){
			System.out.println(ip.getHostAddress());
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
