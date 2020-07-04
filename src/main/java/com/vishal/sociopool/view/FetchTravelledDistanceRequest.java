package com.vishal.sociopool.view;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class FetchTravelledDistanceRequest {

    private int id;
    private String startTime;
    private String endTime;

    public Date getStartTimeDate() throws ParseException {
        Date convertStartTIme = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(this.startTime);
        return convertStartTIme;
    }

    public Date getEndTimeDate() throws ParseException {
        Date convertEndTIme = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(this.endTime);
        return convertEndTIme;
    }
}
