package builders;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClientBuilder extends TCPInfo {
	private Socket s;
	private InetSocketAddress isA;
	
	public TCPClientBuilder() {
		setS(new Socket());
		setIsA(new InetSocketAddress("localhost",8080));
		//isA = new InetSocketAddress("172.25.1.203",55320);
	}

	public Socket getS() {
		return s;
	}

	public void setS(Socket s) {
		this.s = s;
	}

	public InetSocketAddress getIsA() {
		return isA;
	}

	public void setIsA(InetSocketAddress isA) {
		this.isA = isA;
	}
}
