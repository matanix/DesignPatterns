
public abstract class User {
	protected Mediator mediator;
	
	public User(Mediator mediator)
	{
		this.mediator = mediator;
		this.mediator.AddUser(this);
	}
	public abstract void Notify(String message, String senderUsername);
	public abstract void SendTo(String message, String targetUsername);
	public abstract void SendBroadcast(String message);
	public abstract String GetUsername();
}
