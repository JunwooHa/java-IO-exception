package askd;

import java.io.OutputStream;

public class systemoutexample {
    public static void main(String[] args) throws Exception {
        OutputStream os = System.out;		
 		
        for(byte b=48; b<58; b++) {
            os.write(b);
        }		
        os.write(13);
		
        for(byte b=97; b<123; b++) {
            os.write(b);
        }		
        os.write(13);		

        String hangul = "�����ٶ󸶹ٻ������īŸ����";
        byte[] hangulBytes = hangul.getBytes();
        os.write(hangulBytes);
        os.flush();
    }
}

