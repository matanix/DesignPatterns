
public class InfoLogHandler extends LogHandler {

	public void handle(String log, LogLevel logLevel) {
		if (logLevel.ordinal() >= LogLevel.INFO.ordinal())
		{
			System.out.println(log);
		}

		if (next != null)
		{
			next.handle(log, logLevel);
		}
	}

}
