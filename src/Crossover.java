/**
 * This is my abstract class. It is the generic version of the different types of crossover: 1pt, 2pt.
 * This class will be extended by the subclasses and implement their own versions of this.
 * Some methods in here:
 *  doCrossover() -> abstract method which implements the different types of crossover actually performed in each class
 * Think of some concrete things this class will do.
 * @author Ian Dempsey, 12383546
 * date: 15/11/17
 */
public abstract class Crossover {
	/**
	 * This class will perform the crossover. It is abstract so all other classes must do this method.
	 */
	protected abstract void doCrossover();
}
