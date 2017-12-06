package GAMutation;
import GAPopulation.Population;
/**
 * This class will be used to perform the mutation. 
 * The mutate method will be implemented by every subclass.
 * It takes in a population and returns it.
 * @author Ian Dempsey
 *
 */
public interface  Mutation {
	/**
	 * This method will be defined by all subclasses. 
	 * @param p is the Population.
	 * @return Population
	 */
	public abstract Population mutate(Population p);
}
