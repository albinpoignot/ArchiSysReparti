package hello;
import java.io.IOException;

import builders.TCPClientBuilder;

/** The TCP client */
public class TCPClientHello extends TCPClientBuilder implements Runnable {
	
	public void run( ) {
		try
		{
			setSocket();
			getS().connect(getIsA());
			System.out.println("Hello World, client connected");
			getS().close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPClient : " + e.getMessage()); }
	}
	
}