/**
 * This is the interface for Selection. It has two subclasses; Elite Selection and Roulette Selection.
 * Some methods in here include: 
 * performSelection() : abstract method, which will be defined in each subclass for the type of Selection they perform
 * @author Ian Dempsey, 12383546
 *
 */
public interface Selection {
	/**
	 *This method will be fully defined in each subclass of Selection. 
	 * @param pop the Population to be worked on.
	 * @return Population object
	 */
	abstract Population performSelection(Population pop);
}
