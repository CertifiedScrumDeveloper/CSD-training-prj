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

    public boolean makeReservation(Integer date,Integer time, String name) {
        if (courtOrder[date][time] == 1) return false;
        else {
            courtOrder[date][time] = 1;
            courtOrderNameMap.put(date*10+time, name);
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
