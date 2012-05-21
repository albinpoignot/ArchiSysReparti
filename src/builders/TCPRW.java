package builders;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TCPRW extends TCPInfo {
	
	public static final int size = 8192;
	private byte[] bufferAppli;

	public TCPRW()
	{
		bufferAppli = new byte[size];
	}
	
	public String read(InputStream in) throws IOException {
		
		// Lis le contenu de InputStream puis le met dans bufferAppli
		int count = in.read(bufferAppli);
		String msIn = "";
		
		if(count != -1)
		{
			msIn = new String(bufferAppli,0,count);
		}
		
		return msIn;
	}
	
	public void write(String message, OutputStream out) throws IOException {
		System.out.println("* Writing...");
		
		// Ecriture dans le OutputStream + forcage envoi
		out.write(message.getBytes());
		out.flush();
		
		System.out.println("* Done !");
	}
	
	public void displayBufferAppli()
	{
		System.out.println("Buffer Appli : " + new String(bufferAppli));
	}
}
