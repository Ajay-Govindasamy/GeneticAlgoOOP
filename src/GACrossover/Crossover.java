package GACrossover;
import GAPopulation.Population;
/**
 * This is my interface. It is the super version of the different types of crossover: 1pt, 2pt.
 * This class will be extended by the subclasses and implement their own versions of this.
 * Some methods in here:
 *  doCrossover() : abstract method which implements the different types of crossover actually performed in each class
 * Think of some concrete things this class will do.
 * @author Ian Dempsey, 12383546
 * date: 15/11/17
 */
public interface Crossover {
	/**
	 * This class will perform the crossover. It is abstract so all other classes must do this method.
	 * @param p the Population to be worked on
	 * @return Population object
	 */
	abstract Population doCrossover(Population p);
}
