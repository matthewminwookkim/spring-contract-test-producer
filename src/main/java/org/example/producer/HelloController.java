package org.example.producer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello-world")
    public LinkedHashMap<String, String> index() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("message", "hello world");

        return map;
    }
}
