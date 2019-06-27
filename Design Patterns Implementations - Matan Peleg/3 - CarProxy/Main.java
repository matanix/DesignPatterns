
//This solution uses proxy DP
public class Main {
	public static void main(String args[])
	{
		System.out.println("With the real car we can use both ICarControl and ICarStatistics functionality.");
		RealCar realCar = new RealCar();
		realCar.StartDrive();
		realCar.TurnLeft();
		realCar.TurnRight();
		realCar.IncreaseSpeed();
		realCar.SlowDown();
		realCar.EndDrive();
		System.out.println(realCar.GetFuelStatus());
		System.out.println(realCar.GetLocation());
		
		System.out.println("With the CarStatisticsProxy we are limited to ICarStatistics functionality of the real car..");
		CarStatisticsProxy proxy = new CarStatisticsProxy();
		System.out.println(proxy.GetFuelStatus());
		System.out.println(proxy.GetLocation());
	}
}
