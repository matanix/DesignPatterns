
public class Main {	
	//This solution uses the COR DP
	public static void main(String args[])
	{
		SMSNotify notifier = new SMSNotify();
		notifier.RegisterPhoneNumber("0544292324");
		notifier.RegisterPhoneNumber("052234342");
		
		FatalLogHandler fatal = new FatalLogHandler(notifier);
		ErrorLogHandler error = new ErrorLogHandler();
		InfoLogHandler info = new InfoLogHandler();
		
		fatal.setNext(error);
		error.setNext(info);
		
		System.out.println("Testing INFO log");
		fatal.handle("The machine has low battery", LogLevel.INFO);
		
		System.out.println("Testing ERROR log");
		fatal.handle("The machine isn't turned on and was requested to execute command", LogLevel.ERROR);
		
		System.out.println("Testing FATAL log");
		fatal.handle("The machine is being attacked!", LogLevel.FATAL);
	}
}
