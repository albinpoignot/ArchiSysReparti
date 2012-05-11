/**
 * 
 */
package ArchiSysReparti;

/**
 * @author bous
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new TCPServerHello()).start();
		new Thread(new TCPClientHello()).start();

	}

}
