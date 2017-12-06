package GAFactory;
import GAPopulation.Population;
import GASelection.*;
import GACrossover.*;
import GAMutation.*;
/**
 * This is the GeneticFactory. It is where the user talks to and asks for a specific version of a GA. 
 * The method doProcess() is the main method here. It creates objects of Selection, Crossover.
 * It then calls them based on the input from the user in GARunner. 
 * Also, for the specific style of configuration setup for the GA, a type of mutation is called. 
 * Each type of mutation, selection and crossover is specific to the type of configuration chosen. 
 * Also includes 3 abstract methods. These are implemented in the subclasses, configOne, configTwo.
 * I have instance variables to hold the classes which are generated inside doProcess(...).
 * These can be obtained via getters.
 * @author Ian Dempsey
 */
public abstract class GeneticFactory {
	Selection select;
	Crossover cross;
	Mutation mutate;
	/**
	 * Main method, depending on the configuration that was instantiated in GARunner, it will call
	 * specific methods styled for that configuration.
	 * @param  type the type of Selection to perform
	 * @param  numCross the type of crossover to perform.
	 * @param  p, the Population to be worked on. 
	 * @return Object
	 */
	public Object doProcess(String type, int numCross, Population p){
		select = selectionChoice(type,p);
		cross = crossoverChoice(numCross,p);
		mutate=mutationChance(p);
		return null;
	}
	
	public Selection getSelection() {
		return select;
	}
	public Crossover getCrossover() {
		return cross;
	}
	public Mutation getMutation() {
		return mutate;
	}

	/**
	 * This method is defined in all relevant configs. 
	 * Each one alters this to suit their needs.
	 * @param type
	 * @param p
	 * @return Selection
	 */
	protected abstract Selection selectionChoice(String type,Population p);
	
	/**
	 * This method is defined in all relevant configs. 
	 * Each one alters this to suit their needs.
	 * @param type
	 * @param p
	 * @return Crossover
	 */
	protected abstract Crossover crossoverChoice(int numCross, Population p);
	
	/**
	 * This method is defined in all relevant configs. 
	 * Each one alters this to suit their needs.
	 * @param type
	 * @param p
	 * @return Mutation
	 */
	protected abstract Mutation mutationChance(Population p);
}
