package builders;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPRW extends TCPInfo {
	
	public static final int size = 8192;
	private byte[] bufferAppli;

	public String read(Socket s) throws IOException {
		InputStream in = s.getInputStream();
		bufferAppli = new byte[size];
		int count = in.read(bufferAppli);
		String msIn = new String(bufferAppli,0,count) ;
		in.close();
		
		return msIn;
		
		//System.out.println("Received : " + msIn);
	}
	
	public void write(Socket s) throws IOException {
		System.out.println("* Writing...");
		
		String msOut = "Aujourd'hui, TP ASR Java." ;
		OutputStream out = s.getOutputStream();
		out.write(msOut.getBytes());
		out.flush();
		out.close();
		
		System.out.println("* Done !");
	}
}
