 ## README
 
 ### Shayan Talaei 98109548, Alireza Eiji 98101193


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
