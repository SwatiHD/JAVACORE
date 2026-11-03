package Serial;

import java.io.IOException;
import Serial.Message;
public class Driver {

	public static void main(String[] args) throws IOException {
		MessageSerialization m1= new MessageSerialization();
		
		Message m2 = new Message("MSG!","Hello girl");
		
		m1.serializeMsg(m2);

	}

}
