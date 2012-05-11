package ArchiSysReparti;

import java.io.*;

class TCPClientHello extends TCPClientBuilder implements Runnable {
		
	
	public void run( ) {
		try
		{
			s.connect(isA);
			afficherInfosSocketActive(s);
			System.out.println("Hello World, client connected");
			s.close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPClient"); }
	}
}
