package org.cnu.realcoding.SpringBootProject.SpringBootProject.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SummonerLeaguePositionRepository {
    @Autowired
    private MongoTemplate mongoTemplate;
    public void insertSummonerLeaguePosition(SummonerLeaguePosition summonerLeaguePosition){
        mongoTemplate.insert(summonerLeaguePosition);
    }

}
