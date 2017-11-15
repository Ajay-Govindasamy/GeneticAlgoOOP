/**
 * This class is the subclass of Crossover. It implements the method doCrossover().
 * It also has access to the superclass version of methods. Or to overwrite them and do their own.
 * This is the 2 point crossover version of a crossover that is specific for the configOne class
 * @author Ian Dempsey, 12383546
 *
 */
public class twoPointCrossoverOne extends Crossover {
	public twoPointCrossoverOne() {
		doCrossover();
	}
	
	public void doCrossover() {
		// TODO Auto-generated method stub
		System.out.println("Performing 2 point crossover for configOne class");
		System.out.println("Selecting bits to crossover");
		System.out.println("Completed");
	}

}
