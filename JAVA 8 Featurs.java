https://medium.com/java-and-beyond/modern-java-an-in-depth-guide-from-version-8-to-21-by-akiner-alkan-f89b50e13c72#id_token=eyJhbGciOiJSUzI1NiIsImtpZCI6IjgyMWYzYmM2NmYwNzUxZjc4NDA2MDY3OTliMWFkZjllOWZiNjBkZmIiLCJ0eXAiOiJKV1QifQ.eyJpc3MiOiJodHRwczovL2FjY291bnRzLmdvb2dsZS5jb20iLCJhenAiOiIyMTYyOTYwMzU4MzQtazFrNnFlMDYwczJ0cDJhMmphbTRsamRjbXMwMHN0dGcuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJhdWQiOiIyMTYyOTYwMzU4MzQtazFrNnFlMDYwczJ0cDJhMmphbTRsamRjbXMwMHN0dGcuYXBwcy5nb29nbGV1c2VyY29udGVudC5jb20iLCJzdWIiOiIxMTQ5OTUyNzY2MzU5MjAzOTAxNzgiLCJlbWFpbCI6Inl2eWFzd2FudGhAZ21haWwuY29tIiwiZW1haWxfdmVyaWZpZWQiOnRydWUsIm5iZiI6MTc0MzQwMDE0OSwibmFtZSI6Inlhc3dhbnRoIHl2IiwicGljdHVyZSI6Imh0dHBzOi8vbGgzLmdvb2dsZXVzZXJjb250ZW50LmNvbS9hL0FDZzhvY0s0d3JjS2NuVFVYbGhjcjdhNWZfcnM1SjY0NzJnT043Qm9UUExGTE5BeGRKc3BoS01VPXM5Ni1jIiwiZ2l2ZW5fbmFtZSI6Inlhc3dhbnRoIiwiZmFtaWx5X25hbWUiOiJ5diIsImlhdCI6MTc0MzQwMDQ0OSwiZXhwIjoxNzQzNDA0MDQ5LCJqdGkiOiI5Y2M0ZjYxZmRlN2UyNDViNDEzOWFmM2Y5MzA3NmVkMDdhOWY3YTNkIn0.FYDFF7zFiRWvfc6P6qkiMgF1iZLRU64VNhDLHc0172Ugz7o1rK9HRqHAFhAJMmB77oMO7aRWdSk6A8a756QWuvovs8yISZEBf_1MXlhoMAfd00cJJYVW3uMfJ4-eGcBQYWgvbDtBbopqCmmDaAwFlQSeTmhxSNGlKNq9H-bYOStAXSDwYpsYgY6so-BEbxmRfU4C_XyBmRCzNKA7m3QHAh0tmwDUwnogz2FlpW6Z9WO9_pxldSei9WbFNF-snq4gJa143MGb1DpS5PWJWUkE1GbdxEKPiVHjd9YB_Prv6m0W74aWTSlQpchlUANlO1eKpqYQLpehC-2MVLSSsrRXMw
Sure! Here are some examples and answers for the exercises mentioned:

### 1. Lambda Expressions

**Exercise: Sort a list of strings by their length**

java
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "three", "four", "two");
        
        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        
        strings.forEach(System.out::println); // :: Method reference java 8 Feature
    }
}


2)  Functional Interface: A Functional Interface is an interface that contains only one abstract method. However, it can have multiple default and static methods.

Best Example:
---------------------------------
interface Runnable
void run()
}
 Runnable task = () -> System.out.println("Thread is running with Lambda!");
   Thread t = new Thread(task);
        t.start();
--------------------------------------------------
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2); // Abstract method (Functional Interface)
}

Comparator using Lambda(Java 8):
Collections.sort(list, (s1, s2) -> s1.compareTo(s2));

Before Java 8:
class NameComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
Collections.sort(list, new NameComparator());
----------------------------------------------------------
Some more Java Functional Inteface introduced in Java 8:
----------------------------------------------------------
Fun.Interface	Abstract Method	    Purpose
Predicate<T>	boolean test(T t)	Returns true or false (Used for filtering)
Function<T, R>	R apply(T t)	    Takes one input, returns a result
Consumer<T>    	void accept(T t)	Takes one input, performs an action, no return
Supplier<T>	    T get()	            Returns a value, takes no input

From Package: import java.util.function.Predicate;
Examples of Each:
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;

        System.out.println(isEven.test(4)); // Output: true
        System.out.println(isEven.test(7)); // Output: false
    }
    
-Using Function (Converts Integer to String)
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, String> intToString = num -> "Number: " + num;

        System.out.println(intToString.apply(10)); // Output: Number: 10
    }
}
 -  Using Consumer (Prints a Value)
 public static void main(String[] args) {
        Consumer<String> printMessage = msg -> System.out.println("Hello, " + msg);

        printMessage.accept("Java!"); // Output: Hello, Java!
    }

 -Using Supplier (Generates Random Value)
