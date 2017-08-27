package example;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by 84842 on 2017/8/27.
 */
public class ReservationTest {
//    @Test
//    public void GIVEN_场地可用_WHEN_用户预订场地_THEN_预订成功() {
//        Court court = new Court();
//        court.updateState(true);
//
//        Player player = new Player();
//
//        ReservationService reservationService = new ReservationService();
//        boolean result = reservationService.book(player, court);
//
//        assertEquals(true, result);
//    }

//    @Test
//    public void GIVEN_场地不可用_WHEN_用户预订场地_THEN_预订失败() {
//        Court court = new Court();
//        court.updateState(false);
//
//        Player player = new Player();
//
//        ReservationService reservationService = new ReservationService();
//        boolean result = reservationService.book(player, court);
//
//        assertEquals(false, result);
//    }

//    @Test
//    public void GIVEN_场地_1_可用_WHEN_用户预订场地_1_THEN_预订成功() {
//        Court court = new Court();
//        court.setName("场地1");
//        court.updateState(true);
//
//        Player player = new Player();
//
//        ReservationService reservationService = new ReservationService();
//        boolean result = reservationService.book(player, court);
//
//        assertEquals(true, result);
//    }

    @Test
    public void GIVEN_场地1_10_11_可用_WHEN_用户预订场地1_时间10_11_THEN_预订成功() {
        Court court = new Court();
        court.setName("场地1");
        court.updateState(10, 11, true);

        Player player = new Player();

        ReservationService reservationService = new ReservationService();
        boolean result = reservationService.book(player, court, 10, 11);

        assertEquals(true, result);
    }

    @Test
    public void GIVEN_场地1_10_11_不可用_WHEN_用户预订场地1_时间10_11_THEN_预订不成功() {
        Court court = new Court();
        court.setName("场地1");
        court.updateState(10, 11, false);

        Player player = new Player();

        ReservationService reservationService = new ReservationService();
        boolean result = reservationService.book(player, court, 10, 11);

        assertEquals(false, result);
    }

    @Test
    public void GIVEN_场地1_9_10_可用_10_11_不可用_WHEN_用户预订场地1_时间9_10_THEN_预订成功() {
        Court court = new Court();
        court.setName("场地1");
        court.updateState(9, 10, true);
        court.updateState(10, 11, false);

        Player player = new Player();

        ReservationService reservationService = new ReservationService();
        boolean result = reservationService.book(player, court, 9, 10);

        assertEquals(true, result);
    }
}
