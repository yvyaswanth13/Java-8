Note:
If you don’t need to modify the list, use .toList() (simpler and safer).

If you need to modify the list, use collect(Collectors.toList()).

List<String> words = List.of("Hello", "World");
List<Integer> lengths = words.stream().map(String::length).toList();//Immutable
                      or
List<Integer> lengths = words.stream().map(String::length).collect(Collectors.toList()); //Mutable


List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3, 4));
List<Integer> flattened = nested.stream().flatMap(List::stream).toList();

-->Max Number
Optional<Integer> max = List.of(3, 1, 4, 9, 2).stream().max(Integer::compare);
System.out.println(max.orElse(-1)); // 9

                  or
Optional<Integer> max = List.of(3, 1, 4, 9, 2).stream().max((a,b)->Integer.compare(a,b));

6. Count strings starting with "A"

long count = List.of("Apple", "Banana", "Avocado", "Mango")
                .stream()
                .filter(s -> s.startsWith("A"))
                .count();
System.out.println(count); // 2
--------------------------------------------------------------------------------------------------------------------------------------------
->Convert array to stream is diff:
 String[] res = {"ball", "billy", "between"};

        // Convert array to stream, sort by length, and collect into a List
        List<String> sortedList = Arrays.stream(res)
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

        System.out.println(sortedList); // Output: [ball, billy, between]

--------------------------------------------------------------------------------------------------------------------------------------------
List<Employee> maxSalary = employees.stream()
    .filter(e -> e.salary > 5000)
    .collect(Collectors.toList());
Max salary:
Optional<Employee> maxSalaryEmployee = employees.stream()
    .max(Comparator.comparingDouble(e -> e.salary));

Note: List Might be empty so Optional

--------------------------------------------------------------------------------------------------------------------------------------------
List<Employee> sortedEmployees = employees.stream()
    .sorted((e1, e2) -> Integer.compare(e1.age, e2.age)) // Sort by age in ascending order
    .collect(Collectors.toList())
Note: Streams wont use sort it will use sorted
normal java expression:students.sort((p1, p2) -> Integer.compare(p1.age, p2.age));

//Optimized way:
Decending order:
List<Employee> sortedEmployees = employees.stream()
    .sorted(Comparator.comparingInt(e -> e.age).reversed())
    .collect(Collectors.toList());

List<Employee> sortedEmployees = employees.stream()
    .sorted(Comparator.comparingInt(e -> e.age))
    .collect(Collectors.toList());

--------------------------------------------------------------------------------------------------------------------------------------------

10. Difference between toSet() and distinct()
.collect(Collectors.toSet()) → Returns unordered unique elements.

.distinct() → Maintains order but removes duplicates.


List<Integer> distinctList = List.of(3, 1, 2, 3, 2, 1).stream().distinct().toList();
Set<Integer> uniqueSet = List.of(3, 1, 2, 3, 2, 1).stream().collect(Collectors.toSet());

Advance
Advanced Solutions
11. Group Employees by Department

Map<String, List<Employee>> groupedByDept = employees.stream()
    .collect(Collectors.groupingBy(Employee::getDepartment));
           or
Map<String, List<Employee>> groupedByDept = employees.stream()
    .collect(Collectors.groupingBy(emp -> emp.getDepartment()));

12. Sum of salaries in List<Employee>

double totalSalary = employees.stream()
    .mapToDouble(Employee::getSalary)
    .sum();

13. Handling null safely before calling stream()

List<String> list = null;
List<String> safeList = Optional.ofNullable(list).orElseGet(List::of);
safeList.stream().forEach(System.out::println);

14. When to use Parallel Streams
Use parallelStream() for CPU-intensive tasks with large datasets.


List<Integer> numbers = IntStream.range(1, 1_000_000).boxed().toList();
long count = numbers.parallelStream().filter(n -> n % 2 == 0).count();

15. Handling exceptions in Stream API

List<String> numbers = List.of("10", "20", "abc", "30");

List<Integer> parsedNumbers = numbers.stream()
    .map(s -> {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0; // Handle invalid input
        }
    })
    .toList();




