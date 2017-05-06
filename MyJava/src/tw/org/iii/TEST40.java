package tw.org.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TEST40 {

	public static void main(String[] args) {
		String data = "Hello, World";
		File outFile = new File("./dir1/brad.txt");
		try {                                                  //ˇ讓資料存在後面
			FileOutputStream fout = new FileOutputStream(outFile,true);//新增檔案
			fout.write(data.getBytes());//轉換 寫入檔案
			fout.flush();//讓資料從buffer清除=安全性移除 卸載
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
