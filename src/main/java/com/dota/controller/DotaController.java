package com.dota.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DotaController {

    @GetMapping("/champs")
    public String getChamps() {
        return "Lalalalal";
    }

}
