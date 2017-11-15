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

