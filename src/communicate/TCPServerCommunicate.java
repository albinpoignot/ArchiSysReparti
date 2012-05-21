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
			
			// Paramétrage socket passive et son tps d'attente
			getSs().bind(getIsA());
			getSs().setSoTimeout(15000);
			
			// Création socket active lorsque connexion client effectuée
			s = getSs().accept();
			s.setSoTimeout(10000);			
			
			// Lecture
			in = s.getInputStream();
			StringBuffer response = read(in);
			in.close();
			System.out.println("response (server) : " + response);
			
			// Ecriture
			/*OutputStream out = s.getOutputStream();
			write("Je suis le server !! ", out);
			out.close();*/
			
			// Fermeture de la socket
			s.close();
			
		}
		catch(IOException e)
		{
			System.out.println("IOException TCPServerCommunicate - " + e.getMessage());
		}
	}
	
	
}
