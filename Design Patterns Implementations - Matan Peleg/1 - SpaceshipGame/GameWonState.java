
public class GameWonState extends IGameState {
	
	public GameWonState(GameContext ctx)
	{
		super(ctx);
		System.out.println("GameWonState");
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
