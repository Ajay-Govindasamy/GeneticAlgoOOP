
public abstract class GeneticFactory {
	/*public Selection doSelection(String type) {
		Selection select;
		 select = selectionChoice(type);
		 return select;
	}*/
	//so the above is just for implementing the Selection. I need a more generic one though
	//so maybe:
	public Object doProcess(String type, int numCross){
		Selection select;
		select = selectionChoice(type);
		Crossover cross;
		cross = crossoverChoice(numCross);
		mutationChance();
		return null;
	}
	//This is the abstract method, it will be subclassed by all relevant configs. And alter to suit their needs.
	protected abstract Selection selectionChoice(String type);
	
	protected abstract Crossover crossoverChoice(int numCross);
	
	protected abstract void mutationChance();
}
