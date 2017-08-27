package example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liusteven on 17/8/27.
 */
public class CourtManager {

    private int courtNum = 10;

    private int[][][] courtOrder = new int[10][10000][8];

    private Map<Integer, String> courtOrderNameMap = new HashMap<Integer, String>();

    public boolean makeReservation(Reservation reservation) {
        int date = reservation.getDate();
        int slot = reservation.getSlot();
        int courtNo = reservation.getCourtNo();

        boolean ava= query(date,slot,courtNo);
        if (!ava) return false;

        String name = reservation.getName();
        courtOrder[courtNo][date][slot] = 1;
        int key = date * 10 + slot;
        courtOrderNameMap.put(key, name);
        return true;
    }

    private boolean query(int date, int slot, int courtNo) {
        return courtOrder[courtNo][date][slot] == 0;
    }


    public List<Integer> getAvailableCourts(Integer date, Integer courtNo) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 8; i++) {
            if (courtOrder[courtNo][date][i] == 0) {
                list.add(i);
            }
        }
        return list;
    }

    final int maxDistance = 1000;

    public int getNearestCourt(int position) {
        int minDistance = maxDistance;
        int nearestCourtNo = 0;
        for (int i = 0; i < courtNum; i++) {
            int distance = Math.abs(position - i);
            if (distance <= minDistance) {
                minDistance = distance;
                nearestCourtNo = i;
            }
        }
        return nearestCourtNo;
    }

    public boolean makeRecurringReservation(Reservation reservation, int period, int times) {
        int date = reservation.getDate();
        int slot = reservation.getSlot();
        int courtNo = reservation.getCourtNo();
        for (int i = 0; i < times; i++) {
            if (!query(date,slot,courtNo)) return false;
            date += period;
        }

        for (int i = 0; i < times; i++) {
            makeReservation(reservation);
            reservation.setDate(reservation.getDate()+period);
        }
        return true;
    }
}
