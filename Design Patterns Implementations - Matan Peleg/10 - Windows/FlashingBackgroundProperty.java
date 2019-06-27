
public class FlashingBackgroundProperty extends PropertyDecorator {

	public FlashingBackgroundProperty(IWindow window) {
		super(window);
	}
	
	@Override
	public String GetWindowProperties() {
		return this.window.GetWindowProperties() + ", has flashing background";
	}
}
