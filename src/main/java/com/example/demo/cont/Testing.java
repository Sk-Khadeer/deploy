package com.example.demo.cont;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Testing {
@GetMapping("/get")
public void a() {
	System.out.println("a");
}
}
