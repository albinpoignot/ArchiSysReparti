package builders;

public class TCPClientBuffer extends TCPClientBuilder {
	/**
	 * 
	 */
	public TCPClientBuffer() {
	}
	/**
	 * @special
	 */
	public TCPClientBuffer(int bufferSize) {
		super();
		setSize(bufferSize);
	}
}
