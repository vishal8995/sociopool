package com.vishal.sociopool.service;

import com.querydsl.jpa.impl.JPAQuery;
import com.vishal.sociopool.entity.QTraveller;
import com.vishal.sociopool.entity.Traveller;
import com.vishal.sociopool.repository.TravellerRepository;
import com.vishal.sociopool.view.FetchTravelledDistanceRequest;
import com.vishal.sociopool.view.FetchTravelledDistanceResponse;
import com.vishal.sociopool.view.TravellerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.text.ParseException;

@Service
public class TravellerService {

    @Autowired
    private TravellerRepository travellerRepository;

    @Autowired
    private EntityManager entityManager;

    public Traveller saveTraveller(TravellerRequest travellerRequest) throws ParseException {

        Traveller entity = travellerRequest.toEntity(new Traveller());
        return travellerRepository.save(entity);
    }

    public FetchTravelledDistanceResponse getTravelledDistance (FetchTravelledDistanceRequest fetchTravelledDistanceRequest) throws ParseException {

        JPAQuery<Traveller> query = new JPAQuery<>(entityManager);
        QTraveller traveller = QTraveller.traveller;

        Float distance = query.select(traveller.distance).from(traveller)
                .where(traveller.id.eq(fetchTravelledDistanceRequest.getId()))
                .where(traveller.date.between(fetchTravelledDistanceRequest.getStartTimeDate(),
                        fetchTravelledDistanceRequest.getEndTimeDate()))
                .fetchOne();

        return new FetchTravelledDistanceResponse(fetchTravelledDistanceRequest, distance);
    }
}
