
public class BaseWindow implements IWindow {

	private int size; 
	
	public BaseWindow(int size)
	{
		this.size = size;
	}
	
	@Override
	public String GetWindowProperties() {
		return "Size (pixels): " + size;
	}
	
	public int GetSize()
	{
		return this.size;
	}
	
	public void SetSize(int size)
	{
		this.size = size;
	}

}
