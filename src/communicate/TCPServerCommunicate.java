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
			
			InputStream in = s.getInputStream();
			byte[] buffer = new byte[8192];
			int count = in.read(buffer);
			String msIn = new String(buffer,0,count) ;
			in.close();
			
			System.out.println("Received : " + msIn);
			
			s.close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPServer "); }
	}
	
	
}
