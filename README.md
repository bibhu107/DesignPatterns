# **System Design Guide**
## Table of Contents
* [Java Basics](https://github.com/bibhu107/DesignPatterns#java-basics)
* [OOPS Concepts Basics](https://github.com/bibhu107/DesignPatterns#OOPS-basics)
* [Operating System]()
* [Low Level Design ](https://github.com/bibhu107/DesignPatterns#Low-level-design)
  * [Do's and Dont's](https://github.com/bibhu107/DesignPatterns#Do's-and-Dont's)
  * [Low level desgin Principle]((#Low Level Design Principles]))
    * Creational Pattern
      * Builder Pattern
    * Structural pattern
      * Adapter pattern
    * Behavioral pattern
      * Template method pattern
  * [LLD Questions](#Low Level design Question])
    * Parking lot problem
    * Design tick-tock
    * Design sudoku

* [High level Design](#Low Level Design Principles])
  * [High level Desgin Principle]((#Low Level Design Principles]))
    * Functional vs NonFuctional requirements
    * Rate limiter
    * Load balancer
    * Scaling
    * Sharding
    * Horizontal scalling
    * Consistency
    * CAP Theorem
    * CDN
    * TCP vs UDP
    * Rest APIs
    * DNS
    * Security
    * Data Loss and data corruption
    * Read : Write Ration
    * Caching
      * Thundering Heard problem
      * Distributed caching
    * Databases
      * For Transactional
      * For Analyitcal
      * Partitioning the data
    * Paritioning
    * Auto Scaling & Replication
      * Handling Spiky traffic
    * Consensus algorithm
    * Availability
    * SQL vs No-SQL
    * Consistent Hashing
    * Search Engines
    * Web Crawling
    * Storage Schemas
    * Brokers - SQS, Firehose etc
    * Privacy
    * Security
    * Potential Attacks 
      * In Network
      * On Red Data
    * Testing scenarios
      * Load test
      * Integration tests
      * Stress the system
      * Covering edge cases
    * Time Created and Time Updated row
    * Error Handling mechansims
    
      
  * [HLD Questions](#Low Level design Question])
    * Design Youtube
    * Design Whatsap
    * Design Instagram
    * Design NewsFeed
    * Design Netflix

## Java Basics
1. [Abstract Class](https://www.javatpoint.com/abstract-class-in-java) :
   1. An abstract class in Java is one that is declared with the abstract keyword. It may have both abstract and non-abstract methods(methods with bodies).
   2. `abstract class Shape { int color;
// An abstract function
abstract void draw();
}`
   3. What is a abstract function :
      1. An abstract function has no implementation and must be in an abstract class. It can only be declared. This forces the derived class to provide the implementation of it. 
      2. An abstract member is implicitly virtual. The abstract can be called as pure virtual in some of the languages.
      3. An Abstract Method must have to implement in the child class

   4. An instance of an abstract class can not be created.
   5. If a class contains at least one abstract method then compulsory should declare a class as abstract


## OOPS basics
[Basics]
(https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
    1. Object , Class, Inheritance, Polymorphism, Abstraction, Encapsulation
    2. Polymorphisim
    3. Method Overloading
    4. Method overwriting

Questions on OOPS

## Operating System
### Multi threading System coding quesitons
* Write a Java program that creates two threads. One thread prints even numbers from 0 to 10, and the other thread prints odd numbers from 1 to 9. Ensure that the output is in order.
* 
* Write a Java program that simulates a race between two threads. Each thread increments a shared counter variable 100 times. Use synchronization to ensure that the counter is incremented correctly.
* 
* Write a Java program that simulates a bank account. The account has a balance and supports two operations: deposit and withdraw. Multiple threads can access the account concurrently, but the balance should never be negative. Use synchronization to ensure that the account is accessed correctly.
* 
* Write a Java program that simulates a producer-consumer scenario using a shared queue. The producer thread adds items to the queue, and the consumer thread removes items from the queue. Use synchronization to ensure that the queue is accessed correctly.
* 
* Write a Java program that simulates a dining philosophers problem. Five philosophers sit at a table and each philosopher alternates between thinking and eating. Each philosopher needs two forks to eat, and the forks are shared resources. Use synchronization to ensure that the forks are accessed correctly.
* 
* Write a Java program that creates a thread pool with a fixed number of threads. The program should accept a list of tasks and execute them concurrently using the thread pool.
* 
* Write a Java program that simulates a traffic intersection. Cars approach the intersection from four directions and can either go straight, turn left, or turn right. Use synchronization to ensure that the cars do not collide.
* 
* Write a Java program that simulates a deadlock scenario. Two threads each acquire a lock on a resource that the other thread needs to proceed. Use synchronization to avoid the deadlock.
* 
* Write a Java program that implements a reader-writer lock. Multiple threads can read a shared resource simultaneously, but only one thread can write to the resource at a time. Use synchronization to ensure that the lock is acquired and released correctly.
* 
* Write a Java program that implements a bounded buffer using semaphores. The buffer has a fixed size and can hold a certain number of items. The producer thread adds items to the buffer, and the consumer thread removes items from the buffer. Use semaphores to ensure that the buffer is accessed correctly.
* 
* 
* 
* 
* 
* Write a Java program that simulates a message queue. Multiple threads can add messages to the queue, and multiple threads can remove messages from the queue. Use synchronization to ensure that the queue is accessed correctly.
* 
* Write a Java program that implements a thread-safe singleton class. The class should have a private constructor and a getInstance() method that returns the single instance of the class. Use synchronization to ensure that the instance is created and returned correctly.
* 
* Write a Java program that simulates a game of tic-tac-toe. Two players take turns placing Xs and Os on a 3x3 grid. Use synchronization to ensure that the players take turns correctly and that the grid is updated correctly.
* 
* Write a Java program that simulates a thread pool with dynamic resizing. The program should accept a list of tasks and execute them concurrently using the thread pool. The pool should resize itself dynamically based on the workload.
* 
* Write a Java program that simulates a counting semaphore. Multiple threads can acquire and release the semaphore, and the semaphore should block threads if the maximum count is reached. Use synchronization to ensure that the semaphore is accessed correctly.
* 
* Write a Java program that simulates a file server. Multiple clients can request files from the server, and the server should return the files if they exist. Use synchronization to ensure that the files are accessed correctly.
* 
* Write a Java program that simulates a web server. Multiple clients can request web pages from the server, and the server should return the pages if they exist. Use synchronization to ensure that the pages are accessed correctly.
* 
* Write a Java program that simulates a database connection pool. The program should accept requests for database connections and return connections to the pool when they are no longer needed. Use synchronization to ensure that the connections are accessed correctly.
* 
* Write a Java program that simulates a thread-safe queue. The queue should support multiple producers and multiple consumers, and it should block producers if the queue is full and block consumers if the queue is empty. Use synchronization to ensure that the queue is accessed correctly.
* 
* Write a Java program that simulates a thread-safe map. The map should support multiple threads adding and removing entries, and it should ensure that each key is unique. Use synchronization to ensure that the map is accessed correctly.
* 
* Write a Java program that simulates a thread-safe stack. The stack should support multiple threads pushing and popping items, and it should block threads if the stack is empty or full. Use synchronization to ensure that the stack is accessed correctly.
* 
* Write a Java program that simulates a thread-safe set. The set should support multiple threads adding and removing items, and it should ensure that each item is unique. Use synchronization to ensure that the set is accessed correctly.
* 
* Write a Java program that simulates a thread-safe counter. The counter should support multiple threads incrementing and decrementing the value, and it should ensure that the value never goes below zero. Use synchronization to ensure that the counter is accessed correctly.
* 
* Write a Java program that simulates a thread-safe log. The log should support multiple threads adding entries, and it should ensure that the entries are written to disk in the correct order. Use synchronization to ensure that the log is accessed correctly.
* 
* Write a Java program that simulates a thread-safe cache. The cache should support multiple threads adding and removing items, and it should ensure that the cache is not overfilled. Use synchronization to ensure that the cache is accessed correctly.
* 
* Write a Java program that simulates a thread-safe message bus. The bus should support multiple publishers and multiple subscribers, and it should ensure that messages are delivered

* Write a program to demonstrate the usage of the synchronized keyword.
* Implement a simple chat application using multithreading and sockets.
* Write a program to simulate a race between multiple runners, each represented by a separate thread.
* Implement a program to demonstrate the usage of the Semaphore class in Java.
* Write a program to demonstrate the usage of the ReentrantLock class in Java.
* Implement a program to demonstrate the usage of the CyclicBarrier class in Java.
* Write a program to demonstrate the usage of the Phaser class in Java.
* Implement a program to demonstrate the usage of the CompletableFuture class in Java.
* Write a program to demonstrate the usage of the Executor framework in Java.
* Implement a program to demonstrate the usage of the Callable interface in Java.
* Write a program to demonstrate the usage of the Runnable interface in Java.
* Implement a program to demonstrate the usage of the CountDownLatch class in Java.
* Write a program to demonstrate the usage of the ConcurrentHashMap class in Java.
* Implement a program to demonstrate the usage of the CopyOnWriteArrayList class in Java.
* Write a program to demonstrate the usage of the BlockingQueue interface in Java.
* 
* 

---



## Low level design

### **Do's and Dont's**
`Dont's`
* Don’t unnecessarily add functionalities unless its needed
* Don’t repeat code, re-use code to most, duplicate

`Do's`
* Always follow ``SOLID`` guidelines:
    1. Single - responsibility Principle
        1. A class should have one and only one reason to change, meaning that a class should have only one job.
    2. O - Open-closed Principle
        1. Objects or entities should be open for extension but closed for modification.
        2. This means that a class should be extendable without modifying the class itself.
    3. L - Liskov Substitution Principle - This means that every subclass or derived class should be substitutable for their base or parent class.
    4. I - Interface Segregation Principle - A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
    5. D - Dependency Inversion Principle - Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.
* Whenever there is an opportunity to make something immutable make it immutable
* Keep things simple and more readable. People reading code should enjoy reading.
* Method Overloading can be chosen instead of complex adapter design pattern if the use cases are small. 


### **Design Patterns** 

#### **[Creational patterns](https://sourcemaking.com/design_patterns/creational_patterns)**
Creational design patterns solve this problem by somehow controlling this object creation.
Creational patterns are below: 

##### 1. **Factory Pattern**
##### 2. **[Abstract Factory Pattern](https://sourcemaking.com/design_patterns/abstract_factory)**
##### 3. **Singelton pattern Pattern**
##### 4. **[Builer Pattern](https://sourcemaking.com/design_patterns/builder)**
##### 4. **[Prototype Pattern](https://www.tutorialspoint.com/design_pattern/prototype_pattern.htm)**
        Prototype pattern refers to creating duplicate object while keeping performance in mind. 
    This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
    This pattern involves implementing a prototype interface which tells to create a clone of the current object. This pattern is used when creation of object directly is costly. For example, an object is to be created after a costly database operation. We can cache the object, returns its clone on next request and update the database as and when needed thus reducing database calls.

        



##### 6. **Template Method Pattern**
##### 7. **Iterator Pattern**
##### 8. **State Pattern**
##### 9. **Null Object Pattern**


2. Abstract factory pattern - https://sourcemaking.com/design_patterns/abstract_factory
3. Singelton pattern 
4. Structural pattern 
5. Observer pattern 
6. Template method pattern 
7. Iterator pattern 
8. State pattern 
9. Null object pattern 
10. Builer pattern - https://sourcemaking.com/design_patterns/builder


#### **[Structural patterns](https://sourcemaking.com/design_patterns/structural_patterns)**

##### 1. **Facade Design pattern**

        1. Abstracting out complexities for a client , letting client to just use the function and hiding how internally we interact with multiple classes
        2. Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.
        3. This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
        4. Implementation
        5. We are going to create a Shape interface and concrete classes implementing the Shape interface. A facade class ShapeMaker is defined as a next step.
        6. ShapeMaker class uses the concrete classes to delegate user calls to these classes. FacadePatternDemo, our demo class, will use ShapeMaker class to show the results.


##### 2. Decorator pattern

        1. Wrapping an interface with a more extensible interface.
            1. Beverage is an interface which can be implemented with Tea coffee but it also needs many other things lika caramel, cream etc those things can be extended with a decorator class
        2. Decorator class has to be Abstract
            1. We shouldn’t create direct objects for decorator class
            2. A decorator is a component and also has a component
        3. Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
        4. This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.
        5. We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.

##### 3. Composite pattern

        1. A hierarchical structure, like parent and children and every child can be a parent
        2. Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This type of design pattern comes under structural pattern as this pattern creates a tree structure of group of objects.
        3. This pattern creates a class that contains group of its own objects. This class provides ways to modify its group of same objects.
        4. We are demonstrating use of composite pattern via following example in which we will show employees hierarchy of an organisation.

##### 2. Flyweight pattern

        1. Returning and reusing similar objects instead of creating new object everytime
        2. Use sharing to support large numbers of fine-grained objects efficiently.
        3. Flyweight pattern optimizes RAM usage, The flyweight structual pattern essentially removes duplication of objects needed to achieve a certain goal.
        4. Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application
        5. Difference between singelton and flyweight pattern
            1. Flyweight is when you have many different kinds of a single thing.
            2. Singleton is when you have a single thing.
            3. Collection of Objects vs Single Objects
        6. Don't forget that singleton is a creational pattern, while flyweight is a structural pattern. Hence, the goal of the two patterns is completely different
    
##### 2. Bridge pattern

![alt text](Documentation/ExampleDiagrams/bridgePattern.png)
    Implementation of bridge pattern
    Advantages
    Bridge pattern decouple an abstraction from its implementation so that the two can vary independently.It is used mainly for implementing platform independence features.
      1. It adds one more method level redirection to achieve the objective.
      2. Publish abstraction interface in a separate inheritance hierarchy, and put the implementation in its own inheritance hierarchy.
      3. Use bridge pattern to run-time binding of the implementation.
      4. Use bridge pattern to map orthogonal class hierarchies
      5. Bridge is designed up-front to let the abstraction and the implementation vary independently.
      6. Use the Bridge if you need to be able to switch implementations at runtime.




##### 2. Adapter pattern
##### 2. Strategy pattern
##### 2. Proxy pattern


#### **[Behavioral patterns](https://sourcemaking.com/design_patterns/behavioral_patterns)**
##### 1. Observer pattern
##### 1. Observer pattern

##### 1. Observer pattern

##### 1. Observer pattern


Low Level Design Questions

Question banks: [https://github.com/prasadgujar/low-level-design-primer/blob/master/questions.md]()

1. TinyURL - HLD
2. Central logging system - HLD
3. CAR Parking system - LLD
4. Whats App messaging - HLD
5. Instagram / Photo sharing platform
6. Drop box vs Google drive - HLD
7. Spotify HLD
8. Twitter
9. Reddit HLD - https://leetcode.com/discuss/interview-question/object-oriented-design/124550/design-reddit
10. BookMyshow LLD components and services
11. https://leetcode.com/discuss/interview-question/object-oriented-design/1971774/Bookmyshow-LLD-components-and-services





## High level design

### Distributed Systems Basics

1. Identfying issues in current system
2. This is a recommended approach to solving system design problems. Not all of these topics will be relevant for a given problem.
3. Functional Requirements / Clarifications / Assumptions
4. Non-Functional Requirements
5. Consistency vs Availability
6. Latency
7. Caching
    1. caching
        1. How to handle cache failure
            1. Here do u mean cache miss or due to some reason cache is failing as it’s a distributed system?
            2. Generally we can setup some retry limit, mostly caches fail due to some retryable fail. So we can retry for limited number of times (maybe 3 or 4)
        2. Thundering heard problem:
           1. One corner case is when multiple requests having the same cache miss. For example, suddenly 100K Twitter users reached the server from a link that went viral, but some of the contents are not in cache. Then the cache miss happens in parallel, all of such requests will try to query DB. DB will then face a load of 100K/s read.
        3. https://medium.com/@venkteshsubramaniam/the-thundering-herd-distributed-systems-rate-limiting-9128d20e1f00
        4.
8. How fast does this system need to be?
9. User-perceived latency
10. Data processing latency
11. Security
12. Potential attacks? How should they be mitigated?
13. Privacy
14. PII, PCI, or other user data
15. Data Integrity
16. How to recover from data corruption or loss?
17. Read:Write Ratio
18. APIs
19. Storage Schemas
20. SQL vs NoSQL
21. Message Queues
22. System Design
23. Scalability
24. How does the system scale? Consider both data size and traffic increases.
25. What are the bottlenecks? How should they be addressed?
26. What are the edge cases? What could go wrong? Assuming they occur, how should they be addressed?
27. How will we stress and test this system?
28. Load Balancing
29. Auto-scaling / Replication
30.
31. Partitioning
    1. Dis-advantages of partitioning
    2. Denormalization attempts to improve read performance at the expense of some write performance. Redundant copies of the data are written in multiple tables to avoid expensive joins. Some RDBMS such as PostgreSQL and Oracle support materialized views which handle the work of storing redundant information and keeping redundant copies consistent.
    3. Once data becomes distributed with techniques such as federation and sharding, managing joins across data centers further increases complexity. Denormalization might circumvent the need for such complex joins.
    4. In most systems, reads can heavily outnumber writes 100:1 or even 1000:1. A read resulting in a complex database join can be very expensive, spending a significant amount of time on disk operations.
    5. Disadvantage(s): denormalization
    6. Data is duplicated.
    7. Constraints can help redundant copies of information stay in sync, which increases complexity of the database design.
    8. A denormalized database under heavy write load might perform worse than its normalized counterpart.
32. Replication
33. Business Continuity and Disaster Recovery (BCDR)
34. Internationalization / Localization
35. How to scale to multiple countries and languages? Don't assume the US is English-only.



Another suggest i want to make is always have time_created and time_updated row whenever you are updating. it helps for various purpose - mainly analytics and timeline

### HLD Questions
Design Youtube
Design Whatsap
Design Instagram
Design NewsFeed
Design Netflix




