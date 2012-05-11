package ArchiSysReparti;

import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClientBuilder extends TCPInfo{
	protected Socket s;
	protected InetSocketAddress isA;
	
	TCPClientBuilder() {
		s = new Socket();
		isA = new InetSocketAddress("localhost",8080);
	}
}
