package communicate;
import java.io.IOException;
import java.io.OutputStream;

import builders.TCPClientBuilder;

/** The TCP client */
public class TCPClientCommunicate extends TCPClientBuilder implements Runnable {
	
	private OutputStream out;
	
	public void run( ) {
		try
		{
			setSocket();
			
			// Connexion et définition du timeout
			getS().setSoTimeout(10000);
			getS().connect(getIsA());
			
			// Ecriture
			out = getS().getOutputStream();
			write(duplicate("Je suis le client"), out);
			out.close();
			
			// Lecture
			/*InputStream in = getS().getInputStream();
			String response = read(in);
			in.close();
			System.out.println("response (client) : " + response);*/
			
			// Fermeture de la socket
			getS().close();
		}
		catch(IOException e)
		{ System.out.println("IOException TCPClientCommunicate : " + e.getMessage()); }
	}
	
}