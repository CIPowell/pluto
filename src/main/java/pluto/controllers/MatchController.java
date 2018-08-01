package pluto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pluto.models.Match;
import pluto.respositories.MatchRepository;

@RestController
@RequestMapping(path="/match")
public class MatchController {

    @Autowired
    private MatchRepository matchRepository;

    @PostMapping("/")
    public @ResponseBody String addMatch(@RequestParam(value="homeTeam") String homeTeam, @RequestParam(value="awayTeam") String awayTeam,
        @RequestParam(value="location") String location, @RequestParam(value="weather") String weather) {
        
        Match match = new Match();
        match.setHomeTeam(homeTeam);
        match.setAwayTeam(awayTeam);
        match.setLocation(location);
        match.setWeather(weather);

        matchRepository.save(match);

        return "Saved";
    }

    @GetMapping("/")
    public @ResponseBody Iterable<Match> getAllMatches() {
        return matchRepository.findAll();
    }

}