/**
 * 
 */
package builders;

/**
 * @author bous
 *
 */
public class TCPServerBuffer extends TCPServerBuilder {

	/**
	 * 
	 */
	public TCPServerBuffer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @special
	 */
	public TCPServerBuffer(int bufferSize, int bufferAppliSize) {
		super();
		setSize(bufferSize);
		setSizeAppli(bufferAppliSize);
		paramBufferAppli();
	}
}
