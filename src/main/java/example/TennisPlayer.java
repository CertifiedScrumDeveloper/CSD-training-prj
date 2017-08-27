package example;


/**
 * Created by liusteven on 17/8/27.
 */
public class TennisPlayer {

    String name;
    Integer position;

    public TennisPlayer(String name) {
        this.name = name;
    }

    public TennisPlayer(String name,Integer position) {
        this.name = name;
        this.position = position;
    }

    public boolean makeReservation(Reservation reservation) {
        int date = reservation.getDate();
        int slot = reservation.getSlot();
        int courtNo = reservation.getCourtNo();

        boolean ava= CourtData.query(date,slot,courtNo);
        if (!ava) return false;
        CourtData.courtOrder[courtNo][date][slot] = 1;
        int key = date * 10 + slot; //生成存储courtOrderNameMap的key
        CourtData.courtOrderNameMap.put(key, name);
        return true;
    }

    public boolean makeRecurringReservation(Reservation reservation, int period, int times) {
        int date = reservation.getDate();
        int slot = reservation.getSlot();
        int courtNo = reservation.getCourtNo();
        for (int i = 0; i < times; i++) {
            if (!CourtData.query(date,slot,courtNo)) return false;
            date += period;
        }

        for (int i = 0; i < times; i++) {
            makeReservation(reservation);
            reservation.setDate(reservation.getDate()+period);
        }
        return true;
    }

    final int maxDistance = 1000;

    public int getNearestCourt() {
        int minDistance = maxDistance;
        int nearestCourtNo = 0;
        for (int i = 0; i < CourtData.courtNum; i++) {
            int distance = Math.abs(position - i);
            if (distance <= minDistance) {
                minDistance = distance;
                nearestCourtNo = i;
            }
        }
        return nearestCourtNo;
    }
}
