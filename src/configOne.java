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
public class configOne extends GeneticFactory {

	
	protected Selection selectionChoice(String type) {
		// TODO Auto-generated method stub
		if(type.equals("elite")) {
			return new eliteSelectionOne();
		}else if (type.equals("roulette")) {
			return new rouletteSelectionOne();
		}else throw new IllegalArgumentException("Illegal Argument" + type);
	}

	
	protected Crossover crossoverChoice(int numCross) {
		if(numCross == 1) {
			return new onePointCrossoverOne();
			
		}else if(numCross == 2) {
			return new twoPointCrossoverOne();
		}else throw new IllegalArgumentException("Illegal Argument" + numCross);
	}
	
	/*
	 * This mutationChance will call the biased style 10% of the time. 
	 * 
	 */
	protected void mutationChance() {
		// TODO Auto-generated method stub
		double num = Math.random()*2;
		if(num<=0.2) {
			new mutateBias();
		}
	}

}
