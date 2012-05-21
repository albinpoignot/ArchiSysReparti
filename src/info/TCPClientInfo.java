package info;
import java.io.IOException;

import builders.TCPClientBuilder;

/** The TCP client */
public class TCPClientInfo extends TCPClientBuilder implements Runnable {
	
	public void run( ) {
		try
		{
			setSocket();
			
			System.out.print("----- before connect ");
			displayClientInfo(getS());
			getS().connect(getIsA());
			
			System.out.print("----- after connect ");
			displayClientInfo(getS());
			System.out.println("Hello World, client connected");
			getS().close();
			
			System.out.print("----- after close ");
			displayClientInfo(getS());
		}
		catch(IOException e)
		{ System.out.println("IOException TCPClient : " + e.getMessage()); }
	}
	
}