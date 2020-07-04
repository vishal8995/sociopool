package com.vishal.sociopool.view;

import lombok.Data;

import java.text.ParseException;

@Data
public class FetchTravelledDistanceResponse {

    private int id;
    private String startTime;
    private String endTime;
    private float distance;

    public FetchTravelledDistanceResponse(FetchTravelledDistanceRequest fetchTravelledDistanceRequest,
                                          Float distance) throws ParseException {
        this.id = fetchTravelledDistanceRequest.getId();
        this.startTime = fetchTravelledDistanceRequest.getStartTime();
        this.endTime = fetchTravelledDistanceRequest.getEndTime();
        this.distance = distance;
    }
}
