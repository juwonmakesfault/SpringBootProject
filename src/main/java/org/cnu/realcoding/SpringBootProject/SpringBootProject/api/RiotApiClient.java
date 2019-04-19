package org.cnu.realcoding.SpringBootProject.SpringBootProject.api;


import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OpenWeatherMapApiClient {

    @Autowired
    private RestTemplate restTemplate;
    private String requestUrl = "https://api.openweathermap.org/data/2.5/weather?q={cityName}&appid={appid}";

    public SummonerLeaguePosition getSummonerLeaguePosition(String summonerName){
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null,SummonerLeaguePosition.class,summonerName,"RGAPI-a03be90f-9180-4775-8624-9694af28c4b1")
                .getBody();

    }
}