import java.util.function.Supplier;
import java.util.Random;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> getRandomNumber = () -> new Random().nextInt(100);

        System.out.println(getRandomNumber.get()); // Output: (Random Number)
    }
}

java
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(String message);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface instance = (message) -> System.out.println(message);
        instance.myMethod("Hello, Lambda!");
    }
}




**Exercise: Custom functional interface**

java
@FunctionalInterface
interface CustomFunctionalInterface {
    void execute();
}

public class CustomFunctionalInterfaceExample {
    public static void main(String[] args) {
        CustomFunctionalInterface instance = () -> System.out.println("Executing custom functional interface!");
        instance.execute();
    }
}

3) Default & Static Methods.:

Static Methods:Use static methods when a method does not depend on instance variables and acts like a utility method.
Default Methods: Default methods help evolve interfaces without breaking backward compatibility.
    or
Default methods are methods defined in an interface with an implementation. 
They allow you to add new methods to an interface without breaking compatibility with existing classes that implement the interface. 
Default methods provide a way to extend interfaces without forcing all implementing classes to provide implementations for the new methods.
    Reasons: The introduction of default and static methods in Java 8 was primarily to enhance the Collections Framework without breaking backward compatibility.

Example: Static Methods in Collections
Before Java 8, utility methods like sort() were in Collections class, not in the interfaces.
Comparator<String> comparator = Comparator.naturalOrder();  // Static method in interface
 List<String> names = Arrays.asList("John", "Alex", "Emma", "David");

        // ✅ Using Default Method: forEach() in Iterable
        names.forEach(name -> System.out.println("Name: " + name));

        // ✅ Using Default Method: sort() in List
        names.sort(Comparator.naturalOrder());
        System.out.println("Sorted Names: " + names);

        // ✅ Using Static Method: Comparator.reverseOrder()
        names.sort(Comparator.reverseOrder());

Exercise: Interface with a default & Static method**


interface MyInterface {
    void normalMethod();
    
     static int add(int a, int b) {
        return a + b;
    }
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}

public class DefaultMethodExample implements MyInterface {
    public void normalMethod() {
        System.out.println("Normal method implementation.");
    }
    
    public static void main(String[] args) {
        DefaultMethodExample example = new DefaultMethodExample();
        example.normalMethod();
        example.defaultMethod();
         int result = MyInterface.add(5, 3);
        System.out.println(result);  // Output: 8
    }
}
3️⃣ Default vs. Static Methods
Feature	               | Default |Static Method|
--------------------------------------------
Defined in interface?	✅ Yes	✅ Yes
Has implementation?	    ✅ Yes	✅ Yes
Can be overridden?	    ✅ Yes	❌ No
Called via object?	    ✅ Yes	❌ No (Only via interface name)
Used for?	       Adding new    Utility/helper methods
                functionality to interfaces	

-->What Happens If a Class Implements Two Interfaces with the Same Default Method?

If a class implements multiple interfaces that both have the same default method, Java forces the class to override the method to resolve ambiguity.
interface A {
    default void show() {
        System.out.println("Interface A");
    }
}

interface B {
    default void show() {
        System.out.println("Interface B");
    }
}
class MyClass implements A, B {
    public void show() {
        System.out.println("Resolving conflict in MyClass");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();  // Output: Resolving conflict in MyClass
    }
    
### 3. Streams API

**Exercise: Filter, square, and collect**

java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        List<Integer> evenSquares = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .map(n -> n * n)
                                           .collect(Collectors.toList());
        
        System.out.println(evenSquares);
    }
}


**Exercise: Count unique words in a text file**

java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWordsExample {
    public static void main(String[] args) {
        String filePath = "path/to/your/textfile.txt";
        
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            Set<String> uniqueWords = lines.flatMap(line -> Arrays.stream(line.split("\\s+")))
                                           .collect(Collectors.toSet());
            
            System.out.println("Number of unique words: " + uniqueWords.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


### 4. Optional Class

**Exercise: Using Optional methods**

java
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optionalString = getOptionalString();
        
        optionalString.ifPresent(s -> System.out.println("Value is present: " + s));
        
        String defaultValue = optionalString.orElse("Default Value");
        System.out.println("Value or default: " + defaultValue);
        
        optionalString.map(String::toUpperCase)
                      .ifPresent(s -> System.out.println("Uppercase value: " + s));
    }
    
    public static Optional<String> getOptionalString() {
        return Optional.of("Hello, Optional!");
    }
}


**Exercise: Handling null values in a list**

java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalListExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", null, "three", null, "five");
        
        strings.stream()
               .map(Optional::ofNullable)
               .forEach(opt -> opt.ifPresent(System.out::println));
    }
}


