package example;

import org.junit.*;

/**
 * Created by liusteven on 17/8/27.
 */
public class TennisPlayerTest {

    @Test
    public void 预订0号场地826日期1时段登记名为steve应返回true() {
        TennisPlayer steve = new TennisPlayer("steve");
        Assert.assertEquals(true,steve.makeReservation(new Reservation(826,1,0)));
        CourtData.clear();
    }

    @Test
    public void 当steve预订了0号场地826日期1时段后bob再预订这个场地同时间时返回false() {
        TennisPlayer steve = new TennisPlayer("steve");
        TennisPlayer bob = new TennisPlayer("bob");
        steve.makeReservation(new Reservation(826,1,0));
        Assert.assertEquals(false,bob.makeReservation(new Reservation(826,1,0)));
        CourtData.clear();
    }

    @Test
    public void 查询0号场地826日期的可用时间() {
        CourtManager courtManager = new CourtManager();
        Assert.assertArrayEquals(new Integer[]{0,1,2,3,4,5,6,7},courtManager.getAvailableCourts(826,0).toArray());
        CourtData.clear();
    }

    @Test
    public void 当steve订掉0号场地的1时段后查询826日期可用时间() {
        TennisPlayer steve = new TennisPlayer("steve");
        steve.makeReservation(new Reservation(826,1,0));
        CourtManager courtManager = new CourtManager();
        Assert.assertArrayEquals(new Integer[]{0,2,3,4,5,6,7},courtManager.getAvailableCourts(826,0).toArray());
        CourtData.clear();
    }

    @Test
    public void 位置为5查找最近的场地应返回5() {
        TennisPlayer steve = new TennisPlayer("steve",5);
        Assert.assertEquals(5,steve.getNearestCourt());
        CourtData.clear();
    }

    @Test
    public void 位置为负5查找最近的场地应返回0() {
        TennisPlayer steve = new TennisPlayer("steve",-5);
        Assert.assertEquals(0,steve.getNearestCourt());
        CourtData.clear();
    }

    @Test
    public void 周期性预订826日期起1时段0号球场每隔7天预订一次共预订3次() {
        TennisPlayer steve = new TennisPlayer("steve");
        Assert.assertEquals(true,steve.makeRecurringReservation(new Reservation(826,1,0),7,3));
        CourtData.clear();
    }

    @Test
    public void 当steve订走了833日期同时间的同场地_bob的826日期起的3次同时间同场地的周期性预订因为中间被占返回false() {
        TennisPlayer steve = new TennisPlayer("steve");
        TennisPlayer bob = new TennisPlayer("bob");
        steve.makeReservation(new Reservation(833,1,0));
        Assert.assertEquals(false,bob.makeRecurringReservation(new Reservation(826,1,0),7,3));
        CourtData.clear();
    }
}
