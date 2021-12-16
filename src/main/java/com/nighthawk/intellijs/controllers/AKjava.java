package com.nighthawk.intellijs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class AKjava {
    @GetMapping("/akabout")    // CONTROLLER handles GET request for /greeting, maps it to greeting() and does variable bindings
    public String charlie_about(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        // @RequestParam handles required and default values, name and model are class variables, model looking like JSON
        model.addAttribute("name", name); // MODEL is passed to html
        return "akabout"; // returns HTML VIEW (greeting)
    }
}

