package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhenghp on 2017/8/27.
 */
public class ReservationRepo {
    private static ArrayList<Reservation> list = new ArrayList<Reservation>();
    public  static  List<Reservation> getAll(){
        return list;
    }

    public static void add(Reservation reservation) {
        list.add(reservation);
    }

    public static Reservation getById(Long id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
              return list.get(i);
            }
        }
        return null;
    }
}

