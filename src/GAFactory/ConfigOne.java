package GAFactory;
import GAPopulation.Population;
import GASelection.*;
import GACrossover.*;
import GAMutation.*;
/**
 * This is the first subclass of the GeneticFactory. This is one configuration of implementing a GA. 
 * Here we have two abstract methods implemented, selectionChoice and crossoverChoice. 
 * These methods will decide at runtime what type of class to generate, depending on the input from the client.
 * This class has access to only it's own style of the elite, roulette selections. And also its own version
 * of the crossovers. Also mutation is performed randomly.
 * For configTwo I have implemented its own version of these that are specific for this configuration.
 * I have the case where a user inputs some arguments which are illegal taken care of.
 * @author Ian Dempsey
 *
 */
public class ConfigOne extends GeneticFactory {
	private Population p;
	
	/**
	 * This method will generate a new class of one of the crossover classes that are for this Config setup.
	 * @param String type, Population p
	 * @return Selection
	 */
	protected Selection selectionChoice(String type,Population p) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new EliteSelectionOne(p);
		}else if (type.equals("roulette")) {
			return new RouletteSelectionOne(p);
		}else throw new IllegalArgumentException("Illegal Argument" + type);
	}

	/**
	 * crossoverChoice() will generate a new class of one of the crossover classes that are for this Config setup.
	 * @param int numCross the type of crossover to be done. Population p
	 * @return a Crossover object
	 */
	protected Crossover crossoverChoice(int numCross, Population p) {
		if(numCross == 1) {
			return new OnePointCrossoverOne(p);
			
		}else if(numCross == 2) {
			return new TwoPointCrossoverOne(p);
		}else throw new IllegalArgumentException("Illegal Argument" + numCross);
	}
	
	/**
	 * This mutationChance will call the biased style 10% of the time. 
	 * @param p The population to be worked on
	 * @return Mutation
	 */
	protected Mutation mutationChance(Population p) {
		// TODO Auto-generated method stub
		double num = Math.random()*2;
		if(num<=0.2) {
			return new MutateBias(p);
		}
		return null;
	}
}
