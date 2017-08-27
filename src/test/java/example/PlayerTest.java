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
    public void 根据位置5获取位置差最小的场地() {

        //Given
        Court courtA = new Court("A");
        courtA.set_position(1);
        Court courtB = new Court("B");
        courtA.set_position(2);
        Court courtC = new Court("C");
        courtA.set_position(3);
        Court courtD = new Court("D");
        courtA.set_position(4);
        Court courtE = new Court("E");
        courtA.set_position(6);
        CourtRepo.clear();
        CourtRepo.add(courtA);
        CourtRepo.add(courtB);
        CourtRepo.add(courtC);
        CourtRepo.add(courtD);
        CourtRepo.add(courtE);

        // When
        Court court = CourtRepo.getNearest(5);

        // THEN
        assertEquals(courtD.getId(), court.getId());

        // When
        court = CourtRepo.getNearest(3);

        // THEN
        assertEquals(courtB.getId(), court.getId());
    }


    @Test
    public void 根据用户选择的位置获取最近的位置() {

        //Given
        Player player = new Player("jack");
        Court courtA = new Court("A");
        courtA.set_position(1);
        Court courtB = new Court("B");
        courtA.set_position(2);
        Court courtC = new Court("C");
        courtA.set_position(3);
        Court courtD = new Court("D");
        courtA.set_position(4);
        Court courtE = new Court("E");
        courtA.set_position(6);
        CourtRepo.clear();
        CourtRepo.add(courtA);
        CourtRepo.add(courtB);
        CourtRepo.add(courtC);
        CourtRepo.add(courtD);
        CourtRepo.add(courtE);

        // When
        Court court = player.findNearestCourt(5);

        // THEN
        assertEquals(courtD.getId(), court.getId());

        // When
        player.findNearestCourt(3);

        // THEN
        assertEquals(courtB.getId(), court.getId());
    }

}