package Serial;

import Serial.Message;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization{

	public void serializeMsg(Message msg) throws IOException {
		
	FileOutputStream fos = new FileOutputStream("message.sir");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	
	oos.writeObject(msg);
	oos.close();
	

	}
	
}
