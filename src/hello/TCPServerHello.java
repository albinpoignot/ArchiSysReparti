package hello;
import java.net.*;
import java.io.*;

import builders.TCPServerBuilder;

/** The TCP server. */
public class TCPServerHello extends TCPServerBuilder implements Runnable {

	private Socket s;
	
	public void run( ) {
		try
		{
			setServerSocket();
			getSs().bind(getIsA());
			s = getSs().accept();
			s.close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPServer "); }
	}
	
	
}
