package org.cnu.realcoding.SpringBootProject.SpringBootProject.repository;

import org.cnu.realcoding.SpringBootProject.SpringBootProject.domain.SummonerLeaguePosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SummonerLeaguePositionRepository {
    @Autowired
    private MongoTemplate mongoTemplate;
    public void insertSummonerLeaguePosition(SummonerLeaguePosition.LeaguePositionDTO summonerLeaguePosition){
        mongoTemplate.insert(summonerLeaguePosition);
    }

}
