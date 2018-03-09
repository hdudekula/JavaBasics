-->there are different ways to read/write data to a file using java IO operations. 

-->FileWriter/FileReader can be used to write to a file/read from a file. Along with this, if we use BufferedReader or
BufferedWriter then it allows a quick read/write operations. 

-->Byte Streams is another way of writing or reading data to/from a file. The data will be stored in a file in byte
format. which means, it will be less human readable. 

-->Another way is, reading or writing data to/from  a file using Object IO. With the use of Object, we need not to
specify any type like Int, UTF as it allows any kind of data just by readObject/writeObject methods. 

-->Serialization/DeSerialization:
	The process of converting data to a object and storing in byte format is called Serialization.
	The process of retrieving data from object and converting to readable format is called DeSerialization.
	-->In order to use serilization, one must specify serialVersionID which should be long. JVM verify for the
	serialVerisionID while performing Serialization/Deserialization operation. If it doesn't match then system will
	throw invalidClass exception. 