package com.ucentral.ms;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/greetings")
public class Controller {

  @GetMapping
  public ResponseEntity<?> getEndpoint() {
    return ResponseEntity.ok("Hello world");
  }

  @GetMapping("/{name}")
  public ResponseEntity<?> getEndpoint(@PathVariable @NotBlank String name) {
    return ResponseEntity.ok("Hello " + name);
  }

}
