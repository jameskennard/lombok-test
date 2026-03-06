package com.example.lombok.data;

import lombok.Data;

@Data
public class DataExampleWithConstructor {

    private int someData;

    public DataExampleWithConstructor(int someData, int multiplier) {
        this.someData = someData * multiplier;
    }
}
