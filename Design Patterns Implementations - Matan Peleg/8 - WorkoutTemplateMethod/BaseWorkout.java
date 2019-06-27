
public abstract class BaseWorkout extends TemplateWorkout{
	@Override
	protected void SwapToWorkoutClothing()
	{
		System.out.println("Putting workout clothing on");
	}
	
	@Override
	protected void DrinkWater()
	{
		System.out.println("Drinking water");
	}
	
	@Override
	protected void TakeAShower()
	{
		System.out.println("Taking a shower");
	}
}
