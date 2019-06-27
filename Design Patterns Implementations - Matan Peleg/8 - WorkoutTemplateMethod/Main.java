
//This solution uses Template Method DP
public class Main {
	public static void main(String args[])
	{
		TemplateWorkout pullupWorkout = new PullupWorkout();
		TemplateWorkout runningWorkout = new RopeWorkout();
		TemplateWorkout ropeWorkout = new RopeWorkout();
		
		pullupWorkout.Workout();
		ropeWorkout.Workout();
		runningWorkout.Workout();
		
	}
}
