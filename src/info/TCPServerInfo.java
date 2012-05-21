package info;
import java.net.*;
import java.io.*;

import builders.TCPServerBuilder;

/** The TCP server. */
public class TCPServerInfo extends TCPServerBuilder implements Runnable {

	private Socket s;
	
	public void run( ) {
		try
		{
			setServerSocket();
			
			System.out.print("----- before bind ");
			displayServerInfo(getSs());
			getSs().bind(getIsA());
			
			System.out.print("----- after bind ");
			displayServerInfo(getSs());
			s = getSs().accept();
			
			System.out.print("----- after accept ");
			displayServerInfo(getSs());
			s.close();
			
			System.out.print("----- after close ");
			displayServerInfo(getSs());
		}
		catch(IOException e)
		{ System.out.println("IOException TCPServer "); }
	}
	
	
}
