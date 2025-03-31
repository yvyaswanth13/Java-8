->Convert array to stream is diff:
 String[] res = {"ball", "billy", "between"};

        // Convert array to stream, sort by length, and collect into a List
        List<String> sortedList = Arrays.stream(res)
            .sorted(Comparator.comparingInt(String::length))
            .collect(Collectors.toList());

        System.out.println(sortedList); // Output: [ball, billy, between]

List<Employee> maxSalary = employees.stream()
    .filter(e -> e.salary > 5000)
    .collect(Collectors.toList());
Max salary:
Optional<Employee> maxSalaryEmployee = employees.stream()
    .max(Comparator.comparingDouble(e -> e.salary));

Note: List Might be empty so Optional

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


