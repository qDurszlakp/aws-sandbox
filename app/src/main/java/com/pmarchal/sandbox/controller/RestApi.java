package com.pmarchal.sandbox.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class RestApi {

    @GetMapping(value = "/cookies", produces = "application/json")
    public ResponseEntity<String> cookies() {

        String cookies = """
                [
                    {"name": "Cookie", "value": 1},
                    {"name": "Cookie", "value": 2},
                    {"name": "Cookie", "value": 3},
                    {"name": "Cookie", "value": 4},
                    {"name": "Cookie", "value": 5}
                ]
                   \s""";

        return ResponseEntity.ok(cookies);
    }

}
