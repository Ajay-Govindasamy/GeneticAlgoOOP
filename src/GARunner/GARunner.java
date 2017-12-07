package GARunner;
import GAPopulation.Population;
import GAFactory.*;
/**
*
*This is the runner of my assignment. It will first create a SINGLE instance of my populaiton. 
*This is the Singleton pattern implementation area. 
*I have created the Factory to be GeneticFactory. This is the Abstract Factory Pattern. 
*I have one example here which implements a GeneticFactory by giving it a type of ConfigOne.
*This ConfigOne will take in the same input as the configTwo type, 
*but it will be able to decide at runtime which type of selection, crossover and mutation process to implement.
*I also pass in the population to everything when I call doProcess().
*I have a number of instances created here to show their different outputs. 
*In the case where a user inputs something which does not exist, I throw an throw new IllegalArgumentException.
*I also have used the getters inside of GeneticFactory to get the created classes.
*@author Ian Dempsey
*/

public class GARunner{
	public static void main(String...args) {
		//This will return an instance of the class.
		Population pop=Population.getInstance();
		//System.out.println(pop.hashCode());
		GeneticFactory config1 = new ConfigOne();
		System.out.println("\nDoing config1 of GA generation with elite selection and 1 point crossover.");
		Object style1 = config1.doProcess("elite",1,pop);
		//Population pop2 = Population.getInstance();
		//System.out.println(pop2.hashCode()); -> used for testing the Populations are equal.
		//This will get the crossover, selection and mutation that was created.
		System.out.println("\nCrossover performed:"+config1.getCrossover() + ", Selection performed:  "+config1.getSelection() + ", Mutation performed: " + config1.getMutation());
		System.out.println("\nDoing config1 of GA generation with roulette selection and 1 point crossover.");
		Object style2 =config1.doProcess("roulette", 2,pop);
		System.out.println(config1.getCrossover());//This will get the crossover that was created.
		
		//System.out.println("\nDoing config1 of GA generation with roulette selection and 2 point crossover.");
		//Object style3 =config1.doProcess("roulette", 2,pop);
		
		//Example of config2 running.
		//System.out.println("\nNow doing config2 style of selection and crossover.");
		//GeneticFactory config2 = new 	ConfigTwo();
		//System.out.println("\nDoing config2 of GA generation with elite selection and 1 point crossover.");
		//Object style4 = config2.doProcess("elite",1,pop);
	}
	
}
