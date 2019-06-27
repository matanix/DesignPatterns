
public interface Mediator {
	public abstract void SendTo(String message, String targetUsername, String senderUsername);
	public abstract void SendBroadCast(String message, String senderUsername);
	public abstract void AddUser(User user);
}
