package io.pivotal.education

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

// some random comment.

@RestController
class HelloController {

  @GetMapping("/")
  fun hello(): String = "hello world"

}