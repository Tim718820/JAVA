package tw.org.iii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TEST40 {

	public static void main(String[] args) {
		String data = "Hello, World";
		File outFile = new File("./dir1/brad.txt");
		try {                                                  //������Ʀs�b�᭱
			FileOutputStream fout = new FileOutputStream(outFile,true);//�s�W�ɮ�
			fout.write(data.getBytes());//�ഫ �g�J�ɮ�
			fout.flush();//����Ʊqbuffer�M��=�w���ʲ��� ����
			fout.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
