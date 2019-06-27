
public class CarStatisticsProxy implements ICarStatistics{
    private RealCar realCar = new RealCar();
 
	@Override
	public String GetFuelStatus()
	{
		return realCar.GetFuelStatus();
	}
	
	@Override
	public String GetLocation()
	{
		return realCar.GetLocation();
	}
	
}
