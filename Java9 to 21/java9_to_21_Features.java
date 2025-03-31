Here’s the updated and complete list of Java 9 to 21 features with explanations and examples for quick revision 🚀  



# Java 9 to Java 21 Features (Updated & Complete)  

## Java 9 (2017)  
 1️⃣ Module System (Project Jigsaw)
Why?  
- Helps break large applications into reusable modules.  
- Improves security and performance.  

Example:  
java
module mymodule {
    exports com.example;
}




 2️⃣ JShell (REPL)
Why?  
- Allows testing Java code without creating a full program.  

Example:  
shell
jshell> int x = 10;
jshell> System.out.println(x * 2); // 20




 3️⃣ Private Methods in Interfaces
Why?  
- Avoids duplicate code in multiple default and static methods inside an interface.  

Example:  
java
interface MyInterface {
    default void show() {
        commonMethod();
        System.out.println("Hello from default method!");
    }
    private void commonMethod() {
        System.out.println("This is a private helper method.");
    }
}




 4️⃣ Factory Methods for Collections
Why?  
- Easily create immutable lists, sets, and maps.  

Example:  
java
List<String> list = List.of("A", "B", "C");
Set<Integer> set = Set.of(1, 2, 3);
Map<String, Integer> map = Map.of("A", 1, "B", 2);




 5️⃣ Stream API Enhancements
Why?  
- Adds useful methods like takeWhile(), dropWhile(), and ofNullable().  

Example:  
java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
numbers.stream().takeWhile(n -> n < 4).forEach(System.out::println); // 1 2 3




 6️⃣ HTTP/2 Client (Incubator)
Why?  
- Provides an improved way to send HTTP requests.  

Example:  
java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://example.com")).GET().build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());




## Java 10 (2018)  
 1️⃣ Local Variable Type Inference (var)
Why?  
- Reduces boilerplate while keeping type safety.  

Example:  
java
var name = "Java 10"; // Compiler infers String
System.out.println(name);




## Java 11 (2018) [LTS]  
 1️⃣ New String Methods
Why?  
- Provides utilities like isBlank(), lines(), and strip().  

Example:  
java
String s = "  Java 11  ";
System.out.println(s.strip());  // "Java 11"




 2️⃣ HTTP Client (Standardized)
Why?  
- Fully integrated HTTP client with asynchronous support.  

Example: *(Same as Java 9 example)*  



## Java 12 (2019)  
 1️⃣ Switch Expressions (Preview)
Why?  
- Improves readability and eliminates fall-through errors.  

Example:  
java
int number = 2;
String result = switch (number) {
    case 1 -> "One";
    case 2 -> "Two";
    default -> "Unknown";
};




## Java 13 (2019)  
 1️⃣ Text Blocks (Preview)
Why?  
- Simplifies multi-line string handling.  

Example:  
java
String text = """
    Hello,
    Java 13!
    """;
System.out.println(text);




## Java 14 (2020)  
 1️⃣ Records (Preview)
Why?  
- Reduces boilerplate for data-only classes.  

Example:  
java
record Person(String name, int age) {}
Person p = new Person("Alice", 25);
System.out.println(p.name());




## Java 15 (2020)  
 1️⃣ Sealed Classes (Preview)
Why?  
- Controls which classes can extend a given class.  

Example:  
java
sealed class Animal permits Dog, Cat {}
final class Dog extends Animal {}
final class Cat extends Animal {}




## Java 16 (2021)  
 1️⃣ Pattern Matching for instanceof
Why?  
- Eliminates redundant casting after instanceof checks.  

Example:  
java
Object obj = "Hello";
if (obj instanceof String s) {
    System.out.println(s.toUpperCase());
}




## Java 17 (2021) [LTS]  
 1️⃣ Sealed Classes (Finalized)
(Same as Java 15 example)



## Java 18 (2022)  
 1️⃣ Simple Web Server
Why?  
- Provides a built-in lightweight HTTP server.  

Example:  
shell
$ jwebserver




## Java 19 (2022)  
 1️⃣ Virtual Threads (Preview)
Why?  
- Efficient concurrency without blocking system threads.  

Example:  
java
try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
    executor.submit(() -> System.out.println("Hello from Virtual Thread!"));
}




## Java 20 (2023)  
 1️⃣ Record Patterns (Preview)
Why?  
- Enables pattern matching for records.  

Example:  
java
record Point(int x, int y) {}
static void printPoint(Point p) {
    if (p instanceof Point(int x, int y)) {
        System.out.println("X: " + x + ", Y: " + y);
    }
}




## Java 21 (2023) [LTS]  
 1️⃣ Virtual Threads (Finalized)
Why?  
- Improves performance for high-concurrency apps.  

Example:  
java
Thread.startVirtualThread(() -> System.out.println("Virtual thread!"));




 2️⃣ Sequenced Collections
Why?  
- Provides first and last element access for collections.  

Example:  
java
SequencedSet<Integer> set = SequencedSet.of(1, 2, 3);
System.out.println(set.getFirst()); // 1




 3️⃣ String Templates (Preview)
Why?  
- Makes string interpolation easier.  

Example:  
java
String name = "Alice";
String message = STR."Hello, \{name}!";
System.out.println(message); // "Hello, Alice!"




## Final Thoughts
- Java 9–10 → New APIs, var, and Modularization  
- Java 11–17 → Stability, HTTP Client, and Performance  
- Java 18–21 → Concurrency, Collections, and String Improvements  

🚀 Now you have the complete and updated Java 9-21 feature list! Let me know if you need more details. 😃
