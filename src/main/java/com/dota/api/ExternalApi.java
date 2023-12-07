package com.dota.api;

import com.dota.domain.Hero;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class ExternalApi {

    private final String API_URL = "https://api.opendota.com/api/heroes";
    List<Hero> heroes;


    public  List<Hero> getHeroes() {
        RestTemplate restTemplate = new RestTemplate();
        Hero[] heroes = restTemplate.getForObject(API_URL, Hero[].class);
        assert heroes != null;
        return Arrays.asList(heroes);
    }

}
