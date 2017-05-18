import java.rmi.RemoteException;
import java.util.ArrayList;

public interface IServerRoomChat  extends java.rmi.Remote{

	public ArrayList<RoomChat> getRooms() throws RemoteException;
	public void criateRoom(String roomName) throws RemoteException;
}
