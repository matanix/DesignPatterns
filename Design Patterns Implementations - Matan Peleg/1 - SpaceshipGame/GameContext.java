
public class GameContext {
	private int health;
	private int level;
	IGameState state;
	
	public GameContext()
	{
		this.health = 50;
		this.level = 0;
		this.state = new NewGameState(this);
	}
	
	public void StartNewGame()
	{
		this.state = this.state.StartNewGame();
	}
	
	public void SpaceshipHit(int hit)
	{
		this.state = this.state.SpaceshipHit(hit);
	}
	
	public void NextLevel()
	{
		this.state = this.state.NextLevel();
	}
	
	public int GetHealth()
	{
		return this.health;
	}
	
	public void DecreaseHealth(int decrease)
	{
		this.health = this.health - decrease;
	}
	
	public int GetLevel()
	{
		return this.level;
	}
	
	public void IncreaseLevel()
	{
		this.level++;
	}
	
	public void ResetContextData()
	{
		this.health = 50;
		this.level = 0;
	}
	
}
