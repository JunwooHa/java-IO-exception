package askd;

import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class output {
    public static void main(String[] args) throws Exception {		
        FileOutputStream fos = new FileOutputStream("C:/Temp/file1.txt");
        Writer writer = new OutputStreamWriter(fos);
		
        String data = "����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ";
        writer.write(data);
        writer.flush();
        writer.close();
        System.out.println("���� ������ �������ϴ�.");
    }
}
