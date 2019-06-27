
public class ThreeDimensionalLightProperty extends PropertyDecorator {

	public ThreeDimensionalLightProperty(IWindow window) {
		super(window);
	}
	@Override
	public String GetWindowProperties() {
		return this.window.GetWindowProperties() + ", with Three Dimensional light";
	}

}
