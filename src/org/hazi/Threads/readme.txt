-->An application can be called as a process and a process can be run on multiple threads.

-->Thread is nothing but a execution of piece of process. 

-->In order to use thread, we need to extend the Thread class and then we can create instance for its sub classes
by calling subclass.start(). start() method will initiate the new thread. 

-->Two ways to start/initiate a thread. by extending the Thread class or by implementing the Runnable interface. 

-->We can set thread to sleep for given time using thread.sleep(millisec). 

-->if thread A is waiting to fetch data and thread B wants to do some operations with that data. Then Thread B needs
to wait till the Thread A finishes it's fetching. In that case, we can join Thread B to Thread A so that, Thread B
will only be initiated once the Thread A finishes its job. 

-->We can also set timeout for joins. 