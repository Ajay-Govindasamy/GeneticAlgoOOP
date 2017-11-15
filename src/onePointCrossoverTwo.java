/**
 * This class is the subclass of Crossover. It implements the method doCrossover().
 * It also has access to the superclass version of methods. Or to overwrite them and do their own.
 * This is the one point version of the crossover class that is specific for the configTwo class.
 * @author Ian Dempsey, 12383546
 *
 */
public class onePointCrossoverTwo extends Crossover {
	/*
	 * The constructor which is called in the configTwo class will call the overwritten doCrossover() method here.
	 * This could be done by say having class variables in Crossover itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 */
	public onePointCrossoverTwo() {
		doCrossover();
	}
	
	public void doCrossover() {
		// TODO Auto-generated method stub
		System.out.println("Performing 1 point crossover for configTwo's selection popualtion.");
		System.out.println("Selecting bits to crossover.");
		System.out.println("Completed for configTwo.");
	}

}
