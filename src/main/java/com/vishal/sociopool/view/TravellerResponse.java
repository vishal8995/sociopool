package com.vishal.sociopool.view;

import com.vishal.sociopool.entity.Traveller;
import lombok.Data;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Data
public class TravellerResponse {

    private int id;
    private float distance;
    private String date;

    public TravellerResponse(Traveller traveller) {


        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        this.id = traveller.getId();
        this.distance = traveller.getDistance();
        this.date = dateFormat.format(traveller.getDate());
    }
}
