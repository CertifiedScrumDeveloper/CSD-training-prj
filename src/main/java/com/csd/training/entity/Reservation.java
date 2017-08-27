package com.csd.training.entity;

import java.util.ArrayList;
import java.util.List;

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

    public Court getNearestCourt(double longitude,double latitude){
        List<Court> courtList = getCourtList();
        double currentDistance = Double.MAX_VALUE;
        Court nearestCourt = new Court();
        for(Court court : courtList){
            double distance = calcDistance(longitude,latitude,court.getLongitude(),court.getLatitude());
            if(distance < currentDistance){
                currentDistance = distance;
                nearestCourt = court;
            }
        }
        return nearestCourt;
    }

    public double calcDistance(double playerX,double playerY,double courtX,double courtY){
       return Math.sqrt(Math.pow(playerX-courtX,2) + Math.pow(playerY-courtY, 2));
    }

    public List<Court> getCourtList(){
        List<Court> courtList = new ArrayList<Court>();
        Court countA = new Court();
        countA.setId(1);
        countA.setName("场馆A");
        countA.setLatitude(101.0);
        countA.setLongitude(102.0);

        courtList.add(countA);

        Court countB = new Court();
        countB.setId(1);
        countB.setName("场馆B");
        countB.setLatitude(200.0);
        countB.setLongitude(200.0);

        courtList.add(countB);

        Court countC = new Court();
        countC.setId(1);
        countC.setName("场馆C");
        countC.setLatitude(500.0);
        countC.setLongitude(500.0);

        courtList.add(countC);

        return courtList;
    }
}
