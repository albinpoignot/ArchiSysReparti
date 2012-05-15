package communicate;
import java.net.*;
import java.io.*;

import builders.TCPServerBuilder;

/** The TCP server. */
public class TCPServerCommunicate extends TCPServerBuilder implements Runnable {

	private Socket s;
	
	public void run( ) {
		try
		{
			setSs(new ServerSocket());
			
			getSs().bind(getIsA());
			
			s = getSs().accept();
			
			String response = read(s);
			
			System.out.println("Rcvd : " + response);
			
			s.close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPServer "); }
	}
	
	
}
