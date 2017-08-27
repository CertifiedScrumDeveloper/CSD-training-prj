package com.csd.training;

import com.csd.training.entity.Court;
import com.csd.training.entity.Place;
import com.csd.training.entity.Player;
import com.csd.training.entity.Reservation;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hanli on 2017/8/27.
 */
public class ReservationTest {

    @Test
    public void GIVEN_player_and_place_WHEN_can_user_place_THEN_success(){
        Reservation reservation = new Reservation();
        Player player = createPlayer();
        Court court = createCourt();
        Place place  = createPlace(court);
        assertEquals("success", reservation.reservationPlace(player,place,1,3));
    }

    @Test
    public void GIVEN_player_and_place_WHEN_can_not_user_place_THEN_fail(){
        Reservation reservation = new Reservation();
        Player player = createPlayer();
        Court court = createCourt();
        Place place  = createPlace(court);
        reservation.reservationPlace(player,place,1,3);
        assertEquals("fail", reservation.reservationPlace(player,place,1,3));
    }

    @Test
    public void GIVEN_player_position_WHEN_get_nearest_court_THEN_return_court(){
        Reservation reservation = new Reservation();
        Court court = reservation.getNearestCourt(100,100);
        assertEquals("场馆A", court.getName());
    }

    private Player createPlayer(){
        Player player = new Player();
        return player;
    }

    private Court createCourt(){
        Court count = new Court();
        count.setId(1);
        count.setName("场馆1");
        count.setLatitude(100.0);
        count.setLongitude(100.0);
        return count;
    }

    private Place createPlace(Court court){
        Place place = new Place();
        place.setId(1);
        place.setName("场地1");
        place.setCourtId(1);
        place.setUnitPrice(10.0);
        place.setCourtId(court.getId());
        return place;
    }

}