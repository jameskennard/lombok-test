package com.example.lombok.constructor;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RequiredArgsExample {

    @NonNull
    private String field;

    private String anotherField;

}
