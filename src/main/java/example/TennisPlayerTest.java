package example;

import org.junit.*;

/**
 * Created by liusteven on 17/8/27.
 */
public class TennisPlayerTest {

    @Test
    public void GIVEN_TP_WHEN_make_reservation_now_THEN_RETURN_true() {
        CourtManager courtManager = new CourtManager();
        Assert.assertEquals(true,courtManager.makeReservation(new Reservation(826,1,0,"steve")));
    }

    @Test
    public void GIVEN_TP_WHEN_make_reservation_unavailable_date_THEN_RETURN_false() {
        CourtManager courtManager = new CourtManager();
        courtManager.makeReservation(new Reservation(826,1,0,"steve"));
        Assert.assertEquals(false,courtManager.makeReservation(new Reservation(826,1,0,"bob")));
    }

    @Test
    public void 查询可用时间() {
        CourtManager courtManager = new CourtManager();
        Assert.assertArrayEquals(new Integer[]{0,1,2,3,4,5,6,7},courtManager.getAvailableCourts(826).toArray());
    }

    @Test
    public void 查询steve订掉1后的可用时间() {
        CourtManager courtManager = new CourtManager();
        courtManager.makeReservation(new Reservation(826,1,0,"steve"));
        Assert.assertArrayEquals(new Integer[]{0,2,3,4,5,6,7},courtManager.getAvailableCourts(826).toArray());
    }
}
