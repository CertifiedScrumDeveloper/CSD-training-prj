package example;

import static org.junit.Assert.*;

import org.junit.Test;
import sun.util.calendar.BaseCalendar;

import java.util.Date;

import static org.junit.Assert.*;

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

        //then
        assertEquals("C1," + date.toString(), player.getReserve());

    }

}