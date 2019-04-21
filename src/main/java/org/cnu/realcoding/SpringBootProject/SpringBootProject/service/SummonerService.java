package org.cnu.realcoding.SpringBootProject.SpringBootProject.service;

import org.cnu.realcoding.SpringBootProject.SpringBootProject.api.RiotApiClient;
import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.cnu.realcoding.SpringBootProject.SpringBootProject.repository.SummonerLeaguePositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class SummonerService {
    private LinkedList<String> Summoner = new LinkedList();

    @Autowired
    private RiotApiClient riotApiClient;
    @Autowired
    private SummonerLeaguePositionRepository summonerLeaguePositionRepository;

    public void getSummonerLeaguePosition(){
        String Puuid = riotApiClient.getSummonerLeagueName("hide on bush").getSummonerDTO().getPuuid();
        SummonerLeaguePosition summonerLeaguePosition = riotApiClient.getSummonerLeaguePosition(Puuid) ;
        summonerLeaguePositionRepository.insertSummonerLeaguePosition(summonerLeaguePosition);
    }



}


