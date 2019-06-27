
public abstract class TemplateWorkout {

	protected abstract void SwapToWorkoutClothing();
	protected abstract void DrinkWater();
	protected abstract void DoExercise();
	protected abstract void TakeAShower();
	
	public void Workout()
	{
		SwapToWorkoutClothing();
		DrinkWater();
		DoExercise();
		TakeAShower();
	}
}
