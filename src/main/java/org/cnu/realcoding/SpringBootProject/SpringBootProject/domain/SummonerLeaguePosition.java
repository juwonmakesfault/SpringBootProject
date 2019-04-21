package org.cnu.realcoding.SpringBootProject.SpringBootProject.domain;

import lombok.Data;

@Data
public class SummonerLeaguePosition {
    private SummonerDTO summonerDTO;
    private LeaguePositionDTO leaguePositionDTO;
    private MiniSeriesDTO miniSeriesDTO;
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
    private static class LeaguePositionDTO {
        private String queueType;
        private String summonerName;
        private boolean hotStreak;
        private MiniSeriesDTO miniSeriesDTO;
        private int wins;
        private boolean veteran;
        private int losses;
        private String rank;
        private String leagueId;
        private boolean inactive;
        private boolean freshBlood;
        private String leagueName;
        private String position;
        private String tier;
        private String summonerId;
        private String leaguePoints;
    }
    private static class MiniSeriesDTO{
        private String progress;
        private int losses;
        private int target;
        private int wins;
    }

}
