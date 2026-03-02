# Lombok Test Project

A minimal Java Maven project demonstrating Project Lombok usage with delomboked source generation.

## What is this?

This project shows how to:
- Use Lombok annotations to reduce boilerplate code
- Generate "delomboked" sources to inspect what Lombok actually generates
- Configure Maven to work with Lombok's annotation processor

## Project Structure

```
lombok-test/
├── pom.xml
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── lombok/
│                       └── Person.java
└── README.md
```

## Build Instructions

### Prerequisites
- Java 11 or higher
- Maven 3.6+

### Build the project

```bash
mvn clean compile
```

### Generate delomboked sources

The delomboked sources are automatically generated during compilation. You can also explicitly generate them:

```bash
mvn lombok:delombok
```

### View the generated sources

After building, check the `target/generated-sources/delombok` directory to see the Java code with all Lombok annotations expanded.

## What Lombok Generates

### Original Source (Person.java)

```java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private Long id;
    private String name;
    private String email;
    private Integer age;
}
```

### Generated Code (in target/generated-sources/delombok)

Lombok generates approximately 200+ lines of code including:
- **Getters** for all fields
- **Setters** for all fields
- **toString()** method with all fields
- **equals()** and **hashCode()** methods
- **Builder pattern** implementation with inner Builder class
- **No-args constructor**
- **All-args constructor**

## Inspecting Generated Sources

1. Run `mvn clean compile`
2. Navigate to `target/generated-sources/delombok/com/example/lombok/`
3. Open `Person.java` to see the fully expanded Java code
4. Compare it with the original in `src/main/java/com/example/lombok/Person.java`

## Lombok Annotations Used

- `@Data` - Generates getters, setters, toString, equals, and hashCode
- `@Builder` - Generates the builder pattern
- `@NoArgsConstructor` - Generates a no-argument constructor
- `@AllArgsConstructor` - Generates a constructor with all fields

## Additional Resources

- [Project Lombok](https://projectlombok.org/)
- [Lombok Features](https://projectlombok.org/features/)
- [Maven Lombok Plugin](https://projectlombok.org/setup/maven)