
public class SpaceshipOKState extends IGameState {
	
	public SpaceshipOKState(GameContext ctx)
	{
		super(ctx);
		System.out.println("SpaceshipOKState");
		
	}
	
	public IGameState SpaceshipHit(int HealthLost)
	{	
		ctx.DecreaseHealth(HealthLost);
		if (ctx.GetHealth() < 0)
		{
			return new GameLostState(ctx);
		}
		
		if (ctx.GetHealth() < 20)
		{
			return new SpaceshipInDangerState(ctx);
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
