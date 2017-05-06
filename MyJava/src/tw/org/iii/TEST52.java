package tw.org.iii;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class TEST52 {

	public static void main(String[] args) {
		
		URL url;
		try {
			url = new URL("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQwtvmWkWVOz7CqIRwNHZT5jcOQ9ZKXcXMuRmpuErBJZ6BjD12X4QcXpg");
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("./dir2/iii.jpg"));
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4096]; int len;
			while((len = bin.read(buf)) != -1){
				bout.write(buf, 0 , len);
			}
			bin.close();
			bout.flush();
			bout.close();
		} catch (Exception e) {
			System.out.println("XXXXX");
		}
		

	}

}
