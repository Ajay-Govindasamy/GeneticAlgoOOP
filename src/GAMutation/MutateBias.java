package GAMutation;
import GAPopulation.Population;
/**
 * This is one way to do mutation, which always picks the last 2 bits to mutate. 
 * It is a subclass of the Mutation interface.
 * It implements the mutation based on the population.
 * @author Ian Dempsey
 *
 */
public class MutateBias implements Mutation{
	/**
	 * This will call the actual mutate method on the population.
	 * @param p. This is the Population being worked on
	 */
	public MutateBias(Population p) {
		mutate(p);
	}
	/**
	 * This method performs the biased type of mutation, which is it occurs only 10% of the time.
	 * @param p The population to be worked on.
	 * @return Population
	 */
	public Population mutate(Population p) {
		System.out.println("\nDoing biased mutation.");
		System.out.println("Selected the last bits to flip");
		System.out.println("Completed biased mutation.");
		return p;
	}

}
