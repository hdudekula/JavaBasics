-->RandomAccessFile allow us to write/read at random locations. Let's say, if you want to write starting from
100th byte then it is possible through RandomAccessFile.

-->It also allows to write synchronously using "rwd". here, r-read, w-write, d- synchronous. 

-->We can't write objects to file using RandomAccessFile. we must specify, writeInt/readInt, writeUTF/readUTF in order
read or write. 

-->The access to RandomAccessFile is faster than other IOOperations like Data Streams/Byte Streams as they only read/write
sequentially. 

-->We can load the data to memory and can access through RandomAccessFile whenever we need instead of reading from
disk directly. As we know, reading from disk is always cause performance issues. 