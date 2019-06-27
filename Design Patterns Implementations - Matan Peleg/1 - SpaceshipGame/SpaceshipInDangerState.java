
public class SpaceshipInDangerState extends IGameState {
	
	public SpaceshipInDangerState(GameContext ctx)
	{
		super(ctx);
		System.out.println("SpaceshipInDangerState");
		
	}
	
	public IGameState SpaceshipHit(int HealthLost)
	{	
		ctx.DecreaseHealth(HealthLost);
		if (ctx.GetHealth() < 0)
		{
			return new GameLostState(ctx);
		}
		
		return this;
	}
	
	public IGameState NextLevel()
	{
		ctx.IncreaseLevel();
		
		if (ctx.GetLevel() == 4)
		{
			return new GameWonState(ctx);
		}
		
		return this;
	}
}
