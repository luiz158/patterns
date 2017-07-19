package com.baselogic.patterns.proxy;

// CANNOT CHANGE
// Break existing API
public interface Subject {

    // Return numeric result

    int operationReturningNumericValue(int input);

    // Return String result

    String operationReturningStringValue(String input);

}
