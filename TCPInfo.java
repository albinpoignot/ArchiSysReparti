package ArchiSysReparti;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPInfo {
	
	protected void afficherInfosSocketActive(Socket ss){
		System.out.println("--------------- Socket ---------------");
		try {
			System.out.println("Adresse locale: " + ss.getLocalSocketAddress().toString() + "\n" + 
								"Port local: " + ss.getLocalPort() + "\n" + 
								"Adresse distante: " + ss.getInetAddress().toString() + "\n" +
								"Port distant: " + ss.getPort() + "\n" +
								"Paramètre de fermeture: " + ss.isClosed() + "\n" + 
								"Paramètre de delimitation: " + ss.isBound() + "\n" + 
								"Taille des tampons en envoi: " + ss.getSendBufferSize() + "\n" +
								"Taille des tampons en reception: " + ss.getReceiveBufferSize() + "\n" +
								"Valeur de temporisation: " + ss.getSoTimeout() + "\n" + 
								"Mode de fermeture de la socket: " + ss.getSoLinger()
					);
			System.out.println("--------------- Socket ---------------");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void afficherInfosSocketPassive(ServerSocket ss){
		System.out.println("==================== ServerSocket ================= ");
		try {
			System.out.println("Adresse locale: " + ss.getLocalSocketAddress().toString() + "\n"+
					"Adresse distante: " + ss.getInetAddress().toString());
			}
			catch (Exception e)
			{
				
			}try{
				System.out.println(	"Port local: " + ss.getLocalPort() + "\n" + 
								
								"Paramètre de fermeture: " + ss.isClosed() + "\n" + 
								"Paramètre de delimitation: " + ss.isBound() + "\n" + 
								"Taille des tampons en reception: " + ss.getReceiveBufferSize() + "\n" +
								"Valeur de temporisation: " + ss.getSoTimeout()
					);
			System.out.println("==================== ServerSocket ================= ");
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}