### 5. New Date and Time API

**Exercise: Display the current date and time**

java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        System.out.println("Current date and time: " + now.format(formatter));
    }
}


**Exercise: Parse and format a date**

java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseFormatDateExample {
    public static void main(String[] args) {
        String dateString = "2024-08-03";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed date: " + date);
        
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Formatted date: " + formattedDate);
    }
}


**Exercise: Calculate the difference between two dates**

java
import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceExample {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 8, 3);
        
        Period period = Period.between(startDate, endDate);
        
        System.out.println("Difference is " + period.getYears() + " years, " +
                           period.getMonths() + " months, and " +
                           period.getDays() + " days.");
    }
}


### 6. Method References

**Exercise: Convert lambda to method reference**

java
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "three", "four", "two");
        
        strings.forEach(System.out::println);
    }
}


**Exercise: Method references in a comparator**

java
import java.util.Arrays;
import java.util.List;

public class MethodReferenceComparator {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "three", "four", "two");
        
        strings.sort(String::compareToIgnoreCase);
        
        strings.forEach(System.out::println);
    }
}


### 7. Collectors

**Exercise: Collect to a list**

java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        
        System.out.println(evenNumbers);
    }
}


**Exercise: Grouping by**

java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four", "five");
        
        Map<Integer, List<String>> groupedByLength = strings.stream()
                                                            .collect(Collectors.groupingBy(String::length));
        
        groupedByLength.forEach((length, list) -> 
            System.out.println("Length " + length + ": " + list));
    }
}


These examples should give you a solid foundation in Java 8 features. Let me know if you have any questions or need further assistance!


Certainly! Here are some additional exercises to further practice Java 8 features, especially focusing on streams, lambdas, and other new capabilities.

### Exercise 1: Mapping and Combining

**Task:** Given a list of strings, transform each string to its length and then concatenate these lengths into a single string separated by hyphens.

java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "streams");

        // Solution
        String lengthString = words.stream()
                                   .map(String::length)
                                   .map(String::valueOf)
                                   .collect(Collectors.joining("-"));

        System.out.println(lengthString); // Expected Output: 5-5-4-7
    }
}


### Exercise 2: Partitioning Data

**Task:** Given a list of integers, partition them into even and odd numbers, and print the result.

java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Solution
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                                                         .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers: " + partitioned.get(true));
        System.out.println("Odd numbers: " + partitioned.get(false));
    }
}


### Exercise 3: Finding Unique Elements

**Task:** Given a list of strings with possible duplicates, find all unique strings that contain more than 5 characters.

java
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "dragonfruit", "banana");

        // Solution
        Set<String> uniqueLongWords = words.stream()
                                           .filter(word -> word.length() > 5)
                                           .collect(Collectors.toSet());

        System.out.println(uniqueLongWords); // Expected Output: [dragonfruit, banana]
    }
}


### Exercise 4: Calculating Statistics

**Task:** Given a list of integers, calculate the average, minimum, and maximum values.

java
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Solution
        OptionalDouble average = numbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .average();

        OptionalInt min = numbers.stream()
                                 .mapToInt(Integer::intValue)
                                 .min();

        OptionalInt max = numbers.stream()
                                 .mapToInt(Integer::intValue)
                                 .max();

        System.out.println("Average: " + average.orElse(-1));
        System.out.println("Min: " + min.orElse(-1));
        System.out.println("Max: " + max.orElse(-1));
    }
}


### Exercise 5: Flattening and Collecting

**Task:** Given a list of lists of strings, flatten them into a single list, sort the strings, and collect them into a new list.

java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("banana", "apple"),
            Arrays.asList("cherry", "date"),
            Arrays.asList("fig", "grape")
        );

        // Solution
        List<String> sortedFlattenedList = listOfLists.stream()
                                                       .flatMap(List::stream)
                                                       .sorted()
                                                       .collect(Collectors.toList());

        System.out.println(sortedFlattenedList); // Expected Output: [apple, banana, cherry, date, fig, grape]
    }
}


### Exercise 6: Using `Optional` for Default Values

**Task:** Given a list of optional integers, find the first present value, and if none are present, return a default value.

java
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Exercise6 {
    public static void main(String[] args) {
        List<Optional<Integer>> optionals = Arrays.asList(
            Optional.empty(),
            Optional.empty(),
            Optional.of(42)
        );

        // Solution
        int firstPresent = optionals.stream()
                                    .filter(Optional::isPresent)
                                    .map(Optional::get)
                                    .findFirst()
                                    .orElse(0); // Default value if no present optionals

        System.out.println(firstPresent); // Expected Output: 42
    }
}


### Exercise 7: Grouping and Aggregating

