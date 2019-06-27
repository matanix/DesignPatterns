
public class Main {
	//This solution uses the MEDIATOR DP
	public static void main(String args[])
	{
		Mediator mediator = new ChatMediator();
		User Matan = new ChatUser(mediator, "Matan");
		User Ido = new ChatUser(mediator, "Ido");
		User Idan = new ChatUser(mediator, "Idan");
		User Guy = new ChatUser(mediator, "Guy");
		User Omri = new ChatUser(mediator, "Omri");
		
		Matan.SendBroadcast("Hey everyone");
		Ido.SendBroadcast("Hey everyone");
		Idan.SendTo("Matan i need you to help me", "Matan");
		Matan.SendTo("I will help", "Idan");
		Guy.SendTo("Hey omri", "Omri");
		Omri.SendTo("Hey guy", "Guy");
	}
}
