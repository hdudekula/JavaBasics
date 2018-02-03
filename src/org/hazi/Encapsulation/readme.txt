-->Encapsulation is like binding the variables. If we dont want your variables to visible outside of your class then 
we go for encapsulation.

-->Let's say, in ChallengePrinter class, the class variables are Private so, if main class want to use then, it has to 
access them through getters but not through directly.

-->if we define the class variables as public then we can directly access the variables outside the class and even there
is a chance of misusing them. which means, if we make it public, ChallengePrinter class dont have any control over the 
variables which can be modified even outside of the class. 

-->another advantage of Encapsulation is, if we even change anything inside the ChallengePrinter class in this case, we 
dont need to change anything at caller class. that still call the challenge printer class with same methods. 