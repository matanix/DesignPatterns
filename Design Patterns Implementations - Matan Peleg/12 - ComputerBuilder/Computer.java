
public class Computer {
	
	private String box;
	private String motherboard;
	private String cpu;
	private String graphicsCard;
	private String ram;
	
	public Computer()
	{
		
	}
	
	public void BuildBox(String box)
	{
		this.box = box;
	}
	
	public void PlaceMotherBoard(String motherboard)
	{
		this.motherboard = motherboard;
	}
	
	public void AddCpu(String cpu)
	{
		this.cpu = cpu;
	}
	
	public void AddGraphicsCard(String graphicsCard)
	{
		this.graphicsCard = graphicsCard;
	}
	
	public void AddRam(String ram)
	{
		this.ram = ram;
	}
	
	public void TestComputer()
	{
		System.out.println("Computer is OK");
	}
	
	@Override
	public String toString()
	{
		return "box: " + this.box + "\n" + "motherboard: " + this.motherboard + "\n" + "cpu: " + this.cpu + "\n" + "graphics card: " + this.graphicsCard + "\n" 
				+ "ram: " + this.ram + "\n";
	}
}
