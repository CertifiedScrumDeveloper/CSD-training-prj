package com.csd.training.entity;

import com.csd.training.dao.PlaceDao;

import java.util.Date;

/**
 * Created by hanli on 2017/8/27.
 */
public class Reservation {

    public String reservationPlace(Player player, Place place, Integer start, Integer end) {
        boolean[] reverseTimeArray = place.getReverseTimeArray();
        for(Integer i = start; i<= end; i++){
            if(reverseTimeArray[i]){
                return "fail";
            }
            reverseTimeArray[i] = true;
        }
        place.setReverseTimeArray(reverseTimeArray);
        return "success";
    }
}
