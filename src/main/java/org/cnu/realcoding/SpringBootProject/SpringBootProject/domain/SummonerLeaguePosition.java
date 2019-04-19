package org.cnu.realcoding.SpringBootProject.SpringBootProject.domain;

import lombok.Data;

@Data
public class SummonerLeaguePosition {
    private SummonerDTO summonerDTO;

    @Data
    public static class SummonerDTO{
        private int profileIconId;
        private String name;
        private String puuid;
        private long summonerLevel;
        private long revisionDate;
        private String id;
        private String acountid;
    }
}
