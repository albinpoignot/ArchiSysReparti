package communicate;
import java.net.*;
import java.io.*;

import builders.TCPServerBuilder;

/** The TCP server. */
public class TCPServerCommunicate extends TCPServerBuilder implements Runnable {

	private Socket s;
	private InputStream in;
	
	public void run( ) {
		try
		{
			setServerSocket();
			
			getSs().bind(getIsA());
			
			s = getSs().accept();
			
			in = s.getInputStream();
			String response = read(in);
			
			displayBufferAppli();
			
			s.close();
		}
		catch(IOException e)
		{
			System.out.println("IOException TCPServer - " + e.getMessage());
		}
	}
	
	
}
