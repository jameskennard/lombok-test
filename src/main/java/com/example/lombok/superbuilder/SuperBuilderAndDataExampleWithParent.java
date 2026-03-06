package com.example.lombok.superbuilder;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder()
public class SuperBuilderAndDataExampleWithParent extends SuperBuilderAndDataExample {

    private int childField;
}
