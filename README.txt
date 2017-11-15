The basic idea of a GA is to:
1.Generate a population.
2.Select candidates of this population for the future generation via some style of selection using a fitness evaluator.
3.Selected candidates from 2 are then crossovered. This will result in some offspring. 
4.Some of the offspring are then mutated by flipping some bits etc. This allows for future generations to be different.
5.Repeat steps 2->4.


In my attempt to design some code aroud these core ideas of a GA. I have used some of the patterns learned throughout this CS613 class. 
In particular I have used the Singleton Pattern when I am generating the Population. 
I used the Factory Method whilst designing the Selection and Crossover parts of my code, and each of their subclasses take into account their roles in this style of pattern. 
I have employed the Strategy Method Pattern whilst designing the : 

To implement the Factory Method I have a GeneticFactory class which has a few abstract methods, namely selectionChoice, crossoverChoice. The subclasses of GeneticFactory are where the choices are made. And these subclasses, configOne and configTwo, will implement the different versions of Selection and Crossover relevant for their implementation.
Inside each of these config classes, I have the if else conditionals which will change the returned types of classes depending on the user input. These classes each have their own version of elite and roulette selection. They also have their own versions of the crossover methods onepoint and twopoint. Each version of these is aptly named with a One or Two at the end of the class names. Just for showing which one is called depending on the class they are called from. 

I have yet to do the Strategy Method. But I will look into this now over the next few days and try to implement it . 
I have the factory method & singleton pattern covered. As well with showing some info hiding/encapsulation. I will try to make sure I am doing Abstraction.(I believe I am )