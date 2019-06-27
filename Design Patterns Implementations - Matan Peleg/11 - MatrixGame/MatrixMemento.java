
public class MatrixMemento {
	private int xAxis;
	private int yAxis;
	private int number; 
	
	public MatrixMemento(int xAxis, int yAxis, int number)
	{
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.number = number;
	}
	
	public int getX()
	{
		return xAxis;
	}
	
	public int getY()
	{
		return yAxis;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public void SetPoint(int xAxis, int yAxis, int number)
	{
		this.xAxis = xAxis;
		this.yAxis = yAxis;	
		this.number = number;
	}
}
