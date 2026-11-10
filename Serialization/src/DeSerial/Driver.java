package DeSerial;

import Serial.Message;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\swati\\git\\repository3\\Serialization\\message.sir");
    	ObjectInputStream ois = new ObjectInputStream(fis);
    	Message msg = (Message) ois.readObject();
    	System.out.println("MessageDeserialization.deserializeMsg()"+msg.getMessage());
    	

	}

}
