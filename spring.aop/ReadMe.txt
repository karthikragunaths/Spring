https://www.journaldev.com/2583/spring-aop-example-tutorial-aspect-advice-pointcut-joinpoint-annotations

Spring AOP

* Concerns - break down programming logic into distinct parts called Concerns
* Cross cutting concerns - The functions that span multiple points of an application are called CCC
    * These CCC are conceptually separate from the applications business logic
    * There are various common good examples of aspects - logging, auditing, declarative transactions, security, caching etc

- The key unit of modularity in OOP is the class - whereas in AOP the unit of modularity is Aspect
- DI helps you decouple your application objects from each other - AOP helps you decouple CCC from objects that they affect

Spring AOP provides INTERCEPTORS to intercept an application. For e.g., when a method is executed, 	you can add extra functionality before or after the method execution.

AOP Terminologies
* Aspect 
    * This is a module which has a set of API’s providing CC requirements. For e.g., a logging module will be called an AOP Aspect for logging.
    * An Aspect is a class that implements enterprise application concerns that cut across multiple classes, such as transaction management.
        * Aspects can be a normal class configured through Spring XML configuration, or we can use AspectJ integration to define a class as Aspect using @Aspect annotation.
* Join Point
    * This represents a point in your application where you can plug in your aspect.
    * A Join Point is the specific point in the application such as method execution, exception handling, changing object variable values etc. In Spring AOP, Join Points is always the execution of a method.s
* Advice
    * This is the actual action to be taken either before or after the method execution. This is the actual piece of code.
    * Advices are actions taken for a particular Join Point. In terms of programming, they are the methods that gets executed when a certain Join Point with matching Pointcut is reached in the application.s
* Pointcut
    * This is a set of one or more Join Points where the Advice should be executed. You can specify Pointcuts using expressions or patterns
    * Pointcut are expressions that are matched with Join Points to determine whether advise needs to be executed or not.
        * Pointcut uses different kinds of expressions that are matched with the join points and Spring framework uses the AspectJ pointcut expression language
* Introduction
    * An introduction allows you to add new methods or attributes to existing classes.
* Target object
    * The object being advised by one or more Aspect. This object will always be a proxied object, also referred to as advised object.
    * They are the object on which the Advices are applied. 
        * Spring AOP is implemented using runtime proxies so this object is always a proxied object. 
        * What is means is that a subclass is created at runtime where the target method is overridden and advices are included based on their configuration.
* Weaving
    * Weaving is the process of linking aspects with other application objects to create an advised object. This can be done at compile time, load time or run time.
    * It is the process of linking aspects with other objects to create the advised proxy objects. This can be done at compile time, load time or at runtime. Spring AOP performs weaving at the runtime.
* AOP Proxy
    * Spring AOP implementation uses JDK Dynamic Proxy to create the proxy classes with the target class and advise invocations, these are called AOP Proxy classes.
        * We can also use CGLIB proxy by adding it as a dependancy in Spring AOP Project

Types of Advice
* Before - run advice before method execution
* After - run advice after method execution
* After returning - Run advice after a method execution only if the method completes successfully
* After throwing - Run advice after a method execution only if the method exit by throwing exception
* Around - Run advice after and before the advised method is invoked


