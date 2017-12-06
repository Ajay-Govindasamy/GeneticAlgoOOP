/**
 * This is one way to do mutation, which always picks the last 2 bits to mutate. 
 * It is a subclass of the Mutation interface.
 * It implements the mutation based on the population.
 * @author Ian Dempsey
 *
 */
public class MutateBias implements Mutation{
	public MutateBias(Population p) {
		mutate(p);
	}
	
	public Population mutate(Population p) {
		System.out.println("\nDoing biased mutation.");
		System.out.println("Selected the last bits to flip");
		System.out.println("Completed biased mutation.");
		return p;
	}

}
