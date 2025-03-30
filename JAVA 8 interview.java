Sure! Here are some common Java 8 interview questions along with their answers, focusing on the new features introduced in Java 8:

### 1. What are the main features introduced in Java 8?
**Answer:**
- **Lambda Expressions:** Enables functional programming by allowing functions as parameters.
- **Stream API:** Facilitates functional-style operations on streams of elements.
- **Functional Interfaces:** Interfaces with a single abstract method, used for lambda expressions and method references.
- **Default Methods:** Methods in interfaces with a default implementation.
- **Optional Class:** Helps in handling null values gracefully.
- **New Date and Time API:** Provides a comprehensive model for date and time manipulation.

### 2. Explain Lambda Expressions in Java 8.
**Answer:**
Lambda expressions are a new feature in Java 8 that allows you to write anonymous methods. They provide a clear and concise way to represent one method interface using an expression. They are primarily used to define the inline implementation of a functional interface.

Example:
```java
// Traditional way
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
};

// Using Lambda Expression
Runnable runnableLambda = () -> System.out.println("Hello, world!");
```

### 3. What is a Functional Interface?
**Answer:**
A functional interface is an interface with a single abstract method. It can have multiple default or static methods but only one abstract method. They are used as the types for lambda expressions and method references. The `@FunctionalInterface` annotation can be used to indicate a functional interface.

Example:
```java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}
```

### 4. What is the Stream API in Java 8?
**Answer:**
The Stream API is a powerful tool for processing sequences of elements. It allows performing bulk operations on collections in a functional programming style. Streams can be created from collections, arrays, or I/O resources. They support operations such as map, filter, and reduce.

Example:
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
List<String> filteredNames = names.stream()
                                  .filter(name -> name.startsWith("A"))
                                  .collect(Collectors.toList());
```

### 5. Explain the difference between `map` and `flatMap` methods in the Stream API.
**Answer:**
- **`map`**: Transforms each element of the stream into another form using a function. It returns a stream of the transformed elements.
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
List<Integer> nameLengths = names.stream()
                                 .map(String::length)
                                 .collect(Collectors.toList());
```
- **`flatMap`**: Transforms each element of the stream into a stream of new values and then flattens the resulting streams into a single stream.
```java
List<List<String>> listOfLists = Arrays.asList(
    Arrays.asList("a", "b"),
    Arrays.asList("c", "d")
);
List<String> flatList = listOfLists.stream()
                                   .flatMap(List::stream)
                                   .collect(Collectors.toList());
```

### 6. What are default methods in interfaces and why are they introduced?
**Answer:**
Default methods are methods in interfaces that have a default implementation. They were introduced to allow the addition of new methods to interfaces without breaking the existing implementation of those interfaces. This provides backward compatibility.

Example:
```java
interface MyInterface {
    void existingMethod();

    default void newMethod() {
        System.out.println("This is a default method");
    }
}
```

### 7. What is the `Optional` class in Java 8? How can it be used?
**Answer:**
The `Optional` class is a container object which may or may not contain a non-null value. It is used to avoid `NullPointerException` and to express that a value might be absent.

Example:
```java
Optional<String> optional = Optional.ofNullable("Hello");
optional.ifPresent(System.out::println);

Optional<String> emptyOptional = Optional.empty();
String defaultValue = emptyOptional.orElse("Default Value");
System.out.println(defaultValue); // Output: Default Value
```

### 8. How does the new Date and Time API in Java 8 improve upon the old Date and Calendar classes?
**Answer:**
The new Date and Time API (java.time package) in Java 8 provides a more comprehensive and consistent model for date and time manipulation. It addresses many of the shortcomings of the old `Date` and `Calendar` classes:
- **Immutability:** All classes in the new API are immutable and thread-safe.
- **Better Design:** Provides clear and fluent methods for date and time manipulation.
- **Separation of Concerns:** Different classes for different purposes (e.g., `LocalDate` for dates, `LocalTime` for times, `LocalDateTime` for combined date and time).

Example:
```java
LocalDate date = LocalDate.now();
LocalTime time = LocalTime.now();
LocalDateTime dateTime = LocalDateTime.of(date, time);

System.out.println(date);      // Output: 2024-08-03
System.out.println(time);      // Output: 10:15:30
System.out.println(dateTime);  // Output: 2024-08-03T10:15:30
```

### 9. What are method references in Java 8?
**Answer:**
Method references provide a way to refer to methods without invoking them. They are used to create simple lambda expressions by referring to existing methods. There are four types of method references:
1. **Reference to a static method**: `Class::staticMethod`
2. **Reference to an instance method of a particular object**: `instance::instanceMethod`
3. **Reference to an instance method of an arbitrary object of a particular type**: `Class::instanceMethod`
4. **Reference to a constructor**: `Class::new`

Example:
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Using method reference to a static method
names.forEach(System.out::println);

// Using method reference to an instance method of a particular object
names.stream().map(String::toUpperCase).forEach(System.out::println);
```

### 10. Explain the concept of Streams and how it differs from Collections.
**Answer:**
Streams are a sequence of elements supporting sequential and parallel aggregate operations. They differ from collections in the following ways:
- **Processing**: Streams are designed to process data declaratively and functionally, whereas collections are used to store and manipulate data.
- **Lazy Evaluation**: Streams support lazy evaluation, meaning operations are not performed until a terminal operation is invoked.
- **Immutable**: Streams do not modify the underlying data source, whereas collections are mutable.
- **Single-use**: Streams can only be traversed once, whereas collections can be traversed multiple times.

Example:
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

// Using a collection
for (String name : names) {
    System.out.println(name);
}

// Using a stream
names.stream().forEach(System.out::println);
```

These questions and answers should provide a good overview of Java 8 features and help you prepare for interviews.