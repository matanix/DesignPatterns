
public class GamingComputerBuilder extends ComputerBuilder {
	protected void BuildBox()
	{
		this.computer.BuildBox("Gaming box Z15");
	}
	
	protected void PlaceMotherBoard()
	{
		this.computer.PlaceMotherBoard("Asus z500");
	}
	
	protected void AddCpu()
	{
		this.computer.AddCpu("Intel i7");
	}
	
	protected void AddGraphicsCard()
	{
		this.computer.AddGraphicsCard("GTX 2080");
	}
	
	protected void AddRam()
	{
		this.computer.AddRam("32 GB DDR 4");
	}
	
	protected void TestComputer()
	{
		this.computer.TestComputer();
	}
}
