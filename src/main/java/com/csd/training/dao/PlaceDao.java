package com.csd.training.dao;

import com.csd.training.entity.Place;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanli on 2017/8/27.
 */
public class PlaceDao {

    List<Place> placeList = new ArrayList<Place>();

    public PlaceDao(){
        createPlaceList();
    }

    private void createPlaceList(){
        Place place = new Place();
        place.setId(1);
        place.setName("场地1");
        place.setCourtId(1);
        place.setUnitPrice(10.0);
    }

    public Place getPlaceById(Integer id){

        for(Place place : placeList){

            if(id.equals(place.getId())){

                return place;
            }
        }
        return  new Place();
    }
}
