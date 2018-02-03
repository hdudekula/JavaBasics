-->equals() and hashCode() are two methods to be used to address the duplicates in sets. 

-->As we know, Sets will not allow duplicates. but, if the references of the same objects is different then sets allow two
objects with the same name. This is because, references are different. 

-->hashCode() will generate the same hashCode for similar names of the objects. and equals() will compare the two objects names
including the hashCode values. Hence, it is mandatory to override equals() and hashCode() to address duplicates issue. 