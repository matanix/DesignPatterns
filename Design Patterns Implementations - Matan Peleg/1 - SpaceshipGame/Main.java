
public class Main {
	public static void main(String args[])
	{
		System.out.println("Stimulating a successful game");
		GameContext ctx = new GameContext();
		ctx.SpaceshipHit(15);
		ctx.NextLevel();
		ctx.SpaceshipHit(20);
		ctx.NextLevel();
		ctx.NextLevel();
		ctx.NextLevel();
		
		System.out.println("Stimulating a failure");
		ctx.StartNewGame();
		ctx.SpaceshipHit(15);
		ctx.NextLevel();
		ctx.SpaceshipHit(20);
		ctx.NextLevel();
		ctx.SpaceshipHit(40);
		
	}
}
