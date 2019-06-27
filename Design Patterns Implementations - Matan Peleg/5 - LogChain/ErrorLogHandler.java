
public class ErrorLogHandler extends LogHandler {
	public void handle(String log, LogLevel logLevel) {
		if (logLevel.ordinal() >= LogLevel.ERROR.ordinal())
		{
			System.out.println("Writing \"" + log + "\" to log file..");
		}

		if (next != null)
		{
			next.handle(log, logLevel);
		}
	}
}
