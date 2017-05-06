package tw.org.iii;

import java.io.*;


public class TEST36 {

	public static void main(String[] args) {
		File file = new File("./dir1/file1.txt");
		try{
			FileReader fin =
				new FileReader(file);
			int temp;
			while((temp=fin.read()) != -1){
				System.out.print((char)temp);
			}
			
			fin.close();
		
//		}catch(FileNotFoundException ee){
//			System.out.println(ee.toString());
		}catch(Exception ee){
		System.out.println(ee.toString());
	
		}
	}
}
