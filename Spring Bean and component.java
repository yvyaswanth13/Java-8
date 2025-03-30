In Spring, both `@Component` and `@Bean` are used to define beans, but they serve different purposes and are used in different contexts. Let's look at the differences and when to use each one.

### `@Component`

- **Purpose**: The `@Component` annotation is used to denote a class as a Spring-managed component. It is a generic stereotype for any Spring-managed component.
- **Use Case**: Use `@Component` when you want to automatically detect and register beans from your application’s classpath. It is typically used with component-scanning.

**Example**:
```java
package com.example;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street = "123 Main St";
    private String city = "Springfield";
    private String country = "USA";

    // Getters and Setters
}
```

**Configuration Class**:
```java
package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}
```

### `@Bean`

- **Purpose**: The `@Bean` annotation is used to declare a bean in a Spring configuration class. It is a method-level annotation and provides more control over the bean instantiation and configuration process.
- **Use Case**: Use `@Bean` when you need to define a bean with custom instantiation logic, configure third-party classes, or when you need fine-grained control over the creation of the bean.

**Example**:
```java
package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        Address address = new Address();
        address.setStreet("123 Main St");
        address.setCity("Springfield");
        address.setCountry("USA");
        return address;
    }

    @Bean
    public Customer customer(Address address) {
        return new Customer(address);
    }
}
```

### Differences and When to Use Them

1. **Component Scanning vs. Explicit Configuration**:
    - `@Component` is part of Spring's component scanning mechanism. Classes annotated with `@Component` (or specialized stereotypes like `@Service`, `@Repository`, `@Controller`) are automatically detected and registered as beans.
    - `@Bean` is part of the Java configuration approach. Methods annotated with `@Bean` in a `@Configuration` class are invoked by Spring to produce and register beans.

2. **Granularity and Control**:
    - `@Component` is simpler and more declarative. It is suitable for most use cases where the default behavior of Spring is sufficient.
    - `@Bean` offers more control and flexibility. It is useful when you need to perform additional logic during bean creation, such as configuring third-party libraries or setting up complex initialization logic.

3. **Third-party Classes**:
    - Use `@Bean` when you need to integrate third-party classes that you cannot annotate with `@Component`.

### Example Combining Both

You can combine both approaches in a single application.

**Address.java**:
```java
package com.example;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street = "123 Main St";
    private String city = "Springfield";
    private String country = "USA";

    // Getters and Setters
}
```

**Customer.java**:
```java
package com.example;

public class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    // Getters and Setters
}
```

**AppConfig.java**:
```java
package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {

    @Bean
    public Customer customer(Address address) {
        return new Customer(address);
    }
}
```

**Main.java**:
```java
package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer customer = context.getBean(Customer.class);
        System.out.println(customer);
    }
}
```

In this combined example, `Address` is defined using `@Component` and automatically registered via component scanning, while `Customer` is defined using `@Bean` to demonstrate the flexibility and control offered by Java configuration.