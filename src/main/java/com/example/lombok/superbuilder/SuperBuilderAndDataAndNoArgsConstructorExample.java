package com.example.lombok.superbuilder;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder()
@NoArgsConstructor
public class SuperBuilderAndDataAndNoArgsConstructorExample {

    private int parentField;
}
