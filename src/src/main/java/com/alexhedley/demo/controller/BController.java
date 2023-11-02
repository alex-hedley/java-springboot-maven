package com.alexhedley.demo.controller;

import org.springframework.stereotype.Controller;

@Controller
public non-sealed class BController extends BaseController {

    public static final String TYPE = "b";

    public BController() {
        super(TYPE);
    }
}
