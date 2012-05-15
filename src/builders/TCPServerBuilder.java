package builders;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;

public class TCPServerBuilder extends TCPRW {

	private ServerSocket ss;
	private InetSocketAddress isA;

	public TCPServerBuilder() {
		ss = null;
		isA = null;
	}

	public ServerSocket getSs() {
		return ss;
	}

	public void setServerSocket() throws IOException {
		ss = new ServerSocket();
		ss.setSoTimeout(5000);
		isA = new InetSocketAddress("localhost",8080);
	}

	public InetSocketAddress getIsA() {
		return isA;
	}
}
