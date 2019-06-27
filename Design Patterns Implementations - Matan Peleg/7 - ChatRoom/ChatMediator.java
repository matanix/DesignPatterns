import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
	private List<User> users;
	
	public ChatMediator()
	{
		super();
		users = new ArrayList<User>();
	}
	
	public void AddUser(User user)
	{
		users.add(user);
	}
	
	public void SendTo(String message, String targetUsername, String senderUsername)
	{
		for (User user : users)
		{
			if (user.GetUsername().equals(targetUsername))
			{
				user.Notify(message, senderUsername);
				break;
			}
		}
	}
	
	public void SendBroadCast(String message, String senderUsername)
	{
		for (User user : users)
		{
			user.Notify(message, senderUsername);
		}
	}
	
}
