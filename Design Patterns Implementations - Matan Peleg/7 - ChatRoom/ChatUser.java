
public class ChatUser extends User {
	
	private String username;
	
	public ChatUser(Mediator mediator, String username)
	{
		super(mediator);
		this.username = username;
	}
	
	public String GetUsername()
	{
		return this.username;
	}
	
	@Override
	public void Notify(String message, String senderUsername) 
	{
		System.out.println(username + " gets message: " + "\"" + message + "\"" + " from " + senderUsername);
	}

	@Override
	public void SendTo(String message, String targetUsername) {
		mediator.SendTo(message, targetUsername, this.username);
	}

	@Override
	public void SendBroadcast(String message) {
		mediator.SendBroadCast(message, this.username);
	}

}
