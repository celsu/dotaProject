package com.dota.service;

import com.dota.api.ExternalApi;
import com.dota.domain.Hero;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DotaService {

    public List<Hero> getHeroes(){

        ExternalApi ex = new ExternalApi();
        /*return ex.getHeroes().stream()
                .filter(hero -> hero.getId().equals("3"))
                .sorted((hero1, hero2) -> hero2.getId().compareTo(hero1.getId()))
                .collect(Collectors.toList());*/

        return ex.getHeroes().stream().sorted((hero1, hero2) -> hero2.getId().compareTo(hero1.getId()))
                .collect(Collectors.toList());
    }

}
