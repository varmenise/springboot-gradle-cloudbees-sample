package com.msgilligan.springboot.hello

import spock.lang.Specification

/**
 * Spock Unit Test Specification
 *
 */
class HelloControllerSpec extends Specification {


    void "should return proper greeting message!"() {
        setup:
        HelloController ctlr = new HelloController()

        when:
        String restString = ctlr.index()

        then:
        restString == 'Greetings from Spring Boot and CloudBees!'
    }
}
