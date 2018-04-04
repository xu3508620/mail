import javax.mail.*;
import java.io.IOException;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws MessagingException, IOException {
        try {
            new ReceiveMailHandler().receiveMail("xuyaoxin@zidingjr.com", "Xyx3508620");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