**Task:** Given a list of people with their ages, group them by age and calculate the average age for each group.

java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 30),
            new Person("David", 25),
            new Person("Eve", 35)
        );

        // Solution
        Map<Integer, Double> averageAgeByGroup = people.stream()
                                                       .collect(Collectors.groupingBy(
                                                           Person::getAge,
                                                           Collectors.averagingInt(Person::getAge)
                                                       ));

        System.out.println(averageAgeByGroup); // Expected Output: {25=25.0, 30=30.0, 35=35.0}
    }
}


### Exercise 8: Custom Collector

**Task:** Create a custom collector to concatenate a list of integers into a single string with each number separated by a comma.

java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Custom Collector
        Collector<Integer, StringBuilder, String> toCommaSeparatedString = Collector.of(
            StringBuilder::new,
            (sb, num) -> sb.append(num).append(","),
            StringBuilder::append,
            sb -> sb.length() > 0 ? sb.substring(0, sb.length() - 1) : ""
        );

        // Solution
        String result = numbers.stream()
                               .collect(toCommaSeparatedString);

        System.out.println(result); // Expected Output: 1,2,3,4,5
    }
}


These exercises are designed to enhance your understanding of Java 8's functional programming features, particularly the Stream API, lambdas, and the `Optional` class.


The `::` operator in Java is called the **method reference** operator. It's a shorthand notation that allows you to refer to methods or constructors in a more concise and readable way. Method references are used primarily in the context of functional programming, particularly when working with streams, lambda expressions, and functional interfaces in Java.

### Types of Method References

There are four types of method references:

1. **Reference to a static method**
   - **Syntax**: `ClassName::staticMethodName`
   - **Example**: 
     java
     // Using a method reference to a static method
     Consumer<String> consumer = System.out::println;
     

2. **Reference to an instance method of a particular object**
   - **Syntax**: `instance::instanceMethodName`
   - **Example**: 
     java
     // Using a method reference to an instance method of a particular object
     MyClass myObject = new MyClass();
     Runnable r = myObject::instanceMethod;
     

3. **Reference to an instance method of an arbitrary object of a particular type**
   - **Syntax**: `ClassName::instanceMethodName`
   - **Example**:
     java
     // Using a method reference to an instance method of an arbitrary object
     Function<String, String> func = String::toUpperCase;
     List<String> words = Arrays.asList("hello", "world");
     words.stream().map(String::toUpperCase).forEach(System.out::println);
     

4. **Reference to a constructor**
   - **Syntax**: `ClassName::new`
   - **Example**:
     java
     // Using a method reference to a constructor
     Supplier<MyClass> supplier = MyClass::new;
     

### How to Decide When to Use Method References

- **Use a method reference** when the method you want to call directly matches the expected functional interface's method signature. If a lambda expression is just calling a method with no additional logic, a method reference can often replace it.

### Alternative to Method References: Lambda Expressions

Every method reference has an equivalent lambda expression. Here's how you can convert them:

1. **Reference to a static method**
   - **Method Reference**: `System.out::println`
   - **Equivalent Lambda**: `s -> System.out.println(s)`

2. **Reference to an instance method of a particular object**
   - **Method Reference**: `myObject::instanceMethod`
   - **Equivalent Lambda**: `() -> myObject.instanceMethod()`

3. **Reference to an instance method of an arbitrary object of a particular type**
   - **Method Reference**: `String::toUpperCase`
   - **Equivalent Lambda**: `s -> s.toUpperCase()`

4. **Reference to a constructor**
   - **Method Reference**: `MyClass::new`
   - **Equivalent Lambda**: `() -> new MyClass()`

### Examples of When to Use

1. **Static Method Reference**:
   - **Method Reference**: 
     java
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
     numbers.forEach(System.out::println); // Equivalent to: numbers.forEach(n -> System.out.println(n));
     

2. **Instance Method Reference of a Particular Object**:
   - **Method Reference**: 
     java
     MyClass myObject = new MyClass();
     Runnable r = myObject::instanceMethod; // Equivalent to: Runnable r = () -> myObject.instanceMethod();
     

3. **Instance Method Reference of an Arbitrary Object**:
   - **Method Reference**:
     java
     List<String> strings = Arrays.asList("a", "b", "c");
     strings.stream().map(String::toUpperCase).forEach(System.out::println); // Equivalent to: strings.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
     

4. **Constructor Reference**:
   - **Method Reference**:
     java
     Supplier<MyClass> supplier = MyClass::new; // Equivalent to: Supplier<MyClass> supplier = () -> new MyClass();
     

### Summary
- Use `::` for cleaner, more readable code when the method reference directly matches the required functional interface.
- Method references can always be replaced with equivalent lambda expressions if you prefer the latter or if the logic requires additional processing beyond a simple method call.


