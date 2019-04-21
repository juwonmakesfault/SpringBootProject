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
    public SummonerLeaguePosition getSummonerLeagueName(String summonerName){
        return restTemplate.exchange(requestNameurl, HttpMethod.GET, null,SummonerLeaguePosition.class,summonerName,"RGAPI-d1c4b486-1d9d-422c-a2aa-f2a7534c6d3d")
                .getBody();
    }
    public SummonerLeaguePosition getSummonerLeaguePosition(String summonerPUUID){
        return restTemplate.exchange(requestSummonerurl, HttpMethod.GET, null,SummonerLeaguePosition.class,summonerPUUID,"RGAPI-d1c4b486-1d9d-422c-a2aa-f2a7534c6d3d")
                .getBody();
    }
}
