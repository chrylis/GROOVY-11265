package com.chrylis.bugs.GROOVY_11265

import java.util.function.Function

import groovy.transform.CompileStatic
import groovy.transform.stc.POJO

@CompileStatic
@POJO
class MyImplementation implements MyInterface {
    private final Function<Integer, Integer> doubler

    MyImplementation() {
        doubler = multiplyBy(2)
    }

    int doSomething(int parameter) {
        doubler.apply(parameter)
    }
}
