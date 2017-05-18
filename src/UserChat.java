import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class UserChat implements IUserChat{
	
	private String nameUser;
	
	public UserChat(String nameUser){
		this.nameUser = nameUser;
		try {
			ServerRoomChat server = (ServerRoomChat) Naming.lookup("//127.0.0.1:1099/ServerRoom");
		} catch (Exception e){
			
		}
	}
	
	// para recebimento de mensagens
	public void deliverMsg(String senderName, String msg)
	{
		
	}
	
	
	
}
