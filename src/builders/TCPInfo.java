package builders;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


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
	
}
