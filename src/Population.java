import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
*This is my Population class. It employs the Singleton Pattern. 
*The reason I use this pattern here is so that I only have 1 instance of my population. 
*This allows for better concurrency across my program, as every class is working on the same population. 
*This allows for my program to be working on the same data. 
*The generics are shown inside this class by having the Map. 
*Further option to have Generics used is by having generatePopulation() be able to generate anytype of Map.
*This would allow the user to generate a Population of [?,?], i.e. [String,String], [Integer,Character], etc.
*@author: Ian Dempsey, 12383546
*date 10/11/17
*/

public class Population{
	//This is the eagerly created implementation of the class. It is thread-safe 
	private static Population uniquePop = new Population();
	private static Map<Character,String> pop = new LinkedHashMap<Character,String>();
	//my private constructor. It can not be envoked by another class
	private Population(){
		pop=generatePopulation();//pop is then instantiated with some population
		toString();//test it works
	}
	//the getInstance() method allows only 1 instance of my population to be created.
	public static Population getInstance(){
		return uniquePop;
	}
	
	/**
	 * This method will generate the population of the private global variable pop.
	 * Declared as private for encapsulation and information hiding purposes.
	 * @return a Map which has the generated population
	 */
	private Map<Character,String> generatePopulation(){
		//the generated one to return
		Map<Character,String> genPop = new LinkedHashMap<Character,String>();
		//Generates a population with keys a the alphabet, and their respective binary numbers.
		for(int i =1; i < 27;i++) {
			genPop.put((char)(i+64), Integer.toBinaryString(i));
		}
		
		return genPop;
	}
	/**
	 * This method will just print out the population, it was used whilst testing this code.
	 */
	public String toString() {
		Set<Character> setPop = pop.keySet();//keys are characters
		Iterator<Character> iterator = setPop.iterator();//get the iterator
		while(iterator.hasNext()) {//whilst something inside the population
			Character letter = iterator.next();//get the letter(key)
			String binary = pop.get(letter);//get the associated value with this key
			System.out.println(letter + " : " + binary);
		}
		
		return "";
		
	}
	
}