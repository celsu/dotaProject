package com.dota.controller;

import com.dota.domain.Hero;
import com.dota.service.DotaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DotaController {

    @GetMapping("/champs")
    public List<Hero> getChamps() {

        DotaService se = new DotaService();

        //return  se.getHeroes().toString();
        return se.getHeroes();
    }
}
