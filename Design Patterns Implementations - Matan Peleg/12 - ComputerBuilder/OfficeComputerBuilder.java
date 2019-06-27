
public class OfficeComputerBuilder extends ComputerBuilder {
	protected void BuildBox()
	{
		this.computer.BuildBox("Asus box 3");
	}
	
	protected void PlaceMotherBoard()
	{
		this.computer.PlaceMotherBoard("Gigabyte 100");
	}
	
	protected void AddCpu()
	{
		this.computer.AddCpu("Intel i5");
	}
	
	protected void AddGraphicsCard()
	{
		this.computer.AddGraphicsCard("Nvidia HD PRO graphics");
	}
	
	protected void AddRam()
	{
		this.computer.AddRam("16 GB DDR 3");
	}
	
	protected void TestComputer()
	{
		this.computer.TestComputer();
	}
}
