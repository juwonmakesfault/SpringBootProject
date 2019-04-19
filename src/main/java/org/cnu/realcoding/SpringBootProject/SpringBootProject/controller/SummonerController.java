package org.cnu.realcoding.SpringBootProject.SpringBootProject.controller;

import org.cnu.realcoding.SpringBootProject.SpringBootProject.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SummonerController {

    @Autowired
    private SummonerService summonerService;


}
