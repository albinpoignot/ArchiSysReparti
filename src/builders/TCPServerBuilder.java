package builders;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

public class TCPServerBuilder extends TCPRW {

	private ServerSocket ss;
	private InetSocketAddress isA;

	public TCPServerBuilder() {
		setSs(null) ;
		setIsA(new InetSocketAddress("localhost",8080));
	}

	public ServerSocket getSs() {
		return ss;
	}

	public void setSs(ServerSocket ss) {
		this.ss = ss;
	}

	public InetSocketAddress getIsA() {
		return isA;
	}

	public void setIsA(InetSocketAddress isA) {
		this.isA = isA;
	}
}
