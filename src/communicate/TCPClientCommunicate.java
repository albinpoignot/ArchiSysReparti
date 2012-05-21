package communicate;
import java.io.IOException;
import java.io.OutputStream;

import builders.TCPClientBuilder;

/** The TCP client */
public class TCPClientCommunicate extends TCPClientBuilder implements Runnable {
	
	public void run( ) {
		try
		{

			getS().connect(getIsA());
			
			System.out.println("* Writing...");
			
			String msOut = "Aujourd'hui, TP ASR Java." ;
			OutputStream out = getS().getOutputStream();
			out.write(msOut.getBytes());
			out.flush();
			out.close();
			
			System.out.println("* Done !");
			
			getS().close();

		}
		catch(IOException e)
		{ System.out.println("IOException TCPClient : " + e.getMessage()); }
	}
	
}