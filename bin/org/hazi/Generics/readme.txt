-->Java Generics used to avoid runtime errors by throwing error at compile time itself.  it enables the types to be parameters when defining
classes and interfaces. 

-->below piece of code is an example of without using Generics. 

The following code snippet without generics requires casting:
List list = new ArrayList();
list.add("hello");
String s = (String) list.get(0);

-->below code snippet is by using generics, which avoids casting. 

List<String> list = new ArrayList<String>();
list.add("hello");
String s = list.get(0);   // no cast

-->Stronger type checks at compile time.
A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.

-->Look at the class Team.java, there we could see the type parameter for class. 
			e.g: public class Team<T> or public class Team<T extends Player>
			
-->Extending is to set the boundaries. so that, Main will not allow other types and throw error at compile time itself. it strictly bound 
to use player class definitions. 

-->We can even use type parameters for Interfaces as well as classes. 