package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liusteven on 17/8/27.
 */
public class CourtManager {

    private int[][] courtOrder = new int[10000][8];

    private Map<Integer, String> courtOrderNameMap = new HashMap<Integer, String>();

    public boolean makeReservation(Reservation reservation) {
        int date = reservation.getDate();
        int slot = reservation.getSlot();
        String name = reservation.getName();
        if (courtOrder[date][slot] == 1) return false;
        else {
            courtOrder[date][slot] = 1;
            int key = date*10+slot;
            courtOrderNameMap.put(key, name);
        }
        return true;
    }

    public List<Integer> getAvailableCourts(Integer date) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            if(courtOrder[date][i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
