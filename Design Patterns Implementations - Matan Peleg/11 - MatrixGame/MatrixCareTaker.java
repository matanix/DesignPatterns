
public class MatrixCareTaker {
	
	private MatrixMemento lastSave;
	
	public MatrixCareTaker()
	{
		lastSave = null;
	}
	
	public void Save(MatrixMemento memento)
	{
		this.lastSave = memento;
	}
	
	public MatrixMemento getSave()
	{
		return this.lastSave;
	}

}