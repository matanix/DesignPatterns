
public class Main {
	//This solution uses the Decorator DP
	public static void main(String args[])
	{
		System.out.println("Creating base window");
		IWindow base = new BaseWindow(500);
		System.out.println(base.GetWindowProperties());
		
		System.out.println("Adding ColorfulFrameProperty");
		IWindow frame = new ColorfulFrameProperty(base);
		System.out.println(frame.GetWindowProperties());
		
		System.out.println("Adding FlashingBackgroundProperty");
		IWindow background = new FlashingBackgroundProperty(frame);
		System.out.println(background.GetWindowProperties());
		
		System.out.println("Adding PartMirroringProperty");
		IWindow mirror = new PartMirroringProperty(background);
		System.out.println(mirror.GetWindowProperties());
		
		System.out.println("Adding ShadowProperty");
		IWindow shadow = new ShadowProperty(mirror);
		System.out.println(shadow.GetWindowProperties());
		
		System.out.println("Adding ThreeDimensionalLightProperty");
		IWindow threeD = new ThreeDimensionalLightProperty(shadow);
		System.out.println(threeD.GetWindowProperties());
	}
}
