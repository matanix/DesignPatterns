public abstract class LogHandler {
	protected LogHandler next;
	
	public void setNext(LogHandler next)
	{
		this.next = next;
	}
	
	public abstract void handle(String log, LogLevel logLevel);
}
