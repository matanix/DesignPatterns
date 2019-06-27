
public abstract class ComputerBuilder {
	
	protected Computer computer;
	
	public Computer GetComputer()
	{
		return this.computer;
	}
	
	public void BuildComputer()
	{
		System.out.println("Building computer..");
		this.computer = new Computer();
		BuildBox();
		PlaceMotherBoard();
		AddCpu();
		AddGraphicsCard();
		AddRam();
		TestComputer();
	}
	
	protected abstract void BuildBox();
	
	protected abstract void PlaceMotherBoard();
	
	protected abstract void AddCpu();
	
	protected abstract void AddGraphicsCard();
	
	protected abstract void AddRam();
	
	protected abstract void TestComputer();
	
	
}
