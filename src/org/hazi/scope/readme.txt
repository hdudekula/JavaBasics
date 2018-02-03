-->Refer ScopeDemo and ScopeDemoMain classes as explanation provided on top of the lines.

-->X class is the challenge class where we used x for variables, methods and class as well to better understand of scope.

-->There are 4 types of access modifiers:
	* Public : The class/class variables(or fields)/methods which are defined as public are accessible in all over the current package
				and also available to outside of the packages.
		
	* Package-private(or Default) : if we dont specify any access specifier, which means it is a package-private and it is accessible/visible
									only inside the current package. not accessible to outside packages.
									
	* private : if we specify any method/field as private, it is only visible to that class and not accessible to other classes of the same
				package. We can't specify top class/interfaces as private. They should either be public or package-private.
				
	* protected : if we specify any method/variables as protected, it is accessible to the current package and also visible to subclasses 
				 of other packages as well.
				 
-->Static member belongs to class and it will not have any reference to instance of a class. you can specify static variables and static methods.

-->If we define static variable, then it will not load every time to memory whenever object is created. but non-static variables load 
every time to memory whenever object is called. 

-->We can't call non-static members from a static method as static methods will not have any reference to objects.

-->final keyword: If we specify any variable as final, then we can't change the value until unless we specify it as non-static. if
it is non-static final, then every time a instance is created then a new value will be assigned.

-->That is the reason for constant values, we specify static final. like PI value in Math class is private static value double. 