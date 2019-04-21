package org.cnu.realcoding.SpringBootProject.SpringBootProject.api;


import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RiotApiClient {

    @Autowired
    private RestTemplate restTemplate;
    private String requestNameurl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={api_key}";
    private String requestSummonerurl ="https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{encryptedPUUID}?api_key={api_key}";
    private String api_key = "RGAPI-bab5580b-6a94-44ee-a0e3-f1350e63d24a";
    public SummonerLeaguePosition getSummonerLeagueName(String summonerName){
        return restTemplate.exchange(requestNameurl, HttpMethod.GET, null,SummonerLeaguePosition.class,summonerName,api_key)
                .getBody();
    }
    public SummonerLeaguePosition getSummonerLeaguePosition(String summonerPUUID){
        return restTemplate.exchange(requestSummonerurl, HttpMethod.GET, null,SummonerLeaguePosition.class,summonerPUUID,api_key)
                .getBody();
    }
}
