package communicate;
import java.io.IOException;
import java.io.OutputStream;
import java.net.SocketException;

import builders.TCPClientBuilder;

/** The TCP client */
public class TCPClientCommunicate extends TCPClientBuilder implements Runnable {
	
	private OutputStream out;
	
	public void run( ) {
		try
		{
			setSocket();
			
			getS().connect(getIsA());
			
			out = getS().getOutputStream();
			write(out);
			
			getS().close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPClient : " + e.getMessage()); }
	}
	
}