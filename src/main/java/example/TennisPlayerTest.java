package example;

import org.junit.*;

/**
 * Created by liusteven on 17/8/27.
 */
public class TennisPlayerTest {

    @Test
    public void 预订0号场地826日期1时段登记名为steve应返回true() {
        CourtManager courtManager = new CourtManager();
        Assert.assertEquals(true,courtManager.makeReservation(new Reservation(826,1,0,"steve")));
    }

    @Test
    public void 当steve预订了0号场地0826日期1时段后bob再预订这个场地同时间时返回false() {
        CourtManager courtManager = new CourtManager();
        courtManager.makeReservation(new Reservation(826,1,0,"steve"));
        Assert.assertEquals(false,courtManager.makeReservation(new Reservation(826,1,0,"bob")));
    }

    @Test
    public void 查询0号场地0826的可用时间() {
        CourtManager courtManager = new CourtManager();
        Assert.assertArrayEquals(new Integer[]{0,1,2,3,4,5,6,7},courtManager.getAvailableCourts(826,0).toArray());
    }

    @Test
    public void 当steve订掉0号场地的1时段后查询0826可用时间() {
        CourtManager courtManager = new CourtManager();
        courtManager.makeReservation(new Reservation(826,1,0,"steve"));
        Assert.assertArrayEquals(new Integer[]{0,2,3,4,5,6,7},courtManager.getAvailableCourts(826,0).toArray());
    }

    @Test
    public void 位置为5查找最近的场地应返回5() {
        CourtManager courtManager = new CourtManager();
        Assert.assertEquals(5,courtManager.getNearestCourt(5));
    }

    @Test
    public void 位置为负5查找最近的场地应返回0() {
        CourtManager courtManager = new CourtManager();
        Assert.assertEquals(0,courtManager.getNearestCourt(-5));
    }
}
