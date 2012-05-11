package ArchiSysReparti;

import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class TCPServerBuilder extends TCPInfo {
	protected ServerSocket ss;
	protected InetSocketAddress isA;
	
	TCPServerBuilder() {
		ss = null ;
		isA = new InetSocketAddress("localhost",8080);
	}
}
