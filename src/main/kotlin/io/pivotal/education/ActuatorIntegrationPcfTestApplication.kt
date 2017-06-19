package io.pivotal.education

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class ActuatorIntegrationPcfTestApplication

fun main(args: Array<String>) {
  SpringApplication.run(ActuatorIntegrationPcfTestApplication::class.java, *args)
}


@RestController
class HelloController {

  @GetMapping("/")
  fun hello(): String = "hello world"

}