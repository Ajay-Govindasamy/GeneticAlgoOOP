
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
public class configTwo extends GeneticFactory {

	
	protected Selection selectionChoice(String type) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new eliteSelectionTwo();
		}else if (type.equals("roulette")) {
			return new rouletteSelectionTwo();
		}else throw new IllegalArgumentException("Illegal Argument" + type);
	}

	
	protected Crossover crossoverChoice(int numCross) {
		if(numCross == 1) {
			return new onePointCrossoverTwo();
			
		}else if(numCross == 2) {
			return new twoPointCrossoverTwo();
		}else throw new IllegalArgumentException("Illegal Argument" + numCross);
	}
	/**
	 * The mutationChance here is just the normal type of mutation. It has a 10% chance of being called.
	 */
	protected void mutationChance() {
		// TODO Auto-generated method stub
		double num = Math.random();
		if(num<0.1) {
			new mutateNorm();
		}
	}

}
