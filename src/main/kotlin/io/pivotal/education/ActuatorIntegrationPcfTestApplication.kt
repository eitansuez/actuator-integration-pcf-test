package io.pivotal.education

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ActuatorIntegrationPcfTestApplication

fun main(args: Array<String>) {
    SpringApplication.run(ActuatorIntegrationPcfTestApplication::class.java, *args)
}
