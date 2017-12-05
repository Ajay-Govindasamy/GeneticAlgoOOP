/**
 * This is the abstract class for Selection. It has two subclasses; Elite Selection and Roulette Selection.
 * Some methods in here include: 
 * performSelection() -> abstract method, which will be defined in each subclass for the type of Selection they perform.
 * Think of some concrete things that this will do:
 * @author Ian Dempsey, 12383546
 *
 */
public abstract class Selection {
	/*
	 * This method will be fully defined in each subclass of Selection.
	 */
	protected abstract void performSelection();
}
