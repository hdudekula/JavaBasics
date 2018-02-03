-->There are totally 4 different problems for Arrays
		1)heteregeneous objects - we resolved it by using Object[]
		2)size issue - we developed resizable array in SriVidya.java class with increamentCapacity(). 
		3)different operations on array like replace, insert, retrieving - we developed in CustomCollectionDemo package.
		4)storage of objects in  different formats and different orders. 
		
--There are two different formats to store objects
		1)Array format
		2)table format
		
--Different orders to store objects (LIFO and FIFO are for retrieving order)
		1)Indexed order
		2)sorting order
		3)insertion order
		
		4)LIFO order
		5)FIFO order
		
-->Vector is the class used to define Array format and Hashtable is the class used to define table format.

-->from Java 1.0 perspective, there are two classes and one interface
	--Vector class
			--Vector class has one subclass, which is Stack. It is used to retrieve objects in LIFO order
	
		problems
		---------
		It has synchronization problem and shows less performance in single threaded application. 
		insert and remove operations give less performance
		It can't stop duplicate objects
		can't store objects in sorting order
	--Hashtable class
			--Hashtable class has one subclass, which is Properties. 
	
		problems
		--------
		It has synchnorization problem as vector class has.
		Can't store objects in sorting order
	--Enumeration Interface
	
		problems
		--------
		Methods names are large
		can't remove elements while retrieving.
		
-->Above all problems are addressed in Java 1.2 with other classes.
  Below classes to address the problems of vector class
	--ArrayList class
			-This class is used to address the synchronization problem and much beneficial in single threaded app.
			
	--LinkedList class
			-This class is used to address the performance issue while insertion and removal.
			
	--HashSet class
			-This class is used to stop the duplicate objects.
			
	--TreeSet class
			--This class allow us to store objects in sorting order

   Below classes to address the problems of HashTable class
   	--HashMap class
   			-This class is used to synchronization problem with less performance. 
   		
   	--TreeMap class
   			-This class is to store the objects in sorting order.
   			
   Below Interfaces to address the problems of Enumeration Interface
    --Iterator Interface
    --ListIterator Interface
    --Comparable Interface
    --Comparator Interface
    
 =========java 1.4===================
 
 -There are new classes added in Java 1.4 to address the issues of HashSet and HashMap. These two classes are having common
 problem, which is they can't maintain the insertion order. While inserting objects, insertion will be random. 
 
 -Above problem is addressed by :
 	-- LinkedHashSet class (it is a subclass of HashSet  class)
 	-- LinkedHashMap class (it is a subclass of hashMap class)
 	
 =========java 1.5==================
 
 -Queue class is introduced and it has many subclasses. 
 
 -java.util.concurrent package contains classes to provided synchronized high performance operations.
 
 --at language level, AutoBoxing and AutounBoxing is introduced
 						and, Generics also introduced. 
 						and also, for each loop is introduced for Iterator fast operations.
 						
 						
=======Java 1.6================

-NavigableSet class is introduced to add more functionalities for sorting objects. extension for TreeSet class. 

-NavigableMap class is introduced to add more functionalities for sorting objects. extension for TreeMap class.

=======Java 1.7==============

-TypeInference class is introduced to extend the generics functionalities. 

=======Java 1.8=============

--at language level, below topics are introduced to improve the collections framework.

		--FunctionalInterface
		--Lambda expresssions
		--Method reference
		--Stream API - it is further enhanced to filter the for each loop. 
  