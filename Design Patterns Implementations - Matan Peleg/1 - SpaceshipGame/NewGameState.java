
public class NewGameState extends IGameState {
	
	public NewGameState(GameContext ctx)
	{
		super(ctx);
		System.out.println("NewGameState");
		
	}
	
	public IGameState SpaceshipHit(int HealthLost)
	{	
		SpaceshipOKState okState = new SpaceshipOKState(ctx);
		return okState.SpaceshipHit(HealthLost);
	}
	
	public IGameState NextLevel()
	{
		SpaceshipOKState okState = new SpaceshipOKState(ctx);
		return okState.NextLevel();
	}
}
