import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class UserChat implements IUserChat{
	
	private String usrName;
	
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException
	{
		ServerRoomChat server = (ServerRoomChat) Naming.lookup("//localhost:1099/ServerRoom");
		server.criateRoom("asdads");
	}
	
	
	
	public UserChat() throws RemoteException, MalformedURLException, NotBoundException {
		
	}
	
	
	
	
	
	
	public UserChat(String name) {
		
		usrName = name;
	}
	
	public String GetUsrName()
	{
		return usrName;
	}
	
	public void deliverMsg(String senderName, String msg)
	{
		
		
		
	}
	
	
	
}
