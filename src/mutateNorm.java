/**
 * This is one way to do mutation, which is just pure random. It is a subclass of the Mutation abstract class.
 * @author Ian Dempsey
 *
 */
public class mutateNorm extends Mutation {
	
	public mutateNorm() {
		mutate();
	}
	
	public void mutate() {
		System.out.println("\nPerforming normal mutate.");
		System.out.println("Selected the bits to flip.");
		System.out.println("Done mutation.");
	}

}
