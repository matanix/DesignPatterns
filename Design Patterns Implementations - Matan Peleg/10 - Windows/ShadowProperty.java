
public class ShadowProperty extends PropertyDecorator {

	public ShadowProperty(IWindow window)
	{
		super(window);
	}
	
	@Override
	public String GetWindowProperties() {
		return this.window.GetWindowProperties() + ", with shadow";
	}

}
