/**
 * 
 */
package builders;

/**
 * @author bous
 *
 */
public class TCPServerBufferTime extends TCPServerBuilder {

	/**
	 * 
	 */
	public TCPServerBufferTime() {
		// TODO Auto-generated constructor stub
	}

	public TCPServerBufferTime(int bufferSize, int bufferAppliSize) {
		super();
		setSize(bufferSize);
		setSizeAppli(bufferAppliSize);
		paramBufferAppli();
	}
}
