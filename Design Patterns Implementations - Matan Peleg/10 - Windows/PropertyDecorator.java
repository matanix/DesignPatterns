
public abstract class PropertyDecorator implements IWindow {

	protected IWindow window;
	
	public PropertyDecorator(IWindow window)
	{
		super();
		this.window = window;
	}
}
