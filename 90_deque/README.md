Team A Random Word (Nina Jiang, Orion Roven, Ivina Wang )

APCS pd7

HW91-- Deque the Halls

2022-04-14r

time spent: 1.0 hrs

### Possible methods:
* offerFirst(), offerLast()
* pollFirst(), pollLast()
* getFirst(), getLast()
* removeFirstOccurrence(), removeLastOccurrence()
* contains()
* pop()
* push()
* iterator(), descendingIterator()

### Implemented:
* addFirst(), addLast()
* peekFirst(), peekLast()
* removeFirst(), removeLast()
* isEmpty()
* size()

We import LinkedList and use its methods to implement adding and removing for Deque.
Similar to what we did in the homework last night for ALQueue and LLQueue.
We decided not to implement the methods in the Not implementing section because many of them were repetetive.
For example getFirst() is only different from peekFirst() in that it returns null if the LinkedList is empty.
We are not sure how to implement pop() and push() because they are used for stacks and we are using a linked list
