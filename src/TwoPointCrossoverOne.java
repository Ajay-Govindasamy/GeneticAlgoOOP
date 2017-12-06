/**
 * This class is the subclass of Crossover. It implements the method doCrossover().
 * It also has access to the superclass version of methods. Or to overwrite them and do their own.
 * This is the 2 point crossover version of a crossover that is specific for the configOne class
 * @author Ian Dempsey, 12383546
 *
 */
public class TwoPointCrossoverOne implements Crossover {
	/*
	 * The constructor which is called in the configOne class will call the overwritten doCrossover() method here.
	 * This could be done by say having class variables in Crossover itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 */
	public TwoPointCrossoverOne(Population p) {
		doCrossover(p);
	}
	
	public Population doCrossover(Population p) {
		// TODO Auto-generated method stub
		System.out.println("Performing 2 point crossover for configOne class");
		System.out.println("Selecting bits to crossover");
		System.out.println("Completed");
		return p;
	}

}
