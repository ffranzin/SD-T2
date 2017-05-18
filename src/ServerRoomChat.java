import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class ServerRoomChat extends UnicastRemoteObject  implements IServerRoomChat {

	private String usrName; 
	private ArrayList<RoomChat> roomList;
	
	public ServerRoomChat() throws RemoteException 
	{
		roomList = new ArrayList<RoomChat>();
		
		
		
	}
	
	
	public static void main(String[] args) throws RemoteException
	{
		ServerRoomChat server = new ServerRoomChat();
		
		try {
			Naming.rebind("rmi://localhost:1099/ServerRoom", server);
		} 
		catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	//Send the list of rooms to client
	public ArrayList<RoomChat> getRooms() throws RemoteException
	{
		return roomList;
	}
	
	
	public void criateRoom(String roomName) throws RemoteException
	{
		RoomChat room = new RoomChat(roomName); //nameFrominterface 
		System.out.println("crio");
		roomList.add(room);
	}
	
}
