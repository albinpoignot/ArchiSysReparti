package builders;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPRW extends TCPInfo {
	
	public static final int size = 8192;
	private byte[] bufferAppli;

	public TCPRW()
	{
		bufferAppli = new byte[size];
	}
	
	public String read(InputStream in) throws IOException {
		int count = in.read(bufferAppli);
		String msIn = new String(bufferAppli,0,count);
		in.close();
		return msIn;
	}
	
	public void write(OutputStream out) throws IOException {
		System.out.println("* Writing...");
		
		String msOut = "Aujourd'hui, TP ASR Java." ;
		out.write(msOut.getBytes());
		out.flush();
		out.close();
		
		System.out.println("* Done !");
	}
	
	public void displayBufferAppli()
	{
		System.out.println("Buffer Appli : " + new String(bufferAppli));
	}
}
