package com.vishal.sociopool.view;

import com.vishal.sociopool.entity.Traveller;
import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class TravellerRequest {

    private int id;
    private float distance;
    private String date;


    public Traveller toEntity(Traveller traveller) throws ParseException {
        if(traveller == null){
            traveller = new Traveller();
        }

        Date convertDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(this.date);

        traveller.setId(this.id);
        traveller.setDistance(this.distance);
        traveller.setDate(convertDate);

        return traveller;
    }
}
