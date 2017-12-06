The basic idea of a GA is to:
1.Generate a population.
2.Select candidates of this population for the future generation via some style of selection using a fitness evaluator.
3.Selected candidates from 2 are then crossovered. This will result in some offspring. 
4.Some of the offspring are then mutated by flipping some bits etc. This allows for future generations to be different.
5.Repeat steps 2->4.


In my attempt to design some code around these core ideas of a GA. I have used some of the patterns learned throughout this CS613 class. 
In particular I have used the Singleton Pattern when I am generating the Population. 
I used the Abstract Factory Method whilst designing the GeneticFactory and the two subclasses ConfigOne, ConfigTwo. 
I have employed the Strategy Method Pattern whilst designing the Factory Method. This is the subsection where the Selection, Crossover and Mutation abstract classes are used with their subclasses. 

To implement the Factory Method with the GeneticFactory class which has a few abstract methods, namely selectionChoice, crossoverChoice and mutationChance. The subclasses of GeneticFactory are where the choices are made. And these subclasses, ConfigOne and ConfigTwo, will implement the different versions of Selection and Crossover relevant for their implementation. Mutation will happen based off of the random() method returning the value to call it. 

Inside each of these config classes, I have the if else conditionals which will change the returned types of classes depending on the user input. These classes each have their own version of elite and roulette selection. They also have their own versions of the crossover methods onepoint and twopoint. Each version of these is aptly named with a One or Two at the end of the class names. Just for showing which one is called depending on the class they are called from. 
Mutation is different in each class, and has the 1 in 10 chance of being called so it is random. 
 
As well with showing some info hiding/encapsulation.
I have polymorphism employed (shown in GARunner with: GeneticFactory config1 = new ConfigOne();)
I am using exisiting libraries -> Example with Map in Population. 
Multiple-file is being done. I have classes and subclasses implemented. 
Generics used with the Map inside Population. I also have a comment on how it could be made Generic with my own Generics( i.e <T>)
Mutation is done. I have two styles of mutation which can be called by the configs. Each config class can only call 1 style of mutation. This is because I only want the classes to have the chance to mutate in one style. If they could do both styles that would mean they would have a higher chance to mutate, one way or the other.
I have also got the relevant areas in packages. This means I have to import all the relevant files from the other packages. 
Abstraction is performed throughout by making each module of the program (each class) perform it's own distinct duty. 
I have done my best to reuse code constantly and allow this to support the Open-Close Principle. 
Each of the subclasses from Selection,Crossover and Mutation take in and return the Population. This is to allow the user when they input the actual logic of these areas to be able to work on the data from the Population itself. 


NOTE: My github link for this project is: https://github.com/Demostroyer/GeneticAlgoOOP. It has all of the different versions of the project that I created.