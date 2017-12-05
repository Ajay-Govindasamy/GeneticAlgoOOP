/**
 * This is the GeneticFactory. It is where the user talks to and asks for a specific version of a GA. 
 * The method doProcess() is the main method here. It creates objects of Selection, Crossover.
 * It then calls them based on the input from the user in GARunner. 
 * Also, for the specific style of configuration setup for the GA, a type of mutation is called. 
 * Each type of mutation, selection and crossover is specific to the type of configuration chosen. 
 * Also includes 3 abstract methods. These are implemented in the subclasses, configOne, configTwo.
 * @author Ian Dempsey
 *
 * @param <T>
 */
public abstract class GeneticFactory<T> {
	/*public Selection doSelection(String type) {
		Selection select;
		 select = selectionChoice(type);
		 return select;
	}*/
	/**
	 * Update this to have Generics inputted! 
	 * Main method, depending on the configuration that was instantiated in GARunner, it will call
	 * specific methods styled for that configuration.
	 * @param type
	 * @param numCross
	 * @return Object
	 */
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
