package homework3;

import java.io.File;
import java.io.IOException;

public class NewFileDemo {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/JavaDemo");
		f.mkdirs();//�����ļ���
		File ff = new File(f,"myfile.txt");
		ff.createNewFile();//�����ļ�
		File f1 = new File("D:/JavaDemo/Copy");
		f1.mkdirs();
		}
}
