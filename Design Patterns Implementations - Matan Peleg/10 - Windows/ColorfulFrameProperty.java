
public class ColorfulFrameProperty extends PropertyDecorator {

	public ColorfulFrameProperty(IWindow window) {
		super(window);
	}
	@Override
	public String GetWindowProperties() {
		return this.window.GetWindowProperties() + ", colorful frame";
	}

}
