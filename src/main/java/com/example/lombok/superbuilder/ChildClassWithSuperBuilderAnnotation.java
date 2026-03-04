package com.example.lombok.superbuilder;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class ChildClassWithSuperBuilderAnnotation extends ParentClassWithSuperBuilderAnnotation {

    private int childField;

}