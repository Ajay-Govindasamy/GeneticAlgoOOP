/**
 * Tihs class is a subclass of the generic type Selection. It is a specific version of elite selection that is
 * implemented by the configOne class. It is its own style of doing elite selection
 * They implement their version of the performSelection() method.
 * @author Ian Dempsey, 12383546
 *
 */
public class eliteSelectionOne extends Selection {
	/*
	 * The constructor which is called in the configOne class will call the overwritten performSelection() method here.
	 * This could be done by say having class variables in Selection itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 */
	
	public eliteSelectionOne() {
		performSelection();
	}
	/*
	 * This version of select is the elite version. This is where the candidates are sorted on their fitness level first.
	 * They are then chosen based on this. Candidates at the top have a higher chance of being picked.
	 * @see Selection#performSelection()
	 */
	protected void performSelection() {
		// TODO Auto-generated method stub
		System.out.println("\nStarting the elite selection for configuration 1.");
		System.out.println("Sorting the candidates from Biggest to Smallest.");
		System.out.println("Choosing the best 10 candidates in this group.");
		System.out.println("10 Candidates selected\n");

	}
}
