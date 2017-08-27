package tennis;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by linyan on 27/08/2017.
 */
public class PlayerTest {

    @Test
    public void WHEN_a_new_premiun_player_THEN_get_it(){

        Player player = new Player(1, "PlayerA", true);
        Assert.assertEquals(1, player.getId());
        Assert.assertEquals("PlayerA", player.getName());
        Assert.assertEquals(true, player.isPremiun());

    }

    @Test
    public void GIVEN_Normal_Player_WHEN_reserve_Available_count_THEN_should_return_Success(){
        Player player = new Player(1, "PlayerA", false);
        Court courtA = new Court(1,"CourtA",new Position(35,35));
        Reservation res = new Reservation(courtA, "2017-8-8, 12:00", true);

        boolean result = player.reserve(res);

        Assert.assertEquals(true, result);
    }

    @Test
    public void GIVEN_Normal_Player_WHEN_reserve_Available_count_THEN_the_court_unavailable(){
        Player player = new Player(1, "PlayerA", false);
        Court courtA = new Court(1,"CourtA",new Position(35,35));
        Reservation res = new Reservation(courtA, "2017-8-8, 12:00", true);

        boolean result = player.reserve(res);

        if(result)
            Assert.assertEquals(false, res.isAvailable());
        else
            Assert.assertEquals(true, res.isAvailable());
    }

    @Test
    public void GIVEN_new_a_normal_player_WHEN_get_position_35_35_THEN_the_position_should_be_35_35(){
        Player player = new Player(1, "PlayerA", false);
        Position currentPosition = player.getCurrentPosition();
        Assert.assertEquals(35, currentPosition.getLatitude());
        Assert.assertEquals(35, currentPosition.getLongtitude());
    }

    @Test
    public void GIVEN_a_Normal_Player_35_35_And_A_Court_40_35_THEN_Distance_should_be_5(){

        Player player = new Player(1, "PlayerA", false);
        player.getCurrentPosition();

        Court court = new Court(1,"CourtA",new Position(40,35));
        double distance = player.calculateDistance(court.getCourtPosition());

        Assert.assertEquals(5, distance, 0);

    }

    @Test
    public void GIVEN_normal_player_And_2_courts_WHEN_find_THEN_list_all_available_court(){
        Player player = new Player(1, "PlayerA", false);
        Court courtA = new Court(1,"CourtA",new Position(40,35));
        Court courtB = new Court(1,"CourtB",new Position(50,35));

        List<Reservation> reservationList = Arrays.asList(
                new Reservation(courtA, "2017-8-8, 12:00", true),
                new Reservation(courtA, "2017-8-8, 14:00", true),
                new Reservation(courtA, "2017-8-8, 16:00", false),
                new Reservation(courtB, "2017-8-8, 14:00", true),
                new Reservation(courtB, "2017-8-8, 16:00", true),
                new Reservation(courtB, "2017-8-8, 18:00", true)
                );

        Map<Double, List<Reservation>> reservationMap = new HashMap<Double, List<Reservation>>();
        for(int i=0; i<reservationList.size(); i++){
            Reservation currentReservation = reservationList.get(i);
            double distance = player.calculateDistance(currentReservation.getCourt().getCourtPosition());
            if(reservationMap.containsKey(distance)){
                if(currentReservation.isAvailable())
                    reservationMap.get(distance).add(currentReservation);
            }
            else{
                List<Reservation> reservations = new ArrayList<Reservation>();
                if(currentReservation.isAvailable())
                    reservations.add(currentReservation);
                reservationMap.put(distance, reservations);
            }
        }

        Assert.assertEquals(2, reservationMap.get(5.0).size());
        Assert.assertEquals(3, reservationMap.get(15.0).size());

    }




}
