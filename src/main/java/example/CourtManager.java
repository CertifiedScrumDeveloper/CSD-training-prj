package example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liusteven on 17/8/27.
 */
public class CourtManager {


    public List<Integer> getAvailableCourts(Integer date, Integer courtNo) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < CourtData.slotNum; i++) {
            if (CourtData.courtOrder[courtNo][date][i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

}
