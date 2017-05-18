import java.awt.List;

/*
o servidor mantém uma lista de salas (roomList) e cada sala uma lista de usuários
(userList). Não há limite de salas, tampouco de usuários por sala;


*/

public class ServerRoomChat implements IServerRoomChat {

	private String usrName; 
	private List roomList;
	
	public void getRooms()
	{
		//return roomList;
	}
	
	
	public void criateRoom(String roomName)
	{
	}
	
}
