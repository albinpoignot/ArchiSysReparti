package builders;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

public class TCPClientBuilder extends TCPRW {
	private Socket s;
	private InetSocketAddress isA;
	
	public TCPClientBuilder() {
		s = null;
		isA = null;
		
	}

	public Socket getS() {
		return s;
	}

	public void setSocket() throws SocketException {
		s = new Socket();
		isA = new InetSocketAddress("localhost",8080);
	}

	public InetSocketAddress getIsA() {
		return isA;
	}

	public void setIsA(InetSocketAddress isA) {
		this.isA = isA;
	}
}
