package com.example.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/// A simple Person class demonstrating Lombok annotations.
///
/// This class uses Lombok to automatically generate:
/// - Getters and setters for all fields
/// - toString() method
/// - equals() and hashCode() methods
/// - Builder pattern implementation
/// - Constructors (no-args and all-args)
///
/// To see what Lombok generates, run 'mvn clean compile' and check:
/// target/generated-sources/delombok/com/example/lombok/Person.java
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    
    /// Unique identifier for the person
    private Long id;
    
    /// Full name of the person
    private String name;
    
    /// Email address
    private String email;
    
    /// Age in years
    private Integer age;
}