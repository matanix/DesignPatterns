
public abstract class IGameState {
	GameContext ctx;
	
	public IGameState(GameContext ctx)
	{
		this.ctx = ctx; 
	}
	
	public IGameState StartNewGame()
	{
		ctx.ResetContextData();
		return new NewGameState(ctx);
	}
	
	public abstract IGameState SpaceshipHit(int HealthLost);
	public abstract IGameState NextLevel();
}
