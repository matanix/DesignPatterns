
public class Main {
	//This solution uses the builder DP
	public static void main(String args[])
	{
		
	ComputerBuilder gaming = new GamingComputerBuilder();
	ComputerBuilder office = new OfficeComputerBuilder();
	ComputerBuilder salon = new SalonComputerBuilder();
	
	System.out.println("Building gaming computer:");
	gaming.BuildComputer();
	Computer gamingComputer = gaming.GetComputer();
			
	System.out.println("Building office computer:");
	office.BuildComputer();
	Computer officeComputer = office.GetComputer(); 
			
	System.out.println("Building salon computer:");
	salon.BuildComputer();
	Computer salonComputer = salon.GetComputer();
			
	
	System.out.println("Salon computer built:");
	System.out.println(salonComputer);
	
	System.out.println("Office computer built:");
	System.out.println(officeComputer);
	
	System.out.println("Gaming computer built:");
	System.out.println(gamingComputer);
	}
}
