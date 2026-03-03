# Lombok Test Project

A minimal Java Maven project demonstrating Project Lombok usage with delomboked source generation.

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

To view the generated sources, check the `target/generated-sources/delombok` directory to see the Java code with all Lombok annotations expanded.

## Additional Resources

- [Project Lombok](https://projectlombok.org/)
- [Lombok Features](https://projectlombok.org/features/)
- [Maven Lombok Plugin](https://projectlombok.org/setup/maven)