--> Inner class is usually of 4 types. static nested inner class, non-static nested inner class, local class and anonymous class. 

-->if we want to call the inner class, then we should call it through parent class. Even the new instance for subclass to be created with 
instance of parent class. 

-->One more way is, make inner class as private and create methods inside the parent class which have access to inner class and make use of them 
outside. Refer Gearbox.java and Main.java examples. 

--> local classes are used inside the block, let's say if block.the scope of local class is only inside the block either method or if block.
it's very less oftenly used. 

-->Anonymous class has no names and can be used to call without any names and just by initializing it.

-->refer button class and buttonMain class for local and anonymous classes demo. 

-->In case of local class, we need to define another class and need to instantiate it in order to use it. It will become complex when 
you need to make number of calls. 

--> where in case of anonymous, we need not to create any separate class as we just need to instantiate the class whatever we  wanted to use.