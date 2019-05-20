package askd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class fileout {
    public static void main(String[] args) throws Exception {
        String originalFileName = "C:/Temp/fruit4.jpg";
        String targetFileName = "C:/Temp/house2.jpg";
		
        FileInputStream fis = new FileInputStream(originalFileName);
        FileOutputStream fos = new FileOutputStream(targetFileName);
		
        int readByteNo;
        byte[] readBytes = new byte[100];
        while( (readByteNo = fis.read(readBytes)) != -1 ) {
            fos.write(readBytes, 0, readByteNo);
        }
        fos.flush();
        fos.close();
        fis.close();
        System.out.println("복사가 잘 되었습니다.");
    }
}

