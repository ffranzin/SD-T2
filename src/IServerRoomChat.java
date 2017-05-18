import java.util.ArrayList;

public interface IServerRoomChat  extends java.rmi.Remote{

	public ArrayList<RoomChat> getRooms();
	public void criateRoom(String roomName);

}
