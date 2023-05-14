# Liskov Substitution Principle
The Liskov Substitution Principle (LSP) is a principle in object-oriented programming that states that objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program. In other words, if a program is designed using a base class and its derived classes, then the program should still work correctly when any of the derived classes are used in place of the base class.

The LSP helps ensure the behavioural compatibility of a class hierarchy, promoting modularity, reusability, and polymorphism. It allows for the creation of code that is more flexible and maintainable.

To adhere to the Liskov Substitution Principle, the subclasses must satisfy certain conditions:

1. The subtypes must preserve the preconditions of the base type.
2. The subtypes must ensure that the postconditions of the base type are met.
3. The subtypes must not introduce new exceptions that are not part of the base type's exception hierarchy.
4. The subtypes must not weaken the invariants of the base type.
5. The subtypes must honour the behavioural contracts of the base type.

By following the LSP, you can write more robust and extensible code that allows for easier substitution of objects within a class hierarchy.