/**
*
*This is the runner of my assignment. It will first create a SINGLE instance of my populaiton. 
*This is the Singleton pattern implementation area. 
*I have created the Factory to be GeneticFactory. 
*I have one example here which implements a GeneticFactory by giving it a type of configOne.
*This configOne will take in the same input as the configTwo type, BUT it will be able to decide at runtime which
*type of selection and crossover process to implement.
*
*
*/

public class GARunner{
	public static void main(String...args) {
		//this will return an instance of the class.
		//Population pop=Population.getInstance();
		GeneticFactory config1 = new configOne();
		System.out.println("\nDoing config1 of GA generation with elite selection and 1 point crossover.");
		Object style1 = config1.doProcess("elite",1);
		//System.out.println("\nDoing config1 of GA generation with roulette selection and 1 point crossover.");
		//Object style2 =config1.doProcess("roulette", 1);
		//System.out.println("\nDoing config1 of GA generation with roulette selection and 2 point crossover.");
		//Object style3 =config1.doProcess("roulette", 2);
		//System.out.println("\nNow doing config2 style of selection and crossover.");
		//GeneticFactory config2 = new configTwo();
		//System.out.println("\nDoing config2 of GA generation with elite selection and 1 point crossover.");
		//Object style4 = config2.doProcess("elite",1);
		//System.out.print(style4.toString());//-> this give a NullPointerException. Wonder if I can catch it.Later
	
	}
	
}
