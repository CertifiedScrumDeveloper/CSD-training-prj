package example;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Date;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class PlayerTest {
    @Test
    public void GIVEN_new_player_WHEN_RESERVE_a_court_THEN_reserve_should_be_commint()

    {
        //given
        Player player = new Player("jack");

        //when
        Court court = new Court("C1");
        Date date = new Date();
        player.reserve(court, date);
        Reservation reservation=  player.getReservation();

        //then
        assertEquals("C1", reservation.getCourtId());
        assertEquals("jack", reservation.getPlayerName());
        assertEquals(date,reservation.getDate());
    }

}