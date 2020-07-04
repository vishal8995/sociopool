package com.vishal.sociopool.controller;

import com.vishal.sociopool.entity.Traveller;
import com.vishal.sociopool.service.TravellerService;
import com.vishal.sociopool.view.FetchTravelledDistanceRequest;
import com.vishal.sociopool.view.FetchTravelledDistanceResponse;
import com.vishal.sociopool.view.TravellerRequest;
import com.vishal.sociopool.view.TravellerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RequestMapping("/api/traveller")
@RestController
public class TravellerController {

    @Autowired
    private TravellerService travellerService;

    @PostMapping("/distance/save")
    public TravellerResponse save(@RequestBody TravellerRequest travellerRequest) throws ParseException {
        Traveller traveller = travellerService.saveTraveller(travellerRequest);
        return new TravellerResponse(traveller);
    }

    @PostMapping ("/distance/fetch")
    public FetchTravelledDistanceResponse fetch(@RequestBody FetchTravelledDistanceRequest fetchTravelledDistanceRequest) throws ParseException {
        return travellerService.getTravelledDistance(fetchTravelledDistanceRequest);
    }
}
