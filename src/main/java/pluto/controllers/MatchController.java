package pluto.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pluto.models.Match;

@RestController
public class MatchController {

    @RequestMapping("/match")
    public Match match(@RequestParam(value="location") String location, @RequestParam(value="weather") String weather) {
        return new Match(location, weather);
    }

}