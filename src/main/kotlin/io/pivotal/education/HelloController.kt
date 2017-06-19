package io.pivotal.education

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

  @GetMapping("/")
  fun hello(): String = "hello world"

}