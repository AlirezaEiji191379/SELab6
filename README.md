 ## README
 
 ### Shayan Talaei 98109548, Alireza Eiji 98101193

### Pattern descriptions

In this experiment we have implemented three creational patterns, Abstract Factory, Builder, and Prototype. 

#### Abstract Factory
For abstarct factory pattern we designed a IVehicleFactory which produces ICar and IBike. These two classes are abstract classes. To instanciate an IBike or ICar we designed two concrete classes for each of them RegularBike, RegularCar, SportBike, and SportCar. Note that the VehicleFactory itself is also an abstraction and there are two concrete versions of that, RegularVehicleFactory and SportVehicleFactory.

#### Builder
We implemented two builder classes, CarBuilder and MotorCycle Builder. Each class implements the Builder interface and override building functions for the vehicles. Each buildedr class builds a product, in our case a vehicle. There are two types of vehicle namely car and motorcyle which is identifiable by an enum. The builder can instanciate a Vehicle and set its components such as doors and wheels.

#### Prototype
There are two prototype classes, Person and Book. Each Person has some features and each Book has some features as well as a Person as its writer. To clone a Book or a Person, we can call the clone function on an object. These classes are prototype classes which enables them to clone themselves. By cloning them, they can make a copy of themselves same as them but with different references.

### Tests

There has been compliation error in the tests.
![compileErrorInTests](https://github.com/AlirezaEiji191379/SELab6/blob/master/Screenshots/1_compileErrorInTests.png)

We implemented the tests as following.
![implementTest](https://github.com/AlirezaEiji191379/SELab6/blob/master/Screenshots/2_implementTest.png)

Tests failed initially, suggesting that we need to change the implementation of our classes.
![testFailed](https://github.com/AlirezaEiji191379/SELab6/blob/master/Screenshots/3_test_failed.png)

After solving the problem in the code, we can see the tests are passed as in the picture.
![makeTestPassed](https://github.com/AlirezaEiji191379/SELab6/blob/master/Screenshots/4_makeTestPassed.png)

## Questions

#### 1.
 - Creational patterns: These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.
 - Structural patterns: These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.
 - Behavioral patterns: These patterns are concerned with algorithms and the assignment of responsibilities between objects.

#### 2. 
Creational patterns

#### 3.
SOLID principles provide high-level guidelines for overall codebase structure, focusing on maintainability and reusability. They address larger-scale design decisions, such as class responsibilities and dependencies. Design patterns, in contrast, offer specific solutions to recurring design problems within smaller-scale components or classes. They provide concrete implementations and best practices. SOLID principles are general guidelines applicable to any object-oriented system, while design patterns are categorized and specialized. SOLID principles emphasize abstraction and dependency management, while design patterns focus on solving specific design issues. SOLID principles shape the foundation of good design practices, while design patterns offer practical implementations. They can complement each other in creating robust, modular software systems. Both contribute to achieving well-designed, maintainable code.

#### 4.
For a class to be "open" it must be possible to inherit from it. Inheritance is an "is-a" relationship. If you inherit from a singleton-class then instances of the child-class are also instances of the parent class due to the "is-a" relationship, meaning you can suddenly have multiple instances of the singleton class.

If the singleton class inhibits inheritance, it's no longer "open".

If a singleton class allows inheritance, and is "open" for extension, then it can no longer enforce the singleton pattern.
