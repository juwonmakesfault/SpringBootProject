package org.cnu.realcoding.SpringBootProject.SpringBootProject.service;

import org.cnu.realcoding.SpringBootProject.SpringBootProject.api.RiotApiClient;
import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.cnu.realcoding.SpringBootProject.SpringBootProject.repository.SummonerLeaguePositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SummonerService {
    private LinkedList<String> Summoner = new LinkedList<>();

    @Autowired
    private RiotApiClient riotApiClient;
    @Autowired
    private SummonerLeaguePositionRepository summonerLeaguePositionRepository;

    @Scheduled(initialDelay = 5000L , fixedDelay = 2000L)
    public void getSummonerLeaguePosition(){
        String id = riotApiClient.getSummonerLeagueName("hide on bush").getId();
        List<SummonerLeaguePosition.LeaguePositionDTO> summonerLeaguePosition = riotApiClient.getSummonerLeaguePosition(id);
        for(SummonerLeaguePosition.LeaguePositionDTO a : summonerLeaguePosition)
            summonerLeaguePositionRepository.insertSummonerLeaguePosition(a);
    }

    @Scheduled(initialDelay = 5000L , fixedDelay = 2000L)
    public void getSummonerLeaguePosition(String summorerName){
        String id = riotApiClient.getSummonerLeagueName(summorerName).getId();
        List<SummonerLeaguePosition.LeaguePositionDTO> summonerLeaguePosition = riotApiClient.getSummonerLeaguePosition(id);
        for(SummonerLeaguePosition.LeaguePositionDTO a : summonerLeaguePosition)
            summonerLeaguePositionRepository.insertSummonerLeaguePosition(a);
    }



}


