import java.awt.List;

/*
o servidor mant�m uma lista de salas (roomList) e cada sala uma lista de usu�rios
(userList). N�o h� limite de salas, tampouco de usu�rios por sala;


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
