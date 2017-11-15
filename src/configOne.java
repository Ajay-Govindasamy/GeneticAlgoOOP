/**
 * This is the first subclass of the GeneticFactory. This is one configuration of implementing a GA. 
 * Here we have two abstract methods implemented, selectionChoice and crossoverChoice. 
 * These methods will decide at runtime what type of class to generate, depending on the input from the client.
 * This class has access to only it's own style of the elite, roulette selections. And also its own version
 * of the crossovers.
 * For configTwo I have implemented its own version of these that are specific for this configuration.
 * @author Ian Dempsey
 *
 */
public class configOne extends GeneticFactory {

	
	protected Selection selectionChoice(String type) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new eliteSelectionOne();
		}else if (type.equals("roulette")) {
			return new rouletteSelectionOne();
		}else return null;
	}

	
	protected Crossover crossoverChoice(int numCross) {
		if(numCross == 1) {
			return new onePointCrossoverOne();
			
		}else if(numCross == 2) {
			return new twoPointCrossoverOne();
		}else return null;
	}

}
