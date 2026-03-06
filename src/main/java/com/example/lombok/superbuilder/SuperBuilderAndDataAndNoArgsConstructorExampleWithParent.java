package com.example.lombok.superbuilder;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder()
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SuperBuilderAndDataAndNoArgsConstructorExampleWithParent extends SuperBuilderAndDataAndNoArgsConstructorExample {

    private int childField;
}
