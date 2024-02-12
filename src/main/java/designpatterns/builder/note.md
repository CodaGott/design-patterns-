# THREE CATEGORIES OF DESIGN PATTERN.
    1. Creational Design Pattern: Provides various object creation 
    mechanism which increases the flexibilty and reuseabilty of code.
        - CREATIONAL PATTERNS INCLUDES:
            - Builder
            - Prototype
            - Factory Method
            - Abstract Factory
            - Singleton

# MVC DESIGN PATTERN = Structural Design Pattern
    //TODO:::=====>=> MODEL: is the way we structure data that gets
    persisted in the database. Any class that structures the data
    that our application works with is part of the model.
    MODEL consists of DTO classes, Entity classes
    and the Document classes.
    
    //TODO:::======>=> VIEW: displays data that the user interacts with.
    The View consists of the webpages that share or display the data
    the user interacts with.
    
    //TODO:::======>=> CONTROLLER: Processes and gives access to the
    (MODEL)data through the view. The Controller consists of
    the controller classes, repository classes, proxy classes
    and service classes.


# BUILDER DESIGN PATTERN = Creational Design Pattern
    Builder patter, helps with the way we create our class 
    and make an object out of the class.

    Lombok @Builder annotation makes it easy to create a 
    builder class these days.
    
    When we have multiple instances of a class, builder pattern
    makes it easy for us to create an object of such class on the fly
    without having to create constructor for the fields we will need.
    
    It's mostly used for the models, entities or DTO in our project.

# DECORATOR = Structural Design Pattern
    When we have different actions that can be combined 
    in different ways say we have 3 Operations and sometimes we want to
    excute only Operation1 or maybe Operation1 and Operation2 or maybe 
    Operation3 and Operation1, observer pattern is used to design our code
    and makes it easier to combine the operations in any possible way,
    without having to dublicate codes or write more code than nessary.

```
    Real world example of Decorator can be found in the JDK IOStream object. 
```

# ADAPTER = Structural Design Pattern
    Is an Object that convert the interface of one object so that another
    can understand it. Example if we have an application that produces xml and
    later we have another on that analysis json only but we want it to analys our
    xml data, we can create an object that converts the xml to json before
    sending it to the json application to analys.

```
    Real world example of Adapter can be found in the Spring Security UserDetails Interface
    and how it connects to the User entity class.
```

# SINGLETON = Creational Design Pattern
    Singleton is a creational design pattern that ensure a class has only one 
    instance and allows any object in the program to easily access that instance.
    Example of Singleton from the JDK is the Runtime class.
    Example of Singleton in SpringBoot is a class with the @RestController or
    any sterior type annotation. (@Service, @Controller, @Service, @Compnent etc)


#There are different ways to instantiate a Singleton
```
    1. Eager Instantiation: (Having it at the field level)
        ==> This will create the instance immediatley the class gets loaded.
    2. Lazy Instantiation : (Having it in the getInstance method)...
        ==> It's only created when someone requests it.
```

# FACTORY METHOD = Creational Design Pattern
    Factory design Pattern is a creational design pattern that provides
    an interface for creating objects in a superclass, but allows subclasses
    to alter the type of object that will be created. OR
    Factory design pattern is a pattern that uses a method to hide
    how an object is being created.
    Example in JDK is the LocalDateTime.now() method and
    Paths.get() method.

# ABSTRACT FACTORY = Creational Design Pattern
    Abstract Factory is a creational design pattern that allows creation
    of related objects without specifying their concrete classes.
    
    We can use VehicleFactory to create a Car or a MotorBike without 
    specifying the Car or MotorBike class.

    RealWorld example is JPA EntityManager, we use the 
    EntityManagerFactory to create it.

# Iterator = Behavioural Design Pattern
    A behavioral design pattern that lets you traverse elements of a 
    collection without exposing its underlying representation(Algorithm) (list, stack, tree, etc.).