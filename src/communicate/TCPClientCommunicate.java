package communicate;
import java.io.IOException;

import builders.TCPClientBuilder;

/** The TCP client */
public class TCPClientCommunicate extends TCPClientBuilder implements Runnable {
	
	public void run( ) {
		try
		{

			getS().connect(getIsA());
			
			write(getS());
			
			getS().close();

		}
		catch(IOException e)
		{ System.out.println("IOException TCPClient : " + e.getMessage()); }
	}
	
}