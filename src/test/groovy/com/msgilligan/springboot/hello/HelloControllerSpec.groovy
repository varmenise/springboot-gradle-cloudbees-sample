package com.msgilligan.springboot.hello

import org.springframework.boot.SpringApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit

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
