
public class FatalLogHandler extends LogHandler{
	
	private SMSNotify smsNotifier;
	
	public FatalLogHandler(SMSNotify smsNotifier)
	{
		this.smsNotifier = smsNotifier;
	}
	
	public void handle(String log, LogLevel logLevel) {
		if (logLevel.ordinal() >= LogLevel.FATAL.ordinal())
		{
			this.smsNotifier.SendSMS(log);
		}

		if (next != null)
		{
			next.handle(log, logLevel);
		}
	}
}
