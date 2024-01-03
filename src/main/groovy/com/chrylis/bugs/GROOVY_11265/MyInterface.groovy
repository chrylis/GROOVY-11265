package com.chrylis.bugs.GROOVY_11265

import java.util.function.Function

import groovy.transform.CompileStatic

@CompileStatic
interface MyInterface {
    int doSomething(int parameter)

    default Function<Integer, Integer> multiplyBy(int multiplicand) {
        return (other) -> { multiplicand * other }
    }
}
