import java.util.ArrayList;

public class RoomChat implements IRoomChat{
	
	private String roomName;
	private ArrayList<UserChat> usrList;
	
	
	public RoomChat(String roomName) {
		this.roomName = roomName;
	}
	
	public void joinRoom(String usrName)
	{
		
	}
	
	
	public void sendMsg(String usrName, String msg)
	{
	}
	
	public void leaveRoom(String usrName)
	{
		
	}
	
	
	public void closeRoom()
	{
		
		
	}
	
}
