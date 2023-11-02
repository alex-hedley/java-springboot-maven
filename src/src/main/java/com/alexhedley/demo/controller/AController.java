package com.alexhedley.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public non-sealed class AController extends BaseController {

    public static final String TYPE = "a";

    public AController() {
        super(TYPE);
    }
}