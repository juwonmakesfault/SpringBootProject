package org.cnu.realcoding.SpringBootProject.SpringBootProject.controller;

import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.cnu.realcoding.SpringBootProject.SpringBootProject.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @GetMapping("/summoner/{name}")
    public SummonerLeaguePosition.LeaguePositionDTO getSummonerByName(@PathVariable String name) {
        return summonerService.getSummonerLeaguePosition(name);
    }



}
