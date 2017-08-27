package example;

import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

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
        // Court court = new Court("C1");
        Date date = new Date();
        Reservation reservation = player.reserve("C1", date, 3);

        //then
        assertEquals("C1", reservation.getCourtId());
        assertEquals("jack", reservation.getPlayerName());
        assertEquals(date, reservation.getDate());
        assertEquals(3, reservation.getDuration());

    }

    @Test
    public void 当用户预订成功后预订库可以查到信息()
    {
        //given
        Player player = new Player("jack");

        //when
        Date date = new Date();
        player.reserve("C1", date, 3);
        List<Reservation> reservation = ReservationRepo.getAll();
        //then
        boolean reservaFlag = false;
        for (int i = 0; i < reservation.size(); i++) {
            if ("jack".equals(reservation.get(i).getPlayerName())) {
                reservaFlag = true;
            }
        }
        assertEquals(true, reservaFlag);
    }


    @Test
    public void 根据用户选择的位置获取最近的位置() {

        //given
        int position = 5;

        //when
        String courntId = CourtRepo.getNearest(position).getId();

        //then
        assertEquals("C5", courntId);
    }

}