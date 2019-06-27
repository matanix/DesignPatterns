
public class SalonComputerBuilder extends ComputerBuilder {
	protected void BuildBox()
	{
		this.computer.BuildBox("Regular box");
	}
	
	protected void PlaceMotherBoard()
	{
		this.computer.PlaceMotherBoard("Intel builtin motherboard");
	}
	
	protected void AddCpu()
	{
		this.computer.AddCpu("Intel i3");
	}
	
	protected void AddGraphicsCard()
	{
		this.computer.AddGraphicsCard("Intel family graphics");
	}
	
	protected void AddRam()
	{
		this.computer.AddRam("8 GB DDR 3");
	}
	
	protected void TestComputer()
	{
		this.computer.TestComputer();
	}
}
