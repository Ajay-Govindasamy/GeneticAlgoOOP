/**
 * This class is the subclass of Crossover. It implements the method doCrossover().
 * It also has access to the superclass version of methods. Or to overwrite them and do their own.
 * This is the one point version of the crossover class that is specific for the configOne class.
 * @author Ian Dempsey, 12383546
 *
 */
public class OnePointCrossoverOne implements Crossover {
	/*
	 * The constructor which is called in the configOne class will call the overwritten doCrossover() method here.
	 * This could be done by say having class variables in Crossover itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 */
	public OnePointCrossoverOne(Population p) {
		doCrossover(p);
	}
	/**
	 * This performs doCrossover() for ConfigOne and does OnePoint style.
	 * @param Population p
	 * @return Population
	 */
	 public Population doCrossover(Population p) {
		// TODO Auto-generated method stub
		System.out.println("Performing 1 point crossover for config1's selection population.");
		System.out.println("Selecting bits to crossover.");
		System.out.println("Completed.");
		return p;
	 }
}