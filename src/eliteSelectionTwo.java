/**
 * This class is a subclass of the interface Selection. It is a specific version of elite selection that is
 * implemented by the configTwo class. It is its own style of doing elite selection
 * They implement their version of the performSelection() method.
 * This is for configTwo class
 * @author Ian Dempsey, 12383546
 *
 */
public class eliteSelectionTwo implements Selection {
	/*
	 * The constructor which is called in the configTwo class will call the overwritten performSelection() method here.
	 * This could be done by say having class variables in Selection itself, i.e. name, status, etc. 
	 * But for simplicity I am just having print stmts here to it. 
	 */
	
	public eliteSelectionTwo() {
		performSelection();
	}
	/*
	 * This version of select is the elite version. This is where the candidates are sorted on their fitness level first.
	 * They are then chosen based on this. Candidates at the top have a higher chance of being picked.
	 * @see Selection#performSelection()
	 */
	public void performSelection() {
		// TODO Auto-generated method stub
		System.out.println("\nStarting the elite selection for configuration 2.");
		System.out.println("Sorting the candidates from Smallest to Biggest.");
		System.out.println("Choosing the best 3 candidates in this group.");
		System.out.println("3 Candidates selected\n");

	}
}
