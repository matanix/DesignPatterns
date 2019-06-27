
public class RealCar implements ICarControl, ICarStatistics {
	@Override
	public void StartDrive()
	{
		System.out.println("Starting to drive..");
	}
	
	@Override
	public void EndDrive()
	{
		System.out.println("Ending the drive");
	}
	
	@Override
	public void IncreaseSpeed()
	{
		System.out.println("Increasing speed..");
	}
	
	@Override
	public void SlowDown()
	{
		System.out.println("Slowing down");
	}
	
	@Override
	public void TurnLeft()
	{
		System.out.println("Turning left");
	}
	
	@Override
	public void TurnRight()
	{
		System.out.println("Turning right");
	}
	
	@Override
	public String GetFuelStatus()
	{
		return "Fuel is 50% full";
	}
	
	@Override
	public String GetLocation()
	{
		return "The car is at miami beach 15";
	}
}
