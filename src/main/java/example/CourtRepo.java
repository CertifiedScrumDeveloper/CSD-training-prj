package example;

import example.Court;
import example.Reservation;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class CourtRepo {
    static List<Court> list = Arrays.asList(new Court("C1"),new Court("C2"));

    public static Court getNearest(int position) {
        return new Court("C5");
    }
}
