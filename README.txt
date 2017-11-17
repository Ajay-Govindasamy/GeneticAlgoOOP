The basic idea of a GA is to:
1.Generate a population.
2.Select candidates of this population for the future generation via some style of selection using a fitness evaluator.
3.Selected candidates from 2 are then crossovered. This will result in some offspring. 
4.Some of the offspring are then mutated by flipping some bits etc. This allows for future generations to be different.
5.Repeat steps 2->4.


In my attempt to design some code aroud these core ideas of a GA. I have used some of the patterns learned throughout this CS613 class. 
In particular I have used the Singleton Pattern when I am generating the Population. 
I used the Factory Method whilst designing the Selection and Crossover parts of my code, and each of their subclasses take into account their roles in this style of pattern. 
I have employed the Strategy Method Pattern whilst designing the: Factroy Method I believe. This is the subsection where the Selection, Crossover and Mutation abstract classes are used with their subclasses. 

To implement the Factory Method I have a GeneticFactory class which has a few abstract methods, namely selectionChoice, crossoverChoice. The subclasses of GeneticFactory are where the choices are made. And these subclasses, configOne and configTwo, will implement the different versions of Selection and Crossover relevant for their implementation.
Inside each of these config classes, I have the if else conditionals which will change the returned types of classes depending on the user input. These classes each have their own version of elite and roulette selection. They also have their own versions of the crossover methods onepoint and twopoint. Each version of these is aptly named with a One or Two at the end of the class names. Just for showing which one is called depending on the class they are called from. 

 
I have the factory method & singleton pattern covered. As well with showing some info hiding/encapsulation. I will try to make sure I am doing Abstraction.(I believe I am )
I have polymorphism employed (shown in GARunner with: GeneticFactory config1 = new configOne();)
I am using exisiting libraries -> Example with Map in Population. 
Multiple-file is being done. I have classes and subclasses implemented. 
Generics used with the Object style1 = config1.doProcess(...);
Mutation is done. I have two styles of mutation which can be called by the configs. Each config class can only call 1 style of mutation. This is because I only want the classes to have the chance to mutate in one style. If they could do both styles that would mean they would have a higher chance to mutate, one way or the other.

Next:
Check if this is done with the Factory Method above. I have yet to do the Strategy Method. But I will look into this now over the next few days and try to implement it.
Add in some concrete method/varibales into Selection & Crossover classes. Just to be able to show I understand how they can be useful. -> This might not need to be done if I ma using interfaces instead of Abstract classes for them. 