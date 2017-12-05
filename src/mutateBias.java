/**
 * This is one way to do mutation, which always picks the last 2 bits to mutate. 
 * It is a subclass of the Mutation interface.
 * @author Ian Dempsey
 *
 */
public class mutateBias implements Mutation{
	public mutateBias() {
		mutate();
	}
	
	public void mutate() {
		System.out.println("\nDoing biased mutation.");
		System.out.println("Selected the last bits to flip");
		System.out.println("Completed biased mutation.");
	}

}
