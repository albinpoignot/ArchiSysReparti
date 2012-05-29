package builders;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;


public class TCPInfo {
	
	public void displayServerInfo(ServerSocket s)
	{
		System.out.println("ServerSocket -----");
		System.out.println("[SS] - Local Address : " + s.getLocalSocketAddress());
		System.out.println("[SS] - Local Port : " + s.getLocalPort());
		try
		{
			System.out.println("[SS] - So Timeout : " + s.getSoTimeout());
		}
		catch(IOException e)
		{
			System.out.println("[SS] - So Timeout : ** undefined **");
		}
		
		System.out.println("----- End ServerSocket -----");
		System.out.println("");
		
	}
	
	public void displayClientInfo(Socket s)
	{
		System.out.println("ClientSocket -----");
		System.out.println("[CS] - Inet Address : " + s.getInetAddress());
		System.out.println("[CS] - Local Port : " + s.getLocalPort());
		System.out.println("[CS] - Remote Port : " + s.getPort());
		try
		{
			System.out.println("[CS] - So Timeout : " + s.getSoTimeout());
		}
		catch(IOException e)
		{
			System.out.println("[CS] - So Timeout : ** undefined **");
		}
		
		System.out.println("----- End ClientSocket -----");
		System.out.println("");
	}
	
	protected void afficherInfosSocketActive(Socket ss){
		System.out.println("--------------- Socket ---------------");
		try {
			System.out.println("Adresse locale: " + ss.getLocalSocketAddress().toString() + "\n" + 
								"Port local: " + ss.getLocalPort() + "\n" + 
								"Adresse distante: " + ss.getInetAddress().toString() + "\n" +
								"Port distant: " + ss.getPort() + "\n" +
								"Paramètre de fermeture: " + ss.isClosed() + "\n" + 
								"Paramètre de delimitation: " + ss.isBound() + "\n" + 
								"Taille des tampons en envoi client: " + ss.getSendBufferSize() + "\n" +
								"Taille des tampons en reception client: " + ss.getReceiveBufferSize() + "\n" +
								"Valeur de temporisation client: " + ss.getSoTimeout() + "\n" + 
								"Mode de fermeture de la socket: " + ss.getSoLinger()
					);
			System.out.println("--------------- Socket ---------------");
		} catch (IOException e) {
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
								"Taille des tampons en reception serveur: " + ss.getReceiveBufferSize() + "\n" +
								"Valeur de temporisation serveur: " + ss.getSoTimeout()
					);
			System.out.println("==================== ServerSocket ================= ");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
}
