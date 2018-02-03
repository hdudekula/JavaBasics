-->since ArrayList only accepts classes as arguments. Java provides functionality of auto boxing and unboxing. In this concept, we have
classes like Integer, Double...to use them in arrayList<>. 

--> class.valueof(index) is to autobox and which internally converts the given integer values to object wrapper classes. 

--> reference.intValue(index) is to unbox and which converts the object wrapper classes back to integer value. 

-->Converting a primitive value (an int, for example) into an object of the corresponding wrapper class (Integer) is called autoboxing. The Java compiler applies autoboxing when a primitive value is:

Passed as a parameter to a method that expects an object of the corresponding wrapper class.
Assigned to a variable of the corresponding wrapper class.

-->Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing. The Java compiler applies unboxing when an object of a wrapper class is:

Passed as a parameter to a method that expects a value of the corresponding primitive type.
Assigned to a variable of the corresponding primitive type.