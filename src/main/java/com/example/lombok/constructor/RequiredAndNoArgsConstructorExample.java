package com.example.lombok.constructor;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
public class RequiredAndNoArgsConstructorExample {

    @NonNull
    private String field;

    private String anotherField;

}
