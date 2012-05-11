package ArchiSysReparti;

import java.net.*;
import java.io.*;

/** The TCP server. */

class TCPServerHello extends TCPServerBuilder implements Runnable {
		
	
	public void run() {
		try
		{
			ss = new ServerSocket();
			afficherInfosSocketPassive(ss);
			ss.bind(isA);
			s = ss.accept();
			afficherInfosSocketPassive(ss);
			s.close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPServer " + e.getMessage()); }
	}
	private Socket s;
}
