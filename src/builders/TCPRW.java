package builders;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TCPRW extends TCPInfo {
	
	private int size = 8192;
	private int sizeAppli = 8192;
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	private byte[] bufferAppli;

	public TCPRW()
	{
		bufferAppli = new byte[size];
	}
	
	public StringBuffer read(InputStream in) throws IOException {
		
		// Lis le contenu de InputStream puis le met dans bufferAppli
		int count;
		StringBuffer msIn = new StringBuffer();

		int i = 1;
		while( (count = in.read(bufferAppli)) != -1){
			
			String smsIn = new String(bufferAppli,0,count);
			msIn.append(smsIn);
			System.out.println("Read n°" + i + " -> count: " + count);
			i++;
		}
		return msIn;
	}
	
	public void write(StringBuffer message, OutputStream out) throws IOException {
		System.out.println("* Writing...");
		
		// Ecriture dans le OutputStream + forcage envoi
		//TODO revoir ca  :
		out.write(message.toString().getBytes());
		out.flush();
		
		System.out.println("* Done !");
	}
	
	public void displayBufferAppli()
	{
		System.out.println("Buffer Appli : " + new String(bufferAppli));
	}
	
	public StringBuffer duplicate(String message)
	{
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < 2000; i++){
			sb.append(message);
		}
		return sb;
	}
	
	public void paramBufferAppli()
	{
		//TODO check
		bufferAppli = new byte[sizeAppli];
	}

	
	/**
	 * @return the sizeAppli
	 */
	public int getSizeAppli() {
		return sizeAppli;
	}

	/**
	 * @param sizeAppli the sizeAppli to set
	 */
	public void setSizeAppli(int sizeAppli) {
		this.sizeAppli = sizeAppli;
	}
	
}
