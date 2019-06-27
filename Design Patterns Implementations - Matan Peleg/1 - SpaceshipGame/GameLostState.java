
public class GameLostState extends IGameState {
	
	public GameLostState(GameContext ctx)
	{
		super(ctx);
		System.out.println("GameLostState");
	}
	
	public IGameState SpaceshipHit(int HealthLost)
	{	
		return this;
	}
	
	public IGameState NextLevel()
	{
		return this;
	}
}
