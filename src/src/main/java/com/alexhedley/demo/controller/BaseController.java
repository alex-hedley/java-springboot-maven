package com.alexhedley.demo.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
sealed class BaseController permits AController, BController {
    protected final String type;

    protected BaseController(String type) {
        this.type = type;
    }
}
