-->There are disadvantages of using synchronized keyword to acquire the lock. 
	--Synchronized block can't guarantee the lock to be acquired the long waiting thread. it cause thread starvation. 
	--Lock will be  released after the task executed on its own. it maintained by implicit locking. 
	
-->ReentrantLock class allows to lock the thread and release the lock for long waiting thread. Internally it acts as a Synchronization
but with more flexibility. 

-->We use explicitly unlock the thread after the condition being executed. 

-->As the name says, ReentrantLock allow threads to enter into lock on a resource more than once. When the thread first enters into 
lock, a hold count is set to one. Before unlocking the thread can re-enter into lock again and every time hold count is incremented 
by one. For every unlock request, hold count is decremented by one and when hold count is 0, the resource is unlocked.

Thread Pool:
-------------------

-->An object that executes submitted Runnable tasks. This interface provides a way of decoupling task submission from 
the mechanics of how each task will be run, including details of thread use, scheduling, etc. An Executor is normally used 
instead of explicitly creating threads. For example, rather than invoking new Thread(new(RunnableTask())).start() for each of a 
set of tasks, you might use:
 Executor executor = anExecutor;
 executor.execute(new RunnableTask1());
 executor.execute(new RunnableTask2());
 
 
 -->public interface ExecutorService
extends Executor
	An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more 
asynchronous tasks.
	An ExecutorService can be shut down, which will cause it to reject new tasks. Two different methods are provided for shutting down 
an ExecutorService. The shutdown() method will allow previously submitted tasks to execute before terminating, while the 
shutdownNow() method prevents waiting tasks from starting and attempts to stop currently executing tasks. Upon termination, an 
executor has no tasks actively executing, no tasks awaiting execution, and no new tasks can be submitted. 
	An unused ExecutorService should be shut down to allow reclamation of its resources.

	Method submit extends base method Executor.execute(java.lang.Runnable) by creating and returning a Future that can be used 
to cancel execution and/or wait for completion. Methods invokeAny and invokeAll perform the most commonly useful forms of bulk 
execution, executing a collection of tasks and then waiting for at least one, or all, to complete. 
(Class ExecutorCompletionService can be used to write customized variants of these methods.)

The Executors class provides factory methods for the executor services provided in this package.


ArrayblockingQueue:
----------------------

-->A bounded blocking queue backed by an array. This queue orders elements FIFO (first-in-first-out). The head of the queue is that element that has been on the queue the longest time. The tail of the queue is that element that has been on the queue the shortest time. New elements are inserted at the tail of the queue, and the queue retrieval operations obtain elements at the head of the queue.

-->This is a classic "bounded buffer", in which a fixed-sized array holds elements inserted by producers and extracted by consumers. Once created, the capacity cannot be changed. Attempts to put an element into a full queue will result in the operation blocking; attempts to take an element from an empty queue will similarly block.

-->This class supports an optional fairness policy for ordering waiting producer and consumer threads. By default, this ordering is not guaranteed. However, a queue constructed with fairness set to true grants threads access in FIFO order. Fairness generally decreases throughput but reduces variability and avoids starvation


FairLock and LiveLock:
-------------------------

-->A real-world example of livelock occurs when two people meet in a narrow corridor, and each tries to be polite by moving 
aside to let the other pass, but they end up swaying from side to side without making any progress because they both repeatedly 
move the same way at the same time.


-->https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/package-summary.html#package.description
	https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/atomic/AtomicInteger.html

refer above link for more details about the atomic operations. which is very helpful in avoiding usage synchronized usage. 
