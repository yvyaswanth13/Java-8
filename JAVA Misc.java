Q) Why is the Java main method static?
Ans) It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.

3) Java static block
Is used to initialize the static data member.
It is executed before the main method at the time of classloading.

Q)this: to refer current class instance variable
The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.

Abstract class and interface both are used to achieve abstraction where we can declare the abstract methods. Abstract class and interface both can't be instantiated.

Example For Abstract Calss:
interface A{  
void a();//bydefault, public and abstract  
void b();  
void c();  
void d();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class B implements A{  
public void c(){System.out.println("I am C");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends B{  
public void a(){System.out.println("I am a");}  
public void b(){System.out.println("I am b");}  
public void d(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class Test5{  
public static void main(String args[]){  
A a=new M();  
a.a();  
a.b();  
a.c();  
a.d();  
}} 


In Java, interface methods can be of the following types:

Abstract Methods: These methods do not have a body and must be implemented by the classes that implement the interface. By default, all methods in an interface were abstract before Java 8.

Default Methods: Introduced in Java 8, these methods have a body and provide a default implementation. Classes that implement the interface can override these methods if needed.

Static Methods: Also introduced in Java 8, these methods belong to the interface and cannot be overridden by implementing classes. They are called on the interface itself, not on instances of the interface.

Private Methods: Introduced in Java 9, these methods are used to share code between default methods. They cannot be accessed outside the interface.

Key Points:
You do not need to use the abstract keyword when declaring methods in an interface; they are abstract by default.
If you want to provide a default implementation in an interface, you must use the default keyword.

Characteristics of Interface Variables

Public, Static, and Final: All variables in an interface are implicitly public, static, and final. This means:
Public: The variable is accessible from any other class.
Static: The variable belongs to the interface itself, not to any instance of the interface.
Final: The variable's value cannot be changed once it is initialized. It is effectively a constant.


Functional Programming:

Oracl team intention is Lets decide to have a topic called Funcational Interface it should have only on abstract method and @Functional by this,
User cant add more abstract methods to it.

Built-in Java Functional Interfaces(  https://www.boardinfinity.com/blog/functional-interfaces-in-java/ )
For common cases, Java provides predefined functional interfaces. The functional interface gets converted into many interfaces. By using the @FunctionalInterface annotation. The following are a few of these interfaces:

#1. Runnable -

It only contains the run() method. This allows you to write applications that can run on separate threads.

#2. Comparable -

There is only one method in this interface, compareTo(). Classes implementing the Comparable interface can compare and sort their objects.

#3. ActionListener -

There is only one method in it, actionPerformed(). This component handles all the action events like mouse clicks on components.

#4. Callable -

In this class, there is only one method called call(). Using this method, you can monitor the progress of a thread's execution of a function.

Types of Functional interfaces
There are four main types of functional interfaces in Java:

#1. Consumer

As of Java 8, the Consumer interface accepts one gentrified argument and does not return any value.

#2. Predicate

Predicate functions in Java return booleans based on one argument. In most cases, it gets used to filter values from a collection. Additionally, it is a function that returns a boolean in response to a gentrified argument.

#3. Supplier

Suppliers with functional interfaces in Java don't take arguments, unlike functional interfaces. A value gets returned when we call the supplier. Supplier is a generic interface, so the type of value must get specified using <> (Angular brackets) for the get() function to return it.

#4. Function

Function type functional interfaces receive a single argument, process it, and return a result. In this type of functional interface, a user inpu

