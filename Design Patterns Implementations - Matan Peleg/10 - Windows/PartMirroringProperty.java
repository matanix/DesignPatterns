
public class PartMirroringProperty extends PropertyDecorator {

	public PartMirroringProperty(IWindow window)
	{
		super(window);
	}
	
	@Override
	public String GetWindowProperties() {
		return this.window.GetWindowProperties() + ", with part mirroring";
	}

}
