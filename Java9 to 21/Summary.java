Java has evolved significantly from Java 9 to Java 21, introducing numerous features and enhancements. Below is a summary of key features from each version:



 Java 9 (2017)
1. Module System (Project Jigsaw) – Introduced modules to better structure applications.
2. JShell (REPL) – Interactive shell for running Java code snippets.
3. Collection Factory Methods – List.of(), Set.of(), Map.of().
4. Stream API Enhancements – New methods like takeWhile(), dropWhile(), and ofNullable().
5. Optional Enhancements – ifPresentOrElse(), stream().
6. Try-With-Resources Enhancement – No need to declare variables inside try().
7. Private Methods in Interfaces – Allowed private helper methods inside interfaces.
8. Compact Strings – Optimized string storage for memory efficiency.
9. HTTP/2 Client (Incubator) – Introduced an experimental HTTP client.



 Java 10 (2018)
1. Local Variable Type Inference (var) – Allows var for local variable type inference.
2. Performance Enhancements – Improved Garbage Collection (G1).
3. Application Class-Data Sharing (AppCDS) – Improves startup performance.
4. Parallel Full GC for G1 – Enhances garbage collection efficiency.
5. Optional.orElseThrow() – Throws NoSuchElementException if value is absent.
6. JIT Compiler (Graal) – Introduced an experimental Just-In-Time compiler.



 Java 11 (2018) [LTS]
1. New String Methods – isBlank(), lines(), strip(), repeat().
2. HTTP Client (Standard) – Fully introduced the HTTP Client API.
3. Lambda Parameter var Type – Allowed var inside lambda expressions.
4. Flight Recorder – Low-overhead profiling tool.
5. ZGC (Experimental Garbage Collector) – Low-latency garbage collector.
6. Remove Java EE and CORBA Modules – Deprecated and removed old APIs.
7. Single-File Source Code Execution – Run .java files without compilation.



 Java 12 (2019)
1. Switch Expressions (Preview) – Allows switch as an expression with yield.
2. New String Methods – transform(), indent().
3. Compact Number Formatting – Formats numbers like "1K", "1M".
4. JVM Constants API – New API for constant pool information.
5. G1 Improvements – Enhancements to garbage collection.



 Java 13 (2019)
1. Text Blocks (Preview) – Multi-line string literals using """.
2. Switch Expressions (Preview Update) – Refined from Java 12.
3. Reimplemented Legacy Socket API – Improved network performance.
4. Dynamic CDS Archives – Improves startup performance.



 Java 14 (2020)
1. Records (Preview) – Simplifies immutable data classes.
2. Pattern Matching for instanceof (Preview) – Simplifies casting after instanceof.
3. Helpful NullPointerExceptions – More informative NullPointerException messages.
4. JFR Event Streaming – Continuous monitoring with Java Flight Recorder.



 Java 15 (2020)
1. Sealed Classes (Preview) – Restricts which classes can extend a class.
2. Records (Second Preview) – Refinements to records.
3. Text Blocks (Finalized) – Fully introduced.
4. Hidden Classes – Classes that are not discoverable via reflection.
5. ZGC Enhancements – Now supports uncommitting unused memory.



 Java 16 (2021)
1. Records (Finalized) – Fully available.
2. Pattern Matching for instanceof (Finalized) – Removes redundant casting.
3. Sealed Classes (Second Preview) – Further improvements.
4. Vector API (Incubator) – Introduces vector computations.
5. Foreign Linker API (Incubator) – Interoperability with native code.



 Java 17 (2021) [LTS]
1. Sealed Classes (Finalized) – Fully available.
2. Pattern Matching for switch (Preview) – Enhances switch statements.
3. Deprecation of Security Manager – Marked for removal.
4. MacOS AArch64 Support – Native support for Apple M1 chips.
5. Strongly Encapsulated JDK Internals – More restrictions on reflective access.



 Java 18 (2022)
1. Simple Web Server – Lightweight web server for development.
2. UTF-8 as Default Charset – Standardized character encoding.
3. Vector API (Third Incubator) – Continued improvements.
4. Foreign Function & Memory API (Second Incubator) – Direct access to native memory.



 Java 19 (2022)
1. Virtual Threads (Preview) – Lightweight threads for concurrency.
2. Structured Concurrency (Incubator) – Simplifies multi-threaded programming.
3. Pattern Matching for switch (Second Preview) – Further refinements.
4. Foreign Function & Memory API (Third Incubator) – More stability.



 Java 20 (2023)
1. Virtual Threads (Second Preview) – More enhancements.
2. Structured Concurrency (Second Incubator) – Further refinements.
3. Record Patterns (Preview) – Deconstruct records easily.
4. Scoped Values (Incubator) – Alternative to thread-local storage.



 Java 21 (2023) [LTS]
1. Virtual Threads (Finalized) – Enables high-performance concurrency.
2. Sequenced Collections – Adds SequencedCollection, SequencedSet, SequencedMap.
3. Pattern Matching for switch (Finalized) – More expressive switch statements.
4. Record Patterns (Finalized) – Supports deconstructing record objects.
5. Scoped Values (Preview) – Improves thread-local data handling.
6. String Templates (Preview) – Allows embedded expressions in strings.
7. Foreign Function & Memory API (Finalized) – Stable access to native memory.



 Summary
- Java 9-10: Major structural changes (Modules, var).
- Java 11-12: Usability improvements (String methods, HttpClient).
- Java 13-16: New features (Records, Text Blocks, Pattern Matching).
- Java 17-19: Performance & memory improvements (Virtual Threads, Sealed Classes).
- Java 20-21: Modern concurrency (Virtual Threads), better collections, and pattern matching.

Would you like details on any specific feature? 🚀
