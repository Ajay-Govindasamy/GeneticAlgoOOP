/**
 * This class is a subclass of the interface Selection. It is a specific version of elite selection that is
 * implemented by the configOne class. It is its own style of doing elite selection
 * It implements its own version of the performSelection() method.
 * This is for configOne class
 * @author Ian Dempsey, 12383546
 */

public class RouletteSelectionOne implements Selection {
	/**
	 * The constructor which is called in the configOne class will call the overwritten performSelection() method here.
	 * This could be done by say having class variables in Selection itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 * @param Population p
	 */
	public RouletteSelectionOne( Population p) {
		performSelection(p);
	}
	/**
	 * This roulette version works by assigning each candidate a portion of the wheel depending on their fitness level
	 * The better their fitness value, the more of it they will have. Increasing their chances of being picked
	 * This does not mean smaller candidates do not have a chance though
	 * @param Population p
	 * @return Population
	 */
	public Population performSelection(Population p) {
		System.out.println("\nStarting the roulette selection for configuration 1.");
		System.out.println("Randomly choosing candidate for future population.");
		System.out.println("Selected.\n");
		return p;
	}

}


