/**
 * This is the second subclass of the GeneticFactory. This is the second configuration of implementing a GA. 
 * Here we have two abstract methods implemented, selectionChoice and crossoverChoice. 
 * These methods will decide at runtime what type of class to generate, depending on the input from the client.
 * This class has access to only it's own style of the elite, roulette selections. And also its own version
 * of the crossovers.
 * For configTwo here I have implemented its own version of these that are specific for this configuration.
 * These are denoted by the word Two at the end of each class , i.e. eliteSelectionTwo().
 * Mutation is also implemented below.
 * @author Ian Dempsey
 *
 */
public class ConfigTwo extends GeneticFactory {

	/**
	 * This method will generate a new class of one of the crossover classes that are for this Config setup.
	 * @param String type, Population p
	 * @return Selection
	 */
	protected Selection selectionChoice(String type, Population p) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new EliteSelectionTwo(p);
		}else if (type.equals("roulette")) {
			return new RouletteSelectionTwo(p);
		}else throw new IllegalArgumentException("Illegal Argument" + type);
	}

	/**
	 * crossoverChoice() will generate a new class of one of the crossover classes that are for this Config setup.
	 * @param int numCross the type of crossover to be done. Population p
	 * @return a Crossover object
	 */
	protected Crossover crossoverChoice(int numCross, Population p) {
		if(numCross == 1) {
			return new OnePointCrossoverTwo(p);
			
		}else if(numCross == 2) {
			return new TwoPointCrossoverTwo(p);
		}else throw new IllegalArgumentException("Illegal Argument" + numCross);
	}
	/**
	 * The mutationChance here is just the normal type of mutation. It has a 10% chance of being called.
	 * The return can be null as it was not executed.
	 * @param Population p
	 * @return Mutation
	 */
	protected Mutation mutationChance(Population p) {
		// TODO Auto-generated method stub
		double num = Math.random();
		if(num<0.1) {
			return new MutateNorm(p);
		}
		return null;
	}

}
