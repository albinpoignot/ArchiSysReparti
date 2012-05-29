//import hello.*;
//import info.*;
import communicate.*;

class Main {

	public static void main(String[] args) {
		
		/** HELLO VERSION **/
		/*new Thread(new TCPServerHello()).start();
		new Thread(new TCPClientHello()).start();*/
		
		/** INFO VERSION **/
		/*new Thread(new TCPServerInfo()).start();
		new Thread(new TCPClientInfo()).start();*/
		
		/** COMMUNICATE VERSION **/
		new Thread(new TCPServerCommunicate(64,1024)).start();
		new Thread(new TCPClientCommunicate(64)).start();
	}

}
