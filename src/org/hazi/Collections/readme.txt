--> Collections definition from Oracle documentation:
	A collection — sometimes called a container — is simply an object that groups multiple elements into a single unit. 
	Collections are used to store, retrieve, manipulate, and communicate aggregate data. Typically, they represent data items that form a
	 natural group, such as a poker hand (a collection of cards), a mail folder (a collection of letters), 
	 or a telephone directory (a mapping of names to phone numbers). If you have used the Java programming language — or just about 
	 any other programming language — you are already familiar with collections.

-->The purpose of Collections is to store different types of values. Totally we have 4 different ways to store data : 
		1) using variables -- Limitation for it is, we can only store single value. 
		2) using class object -- Limitation for it is, we can store different data type values but with limited storage. 
		3)using Array object -- Limitation for it is, we can store only single data type values but with limited storage.
		4)Using Collections object 	-- There is no storage limit and we can store all data types. 
		
-->Collections Framework contains mainly three different classes. 
		1)Container class Objects -- It contains set/List/Queue/Map as these are used to store data. 
		2)Cursor class objects -- It contains Enumeration/Iterator/ListIterator as these are used to retrieve stored data.
		3)utility class objects -- It used to implement the above two classes and on how to implement the concepts like set/list/iterator etc.,
	 
-->Terminology used in Collections framework : 
		1)Element - An object stored in collection is called element.
		2)Entry - key, value pair in collection is called entry.
		3)homogeneous object - same class objects
		4)heterogeneous object - diff class objects
		5)unique object - two objects of same class with diff data and diff ref. By default, different class objects are unique objects.
		6)duplicate object - two objects of same class with same data or same ref. 
		7)Collection of object - Collection contains regular objects.
		8)Collection of Maps - A collection contains map (key, value pattern is called a map) objects. 
		9)Collection of collections - A collection contains other collection objects.
		10) capacity - Total number of objects can be stored in collection. 
		11) size - number of objects stored in collection. 
		12)default capacity - It is the initial capacity defined by collection.
		13)Incremental capacity - if the default capacity is filled, then default capacity value is doubled/incremented by half size and it is called incremental value.
		14)load factor - it is the measure which is used for incrementing the default capacity value. 
							if it is collection type, then load factor increments only when it reaches 100%.
							if it is map type, then load factor increments when it reaches 75%. 
							
-->Problem with Array object is:
		1)Type problem - we can only store same type of objects. but it can be addressed by using parent class (Object class)
		2)Size problem - Size can't be increased dynamically in array objects.
		3)Sorting problem - Array can only store data in insertion order and retrieve in order. we can't sort as per the requirement. 
		4)operational problem - We can't perform diff operations like replace/remove on array object. 
		
-->Different operations on Collections framework:

	1)Adding objects
	2)Counting objects
	3)searching objects
	4)retrieving objects
	5)removing objects
	
	6)replacing objects
	7)Inserting objects
	
-->There are totally 4 different collections available which are Set/List/Map/Queue. Above operationns(1-5) can be done on all types of collections.
 but replacing/inserting will only be done on List. Since, List is only index wised collection. 
-->Collections is a interface which can be used by any APIs and it is easy to maintain. 

-->Collections will be having set/List/Queue/Dequeue as it's child and we can implement all these under collections. even ArrayList and
LinkedList will fall under Collections framework.

-->Here in this example, we are implementing Comparible<> parameter type to get Seat Number.

-->And also, in Theatre class, we have replaced for each loop with binary search. binarySearch is a powerful method from Collections framework.
	and it executes and returns very quickly as compared with for each loop. 
	
-List Methods :-
------------------

--> We have different types of list methods as shown in ListMethodsMain program like min and max and also shuffle is one more method. other List
methods are also defined in ListMethods and ListMethodsMain classes.

--Comparable and Comparator :-
-----------------------------

--> Comparable and Comparator are two interfaces of Collections frame work. 

-->We use comparable to sort objects of natural order. Which means, object which is created on same/dependent class. compareTo() method 
will be used to define the parameter to be sorted. Comparable Interface will not allow us to compare different members of class.

--> Like, if we have Movie class and it has name, year it released and rating. Using Comparable interface, we can only sort any one of 
these attributes.

--> IF we need to sort the different members like sort by name, sort by year and sort by rating. Then we need to use Comparator. 

-->Comparator allow us to compare different objects by creating different classes for each attribute. compare() is the methods used to
compare the sort using Comparator. 