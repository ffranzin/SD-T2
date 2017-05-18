
public interface IRoomChat {
	public void sendMsg(String usrName, String msg);
	public void joinRoom(String usrName);
	public void leaveRoom(String usrName);
	public void closeRoom();
}
