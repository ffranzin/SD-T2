import java.awt.List;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.ArrayList;

/*
o servidor mantém uma lista de salas (roomList) e cada sala uma lista de usuários
(userList). Não há limite de salas, tampouco de usuários por sala;


*/

public class ServerRoomChat implements IServerRoomChat {

	private String usrName; 
	private ArrayList<RoomChat> roomList;
	
	
	public ServerRoomChat() {
		roomList = new ArrayList<RoomChat>();
		
		ServerRoomChat server = new ServerRoomChat();
		
		try {
			Naming.rebind("rmi://localhost:1099/ServerRoom", server);
		} 
		catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//Send the list of rooms to client
	public ArrayList<RoomChat> getRooms()
	{
		return roomList;
	}
	
	
	public void criateRoom(String roomName)
	{
		RoomChat room = new RoomChat(roomName); //nameFrominterface 
		
		roomList.add(room);
	}
	
}
