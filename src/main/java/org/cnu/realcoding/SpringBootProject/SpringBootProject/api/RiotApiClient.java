package org.cnu.realcoding.SpringBootProject.SpringBootProject.api;


import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RiotApiClient {


    @Autowired
    private RestTemplate restTemplate;
    private String requestNameurl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={api_key}";
    private String requestSummonerurl ="https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedPUUID}?api_key={api_key}";
    private String api_key = "RGAPI-e2c4cd6f-aef4-4338-a6c0-c67e6da80240";
    public SummonerLeaguePosition.SummonerDTO getSummonerLeagueName(String summonerName){
        return restTemplate.exchange(requestNameurl, HttpMethod.GET, null,SummonerLeaguePosition.SummonerDTO.class,summonerName,api_key)
                .getBody();
    }
    public List<SummonerLeaguePosition.LeaguePositionDTO> getSummonerLeaguePosition(String summonerId){
        return restTemplate.exchange(requestSummonerurl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<SummonerLeaguePosition.LeaguePositionDTO>>() {},summonerId,api_key).getBody();
    }
}
