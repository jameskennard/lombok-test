package com.example.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/// Only works if the parent class has a no args constructor
@RequiredArgsConstructor
public class RequiredArgsExampleWithParent extends RequiredAndNoArgsConstructorExample {

    @NonNull
    private String childField;

    private String anotherChildField;

}
