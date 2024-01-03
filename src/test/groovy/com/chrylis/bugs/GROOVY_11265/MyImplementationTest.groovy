package com.chrylis.bugs.GROOVY_11265

import spock.lang.Specification

class MyImplementationTest extends Specification {

    def 'test'() {
        given:
        var impl = new MyImplementation()

        expect:
        16 == impl.doSomething(8)
    }
}
